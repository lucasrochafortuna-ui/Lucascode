package jantarfilósofos;

import java.util.Random;
import java.util.concurrent.locks.Lock; 

public class Filosofo implements Runnable {
	public static final String RESET = "\u001B[0m";
	public static final String VERMELHO = "\u001B[31m";
	public static final String VERDE = "\u001B[32m";
	public static final String CIANO = "\u001B[36m";
	public static final String AMARELO = "\u001B[33m";

	private final int id;
	private final Lock garfoEsquerdo;
	private final Lock garfoDireito;
	private final Random random = new Random();
	private int refeicoes = 0;
	private int pensando = 0;
	// Construtor: recebe o ID do filósofo e a referência dos dois garfos ao seu
	// lado

	public Filosofo(int id, Lock garfoEsquerdo, Lock garfoDireito) {
		this.id = id;
		this.garfoEsquerdo = garfoEsquerdo;
		this.garfoDireito = garfoDireito;

	}
	// Simula o tempo que o filósofo passa pensando

	private void pensar() throws InterruptedException {
		pensando++;
		System.out.println(CIANO + "Filósofo " + id + AMARELO + " está pensando... (#" + pensando + ")" + RESET);
		int tempoPensando = 200 + random.nextInt(400);// Sorteia entre 0 e 999 ms
		Thread.sleep(tempoPensando);

	}
	// Simula o tempo que o filósofo passa comendo

	private void comer() throws InterruptedException {
		refeicoes++;
		System.out.println(">>>" + CIANO + "Filósofo " + id + VERDE + " COMEÇOU A COMER! (Refeição #" + refeicoes + ")"
				+ RESET + "<<<");
		int tempoComendo = 400 + random.nextInt(200);
		Thread.sleep(tempoComendo);

	}

	public int getPensando() {
		return pensando;
	}

	public int getRefeicoes() {
		return refeicoes;
	}

	@Override
	public void run() {
		try {
			while (true) {
				pensar(); // Pensa por um tempo aleatório

				// O 1º garfo é SEMPRE o esquerdo, e o 2º é SEMPRE o direito
				Lock primeiroGarfo;
				Lock segundoGarfo;
				if (random.nextBoolean()) {
					primeiroGarfo = garfoEsquerdo;
					segundoGarfo = garfoDireito;
				} else {
					primeiroGarfo = garfoDireito;
					segundoGarfo = garfoEsquerdo;
				}
				
				// 1. Tenta pegar o garfo ESQUERDO primeiro
				if (primeiroGarfo.tryLock()) {
					System.out.println(CIANO + "Filósofo " + id + " pegou o 1º garfo." + RESET);

					try {
						// 2. Tenta pegar o garfo DIREITO em seguida
						if (segundoGarfo.tryLock()) {
							System.out.println(CIANO + "Filósofo " + id + " pegou o 2º garfo." + RESET);

							try {
								comer(); // Pegou ambos, agora come!
							} finally {
								segundoGarfo.unlock();
								System.out.println("Filósofo " + id + " soltou o 2° garfo.");
							}
						} else {
							System.out.println(VERMELHO + "Filósofo " + id
									+ " não achou o 2° garfo livre e vai soltar o 1° garfo." + RESET);
							// Backoff aleatório para desincronizar as threads (evita Livelock)
							Thread.sleep(random.nextInt(100));
						}
					} finally {
						primeiroGarfo.unlock();
						System.out.println("Filósofo " + id + " soltou o 1° garfo.");
					}
				} else {
					System.out.println(
							VERMELHO + "Filósofo " + id + " não conseguiu o 1° garfo e voltou a pensar." + RESET);
					// Backoff aleatório para desincronizar as threads (evita Livelock)
					Thread.sleep(random.nextInt(100));
				}
			}
		} catch (InterruptedException e) {
			System.out.println(VERMELHO + "Filósofo " + id + " foi interrompido" + RESET);
			Thread.currentThread().interrupt();
		}
	}
}

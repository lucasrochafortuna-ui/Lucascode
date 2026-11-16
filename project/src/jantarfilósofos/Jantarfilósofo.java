package jantarfilósofos;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Jantarfilósofo {
	
	public static final String RESET = "\u001B[0m";
	public static final String CIANO = "\u001B[36m";
	public static final String VERDE = "\u001B[32m";
	public static final String ROXO = "\u001B[35m";
	public static final String VERMELHO = "\u001B[31m";
	public static final String AMARELO = "\u001B[33m";
	
	public static void main(String[] args) {
		int numFilosofos = 10;

		Lock[] garfos = new ReentrantLock[numFilosofos];
		for (int i = 0; i < numFilosofos; i++) {
			garfos[i] = new ReentrantLock();
		}

		Filosofo[] filosofos = new Filosofo[numFilosofos];
		Thread[] threads = new Thread[numFilosofos];

		System.out.println(VERDE + "=== INICIANDO O JANTAR DOS FILÓSOFOS ===" + RESET);
		System.out.println("");

		for (int i = 0; i < numFilosofos; i++) {
			Lock garfoEsquerdo = garfos[i];
			Lock garfoDireito = garfos[(i + 1) % numFilosofos];

			filosofos[i] = new Filosofo(i, garfoEsquerdo, garfoDireito);
			threads[i] = new Thread(filosofos[i], "Filósofo-" + i);

			// Threads normais para encerramento
			threads[i].start();
		}

		// Aguarda 15 segundos
		try {
			Thread.sleep(180000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 1. Interrompe todas as threads para saírem dos seus loops/sleeps
		for (Thread t : threads) {
			t.interrupt();
		}

		// 2. Aguarda a finalização limpa de cada thread antes de prosseguir
		for (Thread t : threads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// 3. Imprime o encerramento garantindo que nenhuma thread está rodando
		System.out.println(VERMELHO + "\n=======================================");
		System.out.println("=== TEMPO ESGOTADO (15 SEGUNDOS) ===");
		System.out.println("=======================================" + RESET);

		System.out.println(VERDE + "\n--- PLACAR FINAL DE REFEIÇÕES ---" + RESET);
		for (int i = 0; i < numFilosofos; i++) {
			System.out.println(CIANO + "Filósofo " + ROXO + (i + 1) + VERDE + " comeu " + filosofos[i].getRefeicoes()
					+ " vezes e" + AMARELO + " pensou " + filosofos[i].getPensando() + " vezes" + RESET);
		}

	}

}

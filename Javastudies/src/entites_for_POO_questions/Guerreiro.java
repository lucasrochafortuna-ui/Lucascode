package entites_for_POO_questions;

public class Guerreiro extends Personagem{
	public Guerreiro(String nome, int vidaAtual, int vidaMaxima, int forca, int defesa) {
		super(nome, vidaAtual, vidaMaxima, forca, defesa);
	}
	
	public int bonusArma() {
		return forca + forca;
	}
	
	public int atacar(Personagem nome) {
		if (estaVivo()) {
			int dano = bonusArma();
			System.out.println("Quantidade de dano: " + dano);
			return nome.receberDano(dano);
		} 
		System.out.println("Guerreiro morreu e não pode atacar");
		return 0;
	}
	
	public void exibirStatus() {
		super.exibirStatus();
	}
}

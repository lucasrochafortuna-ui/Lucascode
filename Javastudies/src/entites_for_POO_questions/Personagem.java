package entites_for_POO_questions;

public class Personagem {
	protected String nome;
	protected int vidaAtual;
	protected int vidaMaxima;
	protected int forca;
	protected int defesa;
	public Personagem(String nome, int vidaAtual, int vidaMaxima, int forca, int defesa) {
		this.nome = nome;
		this.vidaAtual = vidaAtual;
		this.vidaMaxima = vidaMaxima;
		this.forca = forca;
		this.defesa = defesa;
	}
	public void exibirStatus() {
		System.out.println("O nome do personagem é: " + this.nome + "\nA vida máxima do personagem é: " + this.vidaMaxima + "\nA vida autual do personagem é: " + this.vidaAtual + "\nA força do personagem é: " + this.forca + "\nA defesa do personagem é: " + this.defesa);
	}
	
	public boolean estaVivo() {
		if (this.vidaAtual > 0) {
			return true;
		} 
		return false;
	}
	
	public int receberDano(int dano) {
		int danoReal = dano - defesa;
		if (danoReal > 0) {
	        vidaAtual = Math.max(0, vidaAtual - danoReal);
	    }
		return this.vidaAtual;
	}
	
	
}

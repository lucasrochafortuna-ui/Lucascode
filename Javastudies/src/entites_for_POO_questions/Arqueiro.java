package entites_for_POO_questions;

public class Arqueiro extends Personagem{
	private int quantidadeFlechas;
	private int bonusPrecisao = 5;
	
	public Arqueiro(String nome, int vidaAtual, int vidaMaxima, int forca, int defesa) {
		super(nome, vidaAtual, vidaMaxima, forca, defesa);
	}
	
	
	
	public int getQuantidadeFlechas() {
		return quantidadeFlechas;
	}



	public void setQuantidadeFlechas(int quantidadeFlechas) {
		this.quantidadeFlechas = quantidadeFlechas;
	}



	public int getBonusPrecisao() {
		return bonusPrecisao;
	}



	public void setBonusPrecisao(int bonusPrecisao) {
		this.bonusPrecisao = bonusPrecisao;
	}



	public int atacar(Personagem nome) {
		if (this.quantidadeFlechas > 0 && estaVivo()) {
			int dano = forca + bonusPrecisao;
			quantidadeFlechas--;
			System.out.println("Quantidade de dano: " + dano);
			return nome.receberDano(dano);
		} else if(this.quantidadeFlechas <= 0 && estaVivo()) {
			System.out.println("Flechas estão esgotadas");
			return 0;
		}
		System.out.println("Arqueiro morreu e não pode atacar");
		return 0;
	}
	
	public void exibirStatus() {
		super.exibirStatus();
		System.out.println("Quantidade de flechas do personagem: " + quantidadeFlechas + "\nPrecisão do personagem: " + bonusPrecisao);
	}
}

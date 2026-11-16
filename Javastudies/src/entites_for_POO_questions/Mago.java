package entites_for_POO_questions;

public class Mago extends Personagem{
	private int manaMaxima;
	private int manaAtual = 100;
	private int poderMagia;
	private int custoMagia;

	public Mago(String nome, int vidaAtual, int vidaMaxima, int forca, int defesa) {
		super(nome, vidaAtual, vidaMaxima, forca, defesa);
	}
	
	
	
	public int getManaMaxima() {
		return manaMaxima;
	}



	public void setManaMaxima(int manaMaxima) {
		this.manaMaxima = manaMaxima;
		this.manaAtual = manaMaxima;
	}



	public int getCustoMagia() {
		return custoMagia;
	}



	public void setCustoMagia(int custoMagia) {
		this.custoMagia = custoMagia;
	}



	public int getPoderMagia() {
		return poderMagia;
	}



	public void setPoderMagia(int poderMagia) {
		this.poderMagia = poderMagia;
	}



	public int atacar(Personagem nome) {
		if (manaAtual >= custoMagia && estaVivo()) {
			int dano = forca + poderMagia;
			this.manaAtual -= custoMagia;
			System.out.println("Quantidade de dano: " + dano);
			return nome.receberDano(dano);	
		} else if (manaAtual < custoMagia && estaVivo()) {
			System.out.println("Mana está esgotada");
			return 0;
		} 
		System.out.println("Mago morreu e não pode atacar");
		return 0;
	}
	
	public void exibirStatus() {
		super.exibirStatus();
		System.out.println("Quantidade de mana Maxima: " + manaMaxima + "\nQuantidade de mana atual: " + manaAtual + "\nCusto de mana para ataque: " + custoMagia);
	}
}

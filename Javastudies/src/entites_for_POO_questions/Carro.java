package entites_for_POO_questions;

public class Carro extends Veiculo{
	private int quantidadeDePortas;
	public Carro(String marca, String modelo, int ano, int quantidadeDePortas) {
		super(marca, modelo, ano);
		this.quantidadeDePortas = quantidadeDePortas;
	}
	public int getQuantidadeDePortas() {
		return quantidadeDePortas;
	}
	public void setQuantidadeDePortas(int quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}
	public double quantidadeVeiculos(double number) {
		System.out.println("Quantidade de portas: " + quantidadeDePortas);
		return number;
	}
}
 
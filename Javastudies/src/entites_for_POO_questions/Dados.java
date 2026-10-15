package entites_for_POO_questions;

public class Dados {
	private double altura;
	private char sexo;
	
	public Dados(double altura, char sexo) {
		this.altura = altura;
		this.sexo = sexo;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double mediaAltura(double media, int mulheres) {
		return media / mulheres;
	}
}

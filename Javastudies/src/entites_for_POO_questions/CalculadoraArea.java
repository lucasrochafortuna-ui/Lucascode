package entites_for_POO_questions;

public class CalculadoraArea {
	private double lado;
	private double altura;
	private double base;
	private boolean eCirculo;
	private double raio;
	
	public CalculadoraArea() {
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public boolean iseCirculo() {
		return eCirculo;
	}

	public void seteCirculo(boolean eCirculo) {
		this.eCirculo = eCirculo;
	}
	
	public double Calcular(double lado) {
		return Math.pow(2, lado);
	}
	public double Calcular(double base, double altura) {
		return base * altura;
	}
	public void Calcular(double raio, boolean eCirculo) {
		if (eCirculo) {
			System.out.printf("Area do circulo: %.2f%n", (raio * Math.PI));
		} else {
			System.out.println("Não é um circulo");
		}
	}
	
	
}

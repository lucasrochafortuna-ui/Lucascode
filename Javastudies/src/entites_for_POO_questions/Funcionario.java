package entites_for_POO_questions;

public class Funcionario {
	private String nome;
	protected double salarioBase;
	
	public Funcionario (String nome, double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalario() {
		return this.salarioBase;
	}
	public double reajustarSalario(double percentual) {
		return salarioBase + salarioBase * (percentual / 100) ;
	}
	public double reajustarSalario(double percentual, double bonusFixo) {
		return (salarioBase * percentual) + bonusFixo;
	}
}

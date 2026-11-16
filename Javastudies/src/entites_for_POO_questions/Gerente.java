package entites_for_POO_questions;

public class Gerente extends Funcionario {
	private double bonificacao;
	
	public Gerente(String nome, double salarioBase, double bonificacao) {
		super(nome, salarioBase);
		this.bonificacao = bonificacao;
	}
	@Override
	public double calcularSalario() {
		return salarioBase * bonificacao;
	}
	public double reajustarSalario(double percentual, double bonusFixo, double incrementoBonificacao) {
		super.reajustarSalario((salarioBase * percentual) + bonusFixo);
		this.bonificacao += incrementoBonificacao;
		
		return this.bonificacao += (salarioBase * percentual) + bonusFixo;
	}

}

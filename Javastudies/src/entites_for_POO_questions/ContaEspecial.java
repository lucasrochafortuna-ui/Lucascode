package entites_for_POO_questions;

public class ContaEspecial extends ContaBancaria{
	private double limite;
	
	public double getLimite() {
		return limite;
	}
	
	public ContaEspecial (String titular, String numeroConta, int saldo, double limite) {
		super(titular, numeroConta, saldo);
		this.limite = limite;
	}
	
	@Override
	public boolean sacar (double valor) {
		if (saldo > 0 && valor <= saldo && this.ativa == true) {
			this.saldo -= valor;
			return true;
		} else if (saldo - valor >= (this.limite)) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
}

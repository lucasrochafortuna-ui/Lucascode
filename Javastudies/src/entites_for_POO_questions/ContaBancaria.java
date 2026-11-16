package entites_for_POO_questions;

public class ContaBancaria {
	    private String titular;
	    protected double saldo;
	    private String numeroConta;
	    protected boolean ativa;
	    
	    public ContaBancaria() {
	    	this.ativa = true;
	    }
	    
		public ContaBancaria(String titular, String numeroConta, double saldo) {
			this.titular = titular;
			this.numeroConta = numeroConta;
			this.saldo = saldo;
			this();
		}

		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			if (titular == null || titular.isBlank()) {
				System.out.println("valor invalido");
			} else {
				this.titular = titular;
			}
		}

		public double getSaldo() {
			return saldo;
		}
		protected void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public boolean sacar(double valor) {
			if (saldo > 0 && valor <= saldo && this.ativa == true) {
				this.saldo -= valor;
				return true;
			} else {
				return false;
			}
		}
		
		public void depositar(double valor) {
			if (valor > 0 && this.ativa == true) {
				this.saldo += valor;
			} else {
				System.out.println("Valor invalido ou conta inativa");
			}
		}

		public String getNumeroConta() {
			return numeroConta;
		}

		public void setNumeroConta(String numeroConta) {
			this.numeroConta = numeroConta;
		}

		public boolean getAtiva() {
			return ativa;
		}

		public void setAtiva(boolean ativa) {
			this.ativa = ativa;
		}
		
		public boolean reativarConta(boolean ativa) {
			if (!ativa) {
				return this.ativa;
			}
			return this.ativa = true;
		}
		
		public boolean encerrarConta(boolean ativa) {
			if (ativa) {
				return this.ativa;
			}
			return this.ativa = false;	
		}
}
		
		


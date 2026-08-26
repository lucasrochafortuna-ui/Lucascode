package entites_for_POO_questions;

public class Monthly_fee {
	public String name;
	public int course;
	public double income;
	public double pay;
	public double percent;
	
	public Monthly_fee() {
		this("Desconhecido", 0, 0.0);
	}
	public Monthly_fee(String name, int course, double income) {
		this.name = name;
		this.course = course;
		this.income = income;
	}
	public Monthly_fee(String name, int course, double income, double pay) {
		this.name = name;
		this.course = course;
		this.income = income;
		this.pay = pay;
	}
	
	public void Curso (int course) {
		if (course == 1) {
			this.pay = 3000;
			System.out.println("Mensalidade: 3000 Reais");
		}else if(course == 2) {
			this.pay = 2500;
			System.out.println("Mnesalidade: 2500 Reais");
		}else {
			this.pay = 1700;
			System.out.println("Mnesalidade: 1700 Reais");
		}
	}
	public void Renda(double income) {
		if (this.income >= 0 && this.income <= 3000) {
			this.percent = 40;
			System.out.println("Você ganhará 40 porcento de desconto");
		}else if(this.income >= 3000.01 && this.income <= 5000) {
			this.percent = 25;
			System.out.println("Você ganhará 25 porcento de desconto");
		}else if(this.income >= 5000) {
			this.percent = 0;
			System.out.println("Você ganhará 0 porcento de desconto");
		}
	}
	public void Pagamento() {
		System.out.println("Você pagará: " + this.pay * (this.percent/100) + " Reais");
	}
	
	
	public String toString() {
		return "Nome: " + this.name + "\nCurso: " + this.course + "\nRenda: " + income;
	}
}

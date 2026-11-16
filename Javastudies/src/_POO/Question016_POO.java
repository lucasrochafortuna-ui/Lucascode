package _POO;

import entites_for_POO_questions.ContaBancaria;
import entites_for_POO_questions.ContaEspecial;

public class Question016_POO {
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("Maria Clara", "123Conta", 200);
		conta1.depositar(100);
		System.out.println(conta1.getSaldo());
		System.out.println(conta1.sacar(400));
		System.out.println(conta1.sacar(150));
		System.out.println(conta1.getSaldo());
		System.out.println("---------------------------");
		ContaEspecial conta1E = new ContaEspecial("Maria Clara", "123Conta", 200, -500);
		System.out.println(conta1E.sacar(400));
		System.out.println(conta1E.sacar(400));
		System.out.println(conta1E.sacar(300));
		conta1E.depositar(600);
		System.out.println(conta1E.getSaldo());
	}

}

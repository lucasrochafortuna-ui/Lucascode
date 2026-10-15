package _POO;

import entites_for_POO_questions.ContaBancaria;

public class Question016_POO {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("Maria Silva", "12345-X");
		System.out.println("Estado inicial da conta: ");
		System.out.println("Titular " + conta.getTitular());
		System.out.println("Número da conta " + conta.getNumeroConta());
		System.out.println("Saldo inicial " + conta.getSaldo());
		System.out.println("Status da conta " + conta.getAtiva());
		conta.depositar(500);
		System.out.println(conta.sacar(200));
		System.out.println("Saldo da conta: " + conta.getSaldo());
		conta.sacar(1000);
		conta.depositar(-50);
		System.out.println("Saldo da conta: " + conta.getSaldo());
		conta.encerrarConta(false);
		conta.depositar(100);
		System.out.println("Saldo da conta: " + conta.getSaldo());
		conta.reativarConta(true);
		conta.depositar(100);
		System.out.println("Saldo da conta: " + conta.getSaldo());
	}

}

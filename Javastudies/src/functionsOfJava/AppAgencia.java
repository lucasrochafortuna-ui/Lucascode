package functionsOfJava;

import java.util.ArrayList;
import java.util.List;

import entites_for_POO_questions.ContaBancaria;
import entites_for_POO_questions.ContaEspecial;

public class AppAgencia {

	public static void main(String[] args) {
		// Training List
		List<ContaBancaria> contasAgencia = new ArrayList<>();
		ContaBancaria c1 = new ContaBancaria("Ana", "121345", 50);
		ContaBancaria c2 = new ContaBancaria("Bruno", "145783", 300);
		ContaBancaria c3 = new ContaEspecial("Carla", "549563", 50, 500);
		ContaBancaria c4 = new ContaEspecial("Daniel", "850382", 0, 100);
		contasAgencia.add(c1);
		contasAgencia.add(c2);
		contasAgencia.add(c3);
		contasAgencia.add(c4);
		//O código não permite que ele acesse de forma direta pois a JVM não sabe distinguir que o c3 que foi declarado como ContaBancaria tem aspectos de ContaEspecial 
		//c3.getLimite(); 
		if (c3 instanceof ContaEspecial) {
			System.out.println("Limite da conta 3: ");
			System.out.println(((ContaEspecial) c3).getLimite());
		}
		System.out.println("------------------------------------------");
		for (ContaBancaria conta :contasAgencia) {
			if (conta.sacar(80.0)) {
				System.out.println("Saque da conta " + conta.getTitular() + " foi realizado com sucesso");
				System.out.println("Saldo da conta atual: " + conta.getSaldo());
				continue;
			}
			System.out.println("Saque da conta " + conta.getTitular() + " foi recusado");
			System.out.println("Saldo da conta atual: " + conta.getSaldo());
		}
	}
	public static void transferir(ContaBancaria c3, ContaBancaria c1, double valor) {
		if (c3.getSaldo() >= valor) {
			c3.sacar(valor);
			c1.depositar(valor);
			System.out.println("A transferencia ocorreu com sucesso!!!");
		} else {
			System.out.println("A transferencia não pode ocorrer!!!");
		}
	}

}

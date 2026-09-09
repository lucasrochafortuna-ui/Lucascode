package _POO;

import java.util.Locale;
import java.util.Scanner;

import entites_for_POO_questions.Bank;

public class Question012_POO {
	public static void main(String[] args) {
		//training 12
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name, inicial;
		int account;
		double deposit = 0;

		Bank bank;
		System.out.print("Informe o número da sua conta: ");
		account = sc.nextInt();
		System.out.print("Informe o seu nome: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Você deseja adicionar um deposito inicial[Y / N]? ");
		inicial = sc.nextLine();
		if (inicial.equals("Y") || inicial.equals("y") || inicial.equals("Yes") || inicial.equals("yes")) {
			System.out.print("Adicione o valor inicial de deposito: ");
			deposit = sc.nextDouble();
			bank = new Bank(name, account, deposit);
		} else {
			System.out.println("OK...");
			bank = new Bank(name, account);
		}
		
		System.out.println();
		System.out.print(bank.loadAccount(name, account, deposit));
		
		System.out.println();
		System.out.print("Adicione um valor de deposito: ");
		deposit = sc.nextDouble();
		bank.addDeposit(deposit);
		System.out.print(bank);
		
		System.out.println();
		System.out.print("Insira um valor que deseja sacar: ");
		deposit = sc.nextDouble();
		bank.removeDeposit(deposit);
		System.out.println(bank);
		
		sc.close();
	}
}

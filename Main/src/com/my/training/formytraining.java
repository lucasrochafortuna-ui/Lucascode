package com.my.training;

import java.util.Scanner;

public class formytraining {

	public static void main(String[] args) {
		//My training2
		Scanner sc = new Scanner(System.in);
		
		String c = "sim";
		do {
			
			System.out.println("Informe um intervalo da sua escolha, para digitar uma sequência de numeros");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (x > y) {
				System.out.println("repita a sequência");
				continue;
			}
			
			int imp = 0;
			System.out.println("Informe os números que serão contabilizados dentro da sequência: ");
			while (x <= y) {
				int z = sc.nextInt();
				if (z % 2 == 1) {
					imp += z;
				}
				x++;
			}
			System.out.print("A soma de todos os números impares digitados no intervalo é: " + imp);
			System.out.println("");
			System.out.println("Deseja continuar? [sim/não]");
			c = sc.next();
		} while (c.equalsIgnoreCase("sim"));
			
		sc.close();
	}
}

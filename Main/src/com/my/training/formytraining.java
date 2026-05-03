package com.my.training;

import java.util.Scanner;

public class formytraining {

	public static void main(String[] args) {
		//trainin3.0
		Scanner sc = new Scanner(System.in);
		
		int y, x, par, impar;
		par = 0;
		impar= 0;
		do {
			System.out.print("Digite um número: ");
			x = sc.nextInt();
			if (x % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			System.out.println("Deseja parar, digite -1:");
			y = sc.nextInt();
		} while (y != -1);
		System.out.println("A quantidade de números impares é: " + impar + " e a quantidade de números pares é: " + par);
		
		sc.close();
	}
}

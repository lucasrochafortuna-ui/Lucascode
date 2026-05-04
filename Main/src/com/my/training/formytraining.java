package com.my.training;

import java.util.Scanner;

public class formytraining {

	public static void main(String[] args) {
		//trainin4
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		System.out.print("Informe um numero qualquer: ");
		y = sc.nextInt();
		do {
			System.out.print("Digite um número: ");
			x = sc.nextInt();
			if (x == 0) {
				break;
			} else if (x < y) {
				y = x;
			} 
		}
		while (x != 0);
		System.out.println("O menor numeo digitado é: " + y);
		
		sc.close();
	}
}

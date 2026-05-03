package com.my.training;

import java.util.Scanner;

public class formytraining {

	public static void main(String[] args) {
		//My training 
		Scanner sc = new Scanner(System.in);
		
		int y = 0;
		while (y != 1) {
			System.out.println("Digite 1 para sair e 0 para continuar");
			y = sc.nextInt();
			
			if (y == 1) {
				break;
			} else if (y != 0){
				System.out.println("numero invalido");
				continue;
			} 
			
			System.out.print("Informe um número que deseja saber a tabuada: ");
			int x = sc.nextInt();
			
			if (x == 0) {
				System.out.println("Tabuada invalida");
				continue;
			}
			
			int cont = 1;
			while (cont <= 10) {
				
				int z = cont * x; 
				System.out.print(z + " ");
				cont++;	
			}
			System.out.println("");
		}
		sc.close();
	}
}

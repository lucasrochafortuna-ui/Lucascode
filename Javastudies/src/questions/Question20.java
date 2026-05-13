package questions;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		// training 20 (factorial)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número para saber seu fatorial: ");
		int x = sc.nextInt();
		int fat = 1;
		for (int i = x ; i > 1 ; i--) {
			fat = fat * i;
		}
		System.out.println("O fatorial é: " + fat);
		
		sc.close();
	}

}

package questions;

import java.util.Locale;
import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		// training 29
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Será lido um número para saber todos os números impares e pares
		System.out.println("Informe um número: ");
		int nun = sc.nextInt();
		
		System.out.print("par: ");
		for (int i = nun ; i != -1 ; i--) {
			if (i % 2 == 0 || i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.print("impar: ");
		for (int i = nun ; i != -1 ; i--) {
			if (i % 2 != 0 || i == 0) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
	}

}

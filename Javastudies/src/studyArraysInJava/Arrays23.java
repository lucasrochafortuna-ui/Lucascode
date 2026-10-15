package studyArraysInJava;

import java.util.Scanner;

public class Arrays23 {

	public static void main(String[] args) {
		// training 23
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantos números você irá digitar: ");
		int tamanho = sc.nextInt();
		int numerosPares = 0;
		int[] vector = new int[tamanho];
		for (int i = 0 ; i < vector.length ; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			vector[i] = sc.nextInt();
		}
		System.out.println("Números pares: ");
		for (int i = 0 ; i < vector.length ; i++) {
			if (vector[i] % 2 == 0) {
				System.out.printf("\n%d ", vector[i]);
				numerosPares++;
			}
		}
		System.out.println();
		System.out.printf("\nQuantidade de pares: %d", numerosPares);
		
		sc.close();
	}

}

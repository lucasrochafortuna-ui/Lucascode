package studyArraysInJava;

import java.util.Scanner;

public class Arrays08 {

	public static void main(String[] args) {
		// training 8
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor: ");
		int[] vector1 = new int [sc.nextInt()];
		System.out.println("Informe os número que estarão no vetor");
		for (int i = 0 ; i < vector1.length ; i++) {
			vector1[i] = sc.nextInt();
		}
		int[] vector2 = new int [vector1.length];
		int temp = 0;
		for (int i = 0 ; i < vector1.length ; i++) {
			for (int j = 0 ; j < vector1.length - 1 - i; j++) {
				if (vector1[j] > vector1[j + 1]) {
					temp = vector1[j];
					vector1[j] = vector1[j + 1];
					vector1[j + 1] = temp;
				}
			}
		}
		int tamanho = 0;
		for (int i = 0 ; i < vector1.length; i++) {
			if (i > 0 && vector1[i] == vector1[i - 1]) {
				continue;
			} else {
				vector2[tamanho] = vector1[i];
				tamanho++;
			}
		}
		System.out.println("O vetor 1 é: ");
		for (int i = 0; i < vector1.length ; i++) {
			System.out.print(vector1[i] + " ");
		}
		System.out.println(" ");
		System.out.println("O vetor 2 sem repetições é: ");
		for (int i = 0 ; i < tamanho ; i++) {
			System.out.print(vector2[i] + " ");
		}
		sc.close();
	}

}

package studyArraysInJava;

import java.util.Scanner;

public class Arrays06 {

	public static void main(String[] args) {
		// training 6
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor: ");
		int[] vector = new int [sc.nextInt()];
		
		System.out.println("Informe os números de um vetor de tamanho " + vector.length);
		for (int i = 0 ; i < vector.length ; i++) {
			vector[i] = sc.nextInt();
		}
		int j = 0;
		for (int i = 0 ; i < vector.length ; i++) {
			for (j = 0 ; j < vector.length - 1 - i ; j++) {
				if (vector[j] > vector[j + 1]) {
					int temp = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = temp;
				}
			}
		}
		System.out.print("O vetor em ordem crescente é: ");
		for (int i = 0 ; i < vector.length ; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0 ; i < vector.length ; i++) {
			if (i == vector.length - 1) {
				System.out.println("O maior número digitado foi: " + vector[i]);
			} else if (i == 0) {
				System.out.println("O menor número digitado foi: " + vector[i]);
			}
		}
		
		sc.close();
	}

}

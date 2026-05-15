package studyArraysInJava;

import java.util.Scanner;

public class Arrays05 {

	public static void main(String[] args) {
		// training 5
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho das duas matrizes que serão utilizadas: ");
		int[] vector1 = new int [sc.nextInt()];
		int[] vector2 = new int [sc.nextInt()];
		int[] vector3 = new int [vector1.length + vector2.length];
		
		System.out.println("Informe os valores em ordem crescente do primeiro vetor: ");
		for (int i = 0 ; i < vector1.length ; i++) {
			vector1[i] = sc.nextInt();
		}
		System.out.println("Informe os valores em ordem crescente do segundom vetor: ");
		for (int i = 0 ; i < vector2.length ; i++) {
			vector2[i] = sc.nextInt();
		}
		
		for (int i = 0 ; i < vector1.length ; i++ ) {
			vector3[i] = vector1[i];
		}
		for (int i = 0 ; i < vector2.length ; i++ ) {
			vector3[vector1.length + i] = vector2[i];
		}
		for (int i = 0 ; i < vector3.length - 1; i++) { 
			// Esse  for serve para rodar o codigo para ajustar tudo, o -1 serve para não contar uma passagem a mais pois pela logica passando n-1 vezes já coloca os número em ordem
			for (int j = 0 ; j < vector3.length - 1 - i ; j++) {
				// Esse for ele vai comparar o 1° número e o seu sucessor e assim por diante, o -1 serve para não contabilizar um par a mais assim quebrando o array.
				// O -i serve para não contabilizar o ultimo número pois o ultimo número já será o maior número digitado ao se compara par a par entre os números.a
				if (vector3[j] > vector3[j + 1]) {
					int temp = vector3[j];
					vector3[j] = vector3[j + 1];
					vector3[j + 1] = temp;
				}
			}
		}
		System.out.println("O 1° vetor é: ");
		for (int i = 0 ; i < vector1.length ; i++) {
			System.out.println(vector1[i] + " ");
		}
		System.out.println("O 2° vetor é: ");
		for (int i = 0 ; i < vector2.length ; i++) {
			System.out.println(vector2[i] + " ");
		}
		System.out.println("O 3° vetor é: ");
		for (int i = 0 ; i < vector3.length ; i++) {
			System.out.println(vector3[i] + " ");
		}
		
		
		sc.close();
	}

}

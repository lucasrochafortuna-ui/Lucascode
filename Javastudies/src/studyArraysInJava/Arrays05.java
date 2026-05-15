package studyArraysInJava;

import java.util.Scanner;

public class Arrays05 {

	public static void main(String[] args) {
		// training 5
		Scanner sc = new Scanner(System.in);
		
		int[] vector1 = new int [10];
		int[] vector2 = new int [10];
		int[] vector3 = new int [20];
		int cont = 0;
		
		System.out.println("Informe 10 valores em ordem crescente: ");
		for (int i = 0 ; i < vector1.length ; i++) {
			vector1[i] = sc.nextInt();
			if (vector1[i] > cont) {
				cont = vector1[i];
				vector1[i] = cont;
			} else {
				System.out.println("Número inválido");
			}
		}
		System.out.println("Informe 10 valores em ordem crescente: ");
		for (int i = 0 ; i < vector2.length ; i++) {
			vector2[i] = sc.nextInt();
			if (vector2[i] > cont) {
				cont = vector2[i];
				vector2[i] = cont;
			} else {
				System.out.println("Número inválido");
			}
		}
		for (int i = 0 ; i < vector3.length; i++) {
			for (i = 0 ; i < vector3.length / 2 ; i++) {
				if (vector1[i] < vector2[i]) {
					vector3[i] = vector1[i];
				} else if (vector1[i] > vector2[i]) {
					vector3[i] = vector2[i];
				}
			}
			for (i = 10 ; i < vector3.length ; i++) {
				int j = 0;
				if (vector1[j] > vector2[j]) {
					vector3[i] = vector1[j];
				} else if (vector1[j] < vector2[j]) {
					vector3[i] = vector2[j];
				}
				j++;
			}
		}
		for (int i = 0 ; i < vector1.length ; i++) {
			System.out.println("O 1° vetor é: ");
			System.out.print(vector1[i] + " ");
		}
		for (int i = 0 ; i < vector2.length ; i++) {
			System.out.println("O 2° vetor é: ");
			System.out.print(vector2[i] + " ");
		}
		for (int i = 0 ; i < vector3.length ; i++) {
			System.out.println("O 3° vetor é: ");
			System.out.println(vector3[i] + " ");
		}
		
		
		sc.close();
	}

}

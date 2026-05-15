package studyArraysInJava;

import java.util.Scanner;

public class Arrays05 {

	public static void main(String[] args) {
		// training 5
		Scanner sc = new Scanner(System.in);
		
		int[] vector1 = new int [2];
		int[] vector2 = new int [2];
		int[] vector3 = new int [4];
		int cont = 0;
		
		System.out.println("Informe 10 valores em ordem crescente: ");
		for (int i = 0 ; i < vector1.length ; i++) {
			vector1[i] = sc.nextInt();
			if (vector1[i] > cont) {
				cont = vector1[i];
				vector1[i] = cont;
			} else if (vector1[i] < cont){
				System.out.println("Número inválido");
				i--;
				continue;
			}else {
				System.out.println("Números iguais, repita");
				i--;
				continue;
			}
		}
		System.out.println("Informe 10 valores em ordem crescente: ");
		for (int i = 0 ; i < vector2.length ; i++) {
			vector2[i] = sc.nextInt();
			if (vector2[i] > cont) {
				cont = vector2[i];
				vector2[i] = cont;
			} else if (vector2[i] < cont){
				System.out.println("Número inválido");
				i--;
				continue;
			} else {
				System.out.println("Números iguais, repita");
				i--;
				continue;
			}
		}
		for (int i = 0 ; i < vector3.length; i++) {
			for (i = 0 ; i < 2; i++) {
				vector3[i] = vector1[i];
			}
			int j = 0;
			for (i = 2 ; i < 4; i++) {
				vector3[i] = vector2[j];
				j++;
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

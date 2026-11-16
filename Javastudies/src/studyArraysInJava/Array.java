package studyArraysInJava;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// training 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor: ");
		int[] vector = new int [sc.nextInt()];
		System.out.println("Informe os números que estarão no vetor");
		for (int i = 0 ; i < vector.length ; i++) {
			vector[i] = sc.nextInt();
		}
		int cont = 0, posiçao = 0;
		System.out.println("Informe um número "); // Pede um número que será verificado se existe dentro do vetor.
		int numero = sc.nextInt();
		for (int i = 0 ; i < vector.length ; i++) {
			if (vector[i] == numero) {
				cont++;
				posiçao = i;
			}
		}
		if (cont >= 1) {
			System.out.println("O número " + numero + " está dentro do vetor de tamanho " + vector.length + " na posição " + posiçao);
		} else {
			System.out.println("O número " + numero + " não foi encontado no vetor");
		}
		
		sc.close();
	}

}

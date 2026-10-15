package studyArraysInJava;

import java.util.Scanner;

public class Arrays25 {

	public static void main(String[] args) {
		// training 25
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantos elementos o vetor terá: ");
		int tamanho = sc.nextInt();
		double media = 0;
		double[] vector = new double [tamanho];
		for (int i = 0 ; i < vector.length ; i++) {
			System.out.print("Informe um número: ");
			vector[i] = sc.nextDouble();
			media += vector[i];
		}
		media = media / vector.length;
		System.out.printf("Media do vetor: %.3f%n", media);
		System.out.println("Elementos abaixo da media: ");
		for (int i = 0 ; i < vector.length ; i++) {
			if (vector[i] < media) {
				System.out.println(vector[i]);
			}
		}
		
		sc.close();
	}

}

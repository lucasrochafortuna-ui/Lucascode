package studyArraysInJava;

import java.util.Scanner;

public class Arrays27 {

	public static void main(String[] args) {
		// training 27
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantos números você irá digitar: ");
		int tamanho = sc.nextInt();
		double maior = 0;
		int posição = 0;
		double[] vector = new double[tamanho];
		for (int i = 0 ; i < vector.length ; i++) {
			System.out.print("Digite um número: ");
			vector[i] = sc.nextDouble();
			if (vector[i] > maior) {
				maior = vector[i];
				posição = i;
			}
		}
		System.out.printf("O maior valor digitado foi: %.1f%n", maior);
		System.out.println("A posição do maior valor é: " + posição);
		 
		sc.close();
	}

}

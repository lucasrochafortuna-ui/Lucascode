package studyArraysInJava;

import java.util.Locale;
import java.util.Scanner;

public class Arrays21 {

	public static void main(String[] args) {
		// training 21
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Informe um número: ");
		double soma = 0;
		int tamanho = sc.nextInt();
		double vector[] = new double[tamanho]; 
		System.out.println("Escreva " + tamanho + " alturas: ");
		for (int i = 0 ; i < vector.length; i++ ) {
			vector[i] = sc.nextDouble();
			soma += vector[i];
		}
		soma = soma / tamanho;
		System.out.printf("A media das idades é: %.2f", soma);
		sc.close();
	}

}

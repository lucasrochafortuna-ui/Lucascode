package studyArraysInJava;

import java.util.Locale;
import java.util.Scanner;

public class Arrays22 {

	public static void main(String[] args) {
		// training 22
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantos números você deseja digitar? ");
		int tamanho = sc.nextInt();
		double soma = 0;
		double[] vector = new double[tamanho];
		for (int i = 0 ; i < vector.length; i++) {
			vector[i] = sc.nextDouble();
			soma += vector[i];
		}
		System.out.print("Valores: ");
		for (int i = 0 ; i < vector.length ; i++) {
			System.out.print(vector[i]);
		}
		System.out.println("Soma: " + soma);
		soma = soma / vector.length;
		System.out.println("Media: " + soma);

		sc.close();
	}

}

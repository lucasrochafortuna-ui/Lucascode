package studyArraysInJava;

import java.util.Scanner;

public class Arrays26 {

	public static void main(String[] args) {
		// training 26
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantos elementos o vetor terá: ");
		int tamanho = sc.nextInt();
		int[] vector = new int[tamanho];
		double par = 0, mediaPar = 0;
		for (int i = 0; i < vector.length ; i++) {
			System.out.print("Digite um número: ");
			vector[i] = sc.nextInt();
			if (vector[i] % 2 == 0) {
				par++;
				mediaPar += vector[i];
			}
		}
		if (par > 0) {
			mediaPar = mediaPar / par;
			System.out.println("A media dos números pares é: " + mediaPar);
		} else {
			System.out.println("Não há números pares");
		}
		
		sc.close();
	}

}

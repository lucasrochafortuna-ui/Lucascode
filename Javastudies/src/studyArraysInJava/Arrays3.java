package studyArraysInJava;

import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {
		// training 3 (calculating new vector)
		Scanner sc = new Scanner(System.in);
		
		int[] vectorA = new int [8];
		int[] vectorB = new int [8];
		int[] vectorC = new int [8];
		int i;
		System.out.println("Digite 8 valores do primeiro vetor: ");
		for (i = 0 ; i < vectorA.length ; i++) {
			vectorA[i] = sc.nextInt();
		}
		System.out.println("Digite 8 valores do segundo vetor: ");
		for (i = 0 ; i < vectorB.length ; i++) {
			vectorB[i] = sc.nextInt();
		}
		i = 0;
		// Vai calcular o terceiro vetor somando os valores dos outros 2 vetores, espaço por espaço.
		System.out.println("O terceiro vetor será: ");
		while (i < vectorC.length) {
			vectorC[i] = vectorA[i] + vectorB[i];
			System.out.print(vectorC[i] + " ");
			i++;
		}
		
		sc.close();
	}

}

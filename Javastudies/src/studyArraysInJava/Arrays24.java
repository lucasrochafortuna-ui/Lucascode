package studyArraysInJava;

import java.util.Scanner;

public class Arrays24 {

	public static void main(String[] args) {
		// training 24
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o tamanho que cada vetor terá: ");
		int tamanho = sc.nextInt();
		int[] vectorA = new int[tamanho];
		int[] vectorB = new int[tamanho];
		int[] vectorC = new int[tamanho];
		
		System.out.println("Informe os elementos do 1° vetor: ");
		for (int i = 0 ; i < vectorA.length ; i++) {
			System.out.print((i + 1) + "° elemento: ");
			vectorA[i] = sc.nextInt();
		}
		System.out.println("Informe os elementos do 2° vetor: ");
		for (int i = 0 ; i < vectorB.length ; i++) {
			System.out.print((i + 1) + "° elemento: ");
			vectorB[i] = sc.nextInt();
		}
		System.out.println("O 3° vetor ficará assim: ");
		for (int i = 0 ; i < vectorC.length ; i++) {
			vectorC[i] = vectorA[i] + vectorB[i];
			System.out.println((i + 1) + "° elemento: " + vectorC[i]);
		}
		
		
		sc.close();
	}

}

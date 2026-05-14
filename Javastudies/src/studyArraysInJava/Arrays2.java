package studyArraysInJava;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		// training 2
		Scanner sc = new Scanner(System.in);
		
		int[] vector = new int [8];
		int i, multiplicação = 1;
		System.out.println("Digite 8 números");
		for (i = 0 ; i < vector.length ; i++) {
			vector[i] = sc.nextInt();
			multiplicação = multiplicação * vector[i];
		}
		System.out.println("A multiplicação dos 8 números digitados é: " + multiplicação);
		
		sc.close();
	}

}

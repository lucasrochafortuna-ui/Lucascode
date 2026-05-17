package studyArraysInJava;

import java.util.Scanner;

public class Arrays08 {

	public static void main(String[] args) {
		// training 8
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor: ");
		int[] vector1 = new int [sc.nextInt()];
		System.out.println("Informe os número que estarão no vetor");
		for (int i = 0 ; i < vector1.length ; i++) {
			vector1[i] = sc.nextInt();
		}
		int[] vector2 = new int [vector1.length]; 
		for (int i =  0 ; i < vector1.length ; i++) {
			vector2[i] = vector1[i];
		}
		System.out.print("Os números que estão no segundo vetor é: ");
		for (int i = 0 ; i < vector2.length ; i++) {
			System.out.print(vector2[i]);
		}
		
		sc.close();
	}

}

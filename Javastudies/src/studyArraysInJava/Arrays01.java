package studyArraysInJava;

import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		// training 1 
		Scanner sc = new Scanner(System.in);
		int[] vector = new int [3];
		int i;
		System.out.println("Informe 6 numeros: ");
		for (i = 0 ; i < vector.length ; i++) {
			vector[i] = sc.nextInt();
		}
		i = 0;
		while (i < vector.length) {
			System.out.println(vector[i]);
			i++;
		}
		
		sc.close();
	}

}

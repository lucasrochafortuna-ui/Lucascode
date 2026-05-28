package studyArraysInJava;

import java.util.Scanner;

public class Arrays12 {

	public static void main(String[] args) {
		// training 12
		Scanner sc = new Scanner(System.in);
		int[][] vector = new int [5][2];
		int x = 1;
		System.out.println("Informe os números que estarão na matriz");
		for (int i = 0 ; i < vector.length ; i++) {
			for (int j = 0 ; j < vector[i].length ; j++) {
				vector[i][j] = sc.nextInt();
				x *= vector[i][j];
			}
		}
		System.out.println(x);
		
		sc.close();
	}

}

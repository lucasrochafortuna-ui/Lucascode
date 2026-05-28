package studyArraysInJava;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays11 {

	public static void main(String[] args) {
		// training 11
		Scanner sc = new Scanner(System.in);
		int[][] vector1 = new int [3][2];
		int[][] vector2 = new int [3][2];
		int[][] vector3 = new int [3][2];
		System.out.println("Informe os número que estarão na 1° matriz");
		for (int i = 0 ; i < vector1.length ; i++) {
			for (int j = 0 ; j < vector1[i].length ; j++) {
				vector1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Informe os números que estarão na 2° matriz");
		for (int i = 0 ; i < vector2.length ; i++) {
			for (int j = 0 ; j < vector2[i].length ; j++) {
				vector2[i][j] = sc.nextInt();
			}
		}
		// Agora será inserido a soma da 1° matriz a 2° matriz na terceira matriz
		for (int i = 0 ; i < vector3.length ; i++) {
			for (int j = 0 ; j < vector3[i].length ; j++) {
				vector3[i][j] = vector1[i][j] + vector2[i][j];
			}
		}
		for (int i = 0; i < vector3.length ; i++) {
			System.out.println(Arrays.toString(vector3[i]));
		}
		
		sc.close();
	}

}

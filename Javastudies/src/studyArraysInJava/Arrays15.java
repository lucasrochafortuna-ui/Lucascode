package studyArraysInJava;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays15 {

	public static void main(String[] args) {
		// training 15
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o tamanho da primeira matriz, que também será considerado na segunda");
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		int[][] vector1 = new int [linha][coluna];
		int[][] vector2 = new int [linha][coluna];
		int[][] vector3 = new int [linha][coluna];
		System.out.println("Informe os números que estarão na primeira matriz");
		for (int i = 0 ; i < vector1.length ; i++) {
			for (int j = 0 ; j < vector1[i].length ; j++) {
				vector1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Informe os números que estarão na segunda matriz");
		for (int i = 0 ; i < vector2.length ; i++) {
			for (int j = 0 ; j < vector2[i].length ; j++) {
				vector2[i][j] = sc.nextInt();
			}
		}
		System.out.println("A terceira matriz ficará: ");
		for (int i = 0 ; i < vector3.length ; i++) {
			for (int j = 0 ; j < vector3[i].length ; j++) {
				vector3[i][j] = vector1[i][j] * vector2[i][j];
				System.out.print("[" + vector3[i][j] + "]" + " ");
			}
		}
		
		sc.close();
	}

}

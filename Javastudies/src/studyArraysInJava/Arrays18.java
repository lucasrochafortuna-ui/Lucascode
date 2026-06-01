package studyArraysInJava;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays18 {

	public static void main(String[] args) {
		// training 18 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho de uma matriz (linha/coluna)");
		int[][] vector = new int [sc.nextInt()][sc.nextInt()];
		System.out.println("Informe os números que estarão na matriz");
		for (int i = 0 ; i < vector.length ; i++) {
			for (int j = 0 ; j < vector[i].length ; j++) {
				vector[i][j] = sc.nextInt();
			}
		}
		System.out.println("A matriz normal ficará: ");
		for (int i = 0 ; i < vector.length ; i++) {
			System.out.println(Arrays.toString(vector[i]));
		}
		System.out.println("A matriz (TRANSPOSTA) ficará: ");
		for (int i = 0 ; i < vector.length ; i++) {
			for (int j = 0 ; j < vector[i].length ; j++) {
				System.out.print(" " + vector[j][i]);
			}
		}
		
		sc.close();
	}

}

package leetcodequestions;

import java.util.Arrays;
import java.util.Scanner;

public class Question002 {

	public static void main(String[] args) {
		// training 2 
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o tamanho que deseja no 1° vetor"); 
		int[][] vector1 = new int [sc.nextInt()][sc.nextInt()];
		System.out.println("Informe o tamanho que deseja no 2° vetor");
		int[][] vector2 = new int [sc.nextInt()][vector1[0].length];
		System.out.println("Informe os números que estarão no 1° vetor");
		int cont1 = 0;
		for (int i = 0 ; i < vector1.length ; i++) {
			cont1++;
			for (int j = 0 ; j < vector1[i].length ; j++) {
				vector1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Informe os números que estarão no 2° vetor"); 
		for (int i = 0 ; i < vector2.length ; i++) {
			cont1++;
			for (int j = 0 ; j < vector2[i].length ; j++) {
				vector2[i][j] = sc.nextInt();
			}
		}
		int[][] vector3 = new int [cont1][vector1[0].length];
		for (int i = 0; i < vector1.length; i++) {
			for (int j = 0 ; j < vector1[i].length; j++) {
				vector3[i][j] = vector1[i][j];
			}
		}
		for (int i = vector1.length; i < vector3.length ; i++) {
			for (int j = 0; j < vector2[i - vector1.length].length; j++) {
				vector3[i][j] = vector2[i - vector1.length][j];
			}
		}
		for (int i = 0 ; i < vector3.length ; i++) {
			System.out.println(Arrays.toString(vector3[i]));
		}
		
		sc.close();
	}

}

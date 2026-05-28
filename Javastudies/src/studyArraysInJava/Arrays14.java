package studyArraysInJava;

import java.util.Scanner;

public class Arrays14 {

	public static void main(String[] args) {
		// training 14
		Scanner sc = new Scanner(System.in);
		int[][] vector = new int [3][4];
		System.out.println("Informe os números que estarão na matriz");
		int maior = 0, menor;
		String cont = "";
		for (int i = 0 ; i < vector.length ; i++) {
			for (int j = 0 ; j < vector[i].length ; j++) {
				vector[i][j] = sc.nextInt();
				if (maior < vector[i][j]) {
					maior = vector[i][j];
					cont = i + " " + j;
				}
			}
		}
		System.out.println("O maior número digitado foi " + maior + " e está na posição " + cont);
		menor = maior;
		for (int i = 0 ; i < vector.length ; i++) {
			for (int j = 0 ; j < vector[i].length ; j++) {
				if (menor > vector[i][j]) {
					menor = vector[i][j];
					cont = i + " " + j;
				}
			}
		}
		System.out.println("O menor número digitado é " + menor + " e está na posiçã0 " + cont);
		
		sc.close();
	}

}

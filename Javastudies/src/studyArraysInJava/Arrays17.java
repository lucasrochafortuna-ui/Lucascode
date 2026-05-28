package studyArraysInJava;

import java.util.Scanner;

public class Arrays17 {

	public static void main(String[] args) {
		// training 17
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o tamanho da matriz colocando o valor da linha igual ao da coluna");
		int[][] vector = new int [sc.nextInt()][sc.nextInt()];
		int cont = 0;
		System.out.println("Informe os números que estarão na matriz");
		for (int i = 0 ; i < vector.length ; i++) {
			for (int j = 0 ; j < vector[i].length ; j++) {
				vector[i][j] = sc.nextInt();
				if (i + j == vector.length + 1) {
					cont += vector[i][j];
				}
			}
		}
		System.out.println("O valor da soma da digonal secundaria é " + cont);
		
		sc.close();
	}

}

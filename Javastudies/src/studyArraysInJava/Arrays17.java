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
		cont = montadordematriz(sc, vector, cont);
		System.out.println("O valor da soma da digonal secundaria é " + cont);
		
		sc.close();
	}
	public static int montadordematriz (Scanner sc, int[][] matriz, int cont) {
		for (int i = 0 ; i < matriz.length ; i++) {
			for (int j = 0 ; j < matriz[i].length ; j++) {
				matriz[i][j] = sc.nextInt();
				if (i + j == matriz.length - 1) {
					cont += matriz[i][j];
				}
			}
		}
		return cont;
	}

}

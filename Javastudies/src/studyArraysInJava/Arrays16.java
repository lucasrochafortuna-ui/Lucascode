package studyArraysInJava;

import java.util.Scanner;

public class Arrays16 {

	public static void main(String[] args) {
		// training 16
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tamanho da matriz colocando o número da linha igual ao da coluna");
		int[][] vector = new int [sc.nextInt()][sc.nextInt()];
		int cont = 0;
		System.out.println("Agora informe os números que estarão nessa matriz");
		for (int i = 0 ; i < vector.length ; i++) {
			for (int j = 0 ; j < vector[i].length ; j++) {
				vector[i][j] = sc.nextInt();
				if (i == j) {
					cont += vector[i][j];
				}
			}
		}
		System.out.println("A soma das diagonais dessa matriz é " + cont);
		
		sc.close();
	}

}
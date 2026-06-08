package studyArraysInJava;

import java.util.Scanner;

public class Arrays15 {

	public static void main(String[] args) {
		// training 15
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o tamanho da primeira matriz, que também será considerado na segunda");
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		System.out.println("Informe os números que estarão na 1° matriz");
		int[][] vector1 = montadordematriz(sc, linha, coluna);
		System.out.println("Informe os números que estarão na 2° matriz");
		int[][] vector2 = montadordematriz(sc, linha, coluna);
		int[][] vector3 = new int [linha][coluna];
		System.out.println("A terceira matriz ficará: ");
		for (int i = 0 ; i < vector3.length ; i++) {
			for (int j = 0 ; j < vector3[i].length ; j++) {
				vector3[i][j] = vector1[i][j] * vector2[i][j];
				System.out.print("[" + vector3[i][j] + "]" + " ");
			}
		}
		
		sc.close();
	}
	public static int[][]montadordematriz(Scanner sc, int linha, int coluna) {
		int[][] matriz = new int [linha][coluna];
		for (int i = 0 ; i < matriz.length ; i++) {
			for (int j = 0 ; j < matriz[i].length ; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		return matriz;
	}

}

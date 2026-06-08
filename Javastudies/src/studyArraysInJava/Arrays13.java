package studyArraysInJava;

import java.util.Scanner;

public class Arrays13 {

	public static void main(String[] args) {
		// training 12
		Scanner sc = new Scanner(System.in);
		int[][] vector = new int [3][5];
		System.out.println("Informe os número que estarão em uma matriz 3 por 5");
		for (int i = 0 ; i < vector.length ; i++) {
			for (int j = 0 ; j < vector[i].length ; j++) {
				vector[i][j] = sc.nextInt();
			}
		}
		System.out.println("Informe um número que você deseje saber se está presente dentro da matriz");
		int num = sc.nextInt();
		int cont = 0;
		verificadordepresença(vector, cont, num);
		if (cont == vector.length * vector[0].length) {
			System.out.println("O número não foi encontrado");
		}
		sc.close();
	}
	public static int verificadordepresença(int[][] matriz, int x, int y) {
		for (int i = 0 ; i < matriz.length ; i++) {
			for (int j = 0 ; j < matriz[i].length ; j++) {
				if (matriz[i][j] == y) {
					System.out.println("O número foi encontrado na posição " + i + " " + j);
				} else {
					x++;
				}
			}
		}
		return x;
	}

}

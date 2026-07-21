package leetcodequestions;

import java.util.Scanner;

public class Question001 {

	public static void main(String[] args) {
		// training 1
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamnho do Vetor");
		int[] vector = new int [sc.nextInt()];
		System.out.println("Informe os números que estarão no Array");
		for (int i = 0 ; i < vector.length ; i++) {
			vector[i] = sc.nextInt();
		}
		// PEDE UM NÚMERO PARA SABER SE A SOMA DO VETOR COM O SEU ANTECESSOR SERÀ O NÚMERO INDICADO
		System.out.println("Informe um número");
		int x = sc.nextInt(), cont = 0;
		for (int i = 0 ; i < vector.length ; i++) {
			if (i >= 1 && (vector[i] + vector[i - 1]) == x) {
				System.out.println("Número encontrado na posição " + i + " " + (i - 1));
				cont ++;
			}
		}
		if (cont == 0) {
			System.out.println("Número não encontrado");
		}

		sc.close();
	}

}

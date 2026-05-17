package studyArraysInJava;

import java.util.Scanner;

public class Arrays07 {

	public static void main(String[] args) {
		// training 7
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor: ");
		int[] vector = new int [sc.nextInt()];
		System.out.println("Digite os números que estarão no vetor");
		for (int i = 0 ; i < vector.length ; i++) {
			vector[i] = sc.nextInt();
		}
		System.out.println("Digite um número que você queira saber se tem no vetor"); 
		int x = sc.nextInt();
		int cont = 0;
		for (int i = 0 ; i < vector.length ; i++) {
			if (vector[i] == x) {
				i += 1;
				System.out.println("O número foi encontrado na posição: " + i);
				cont++;
				i -= 1;
			}
		}
		if (cont == 0) {
			System.out.println("O número digitado não foi encontrado no vetor");
		}
		
		sc.close();
	}

}

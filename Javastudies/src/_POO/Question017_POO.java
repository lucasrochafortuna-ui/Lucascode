package _POO;

import java.util.Scanner;

public class Question017_POO {

	public static void main(String[] args) {
		// training 17
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números você deseja digitar? ");
		int tamanho = sc.nextInt();
		int[] vector = new int[tamanho];
		System.out.println("Digite números de no maximo até 10");
		for (int i = 0 ; i < vector.length ; i++) {
			vector[i] = sc.nextInt();
		}
		System.out.println("Negativos: ");
		for (int i = 0 ; i < vector.length ; i++) {
			if (vector[i] < 0) {
				System.out.println(vector[i]);
			}
		}
		sc.close();
	}

}

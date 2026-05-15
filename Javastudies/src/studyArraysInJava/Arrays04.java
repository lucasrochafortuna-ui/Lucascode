package studyArraysInJava;

import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		// training 4 (read 10 numbers)
		Scanner sc = new Scanner(System.in);
		int[] vector = new int [10];
		
		// O programa irá pedir para que se digite 10 números, no final irá ser mostrado somente os números impares que foram digitados.
		System.out.println("Informe 10 numeros: ");
		for (int i = 0 ; i < vector.length ; i++) {
			vector[i] = sc.nextInt();
		}
		for (int i = 0 ; i < vector.length ; i++) {
			if (vector[i] % 2 == 1) {
				System.out.println("Os termos impares dos números informados é: ");
				System.out.print(vector[i] + " ");
			}
		}
		
		sc.close();
	}

}

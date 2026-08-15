package questions;

import java.util.Locale;
import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		// training 34
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int [][] array = new int [10][10];
		System.out.println("Informe os números que estarão em uma matriz 10x10");
		for (int i = 0 ; i < 10 ; i++ ) {
			for (int j = 0 ; j < 10 ; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		System.out.print("Os números da diagonal principal são: ");
		for (int i = 0 ; i < 10 ; i++ ) {
			for (int j = 0 ; j < 10 ; j++) {
				if (i == j) {
					System.out.print(array[i][j] + " ");
				}
			}
		}
		
		sc.close();
	}

}

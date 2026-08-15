package questions;

import java.util.Locale;
import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		// training 33
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int [] vector1 = new int [10];
		int [] vector2 = new int [10];
		int [] vector3 = new int [10];
		System.out.println("Digite 10 números para o primerio vetor: ");
		for (int i = 0 ; i < 10 ; i++) {
			vector1 [i] = sc.nextInt();
		}
		System.out.println("Digite 10 números para o segundo vetor: ");
		for (int i = 0 ; i < 10 ;  i++) {
			vector2[i] = sc.nextInt();
		}
		System.out.print("O terceiro vetor ficará: ");
		for (int i = 0 ; i < 10 ; i++) {
			vector3[i] = vector1[i] + vector2[i];
			System.out.print(vector3[i] + " ");
		}
		
		sc.close();
	}

}

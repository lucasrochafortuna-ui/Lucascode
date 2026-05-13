package questions;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		// training 24 (bitwise)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número que você queira saber o valor do 6 bit");
		int num = sc.nextInt();
		int mask = 0b100000;
		
		if ((num & mask) != 0) {
			System.out.println("O 6° bit é verdadeiro [1]");
		} else {
			System.out.println("O 6° bit é falso [0]");
		}
		
		sc.close();
	}

}

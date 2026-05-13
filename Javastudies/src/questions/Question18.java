package questions;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// training 18 (tests)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de casos: ");
		double y, z, p, med;
		int x = sc.nextInt();
		for (int i = 1 ; i <= x ; i++) {
			System.out.println("Informe 3 notas: ");
			y = sc.nextDouble();
			z = sc.nextDouble();
			p = sc.nextDouble();
			med = (y * 2 + z * 3 + p * 5) / 10 ;
			System.out.printf("A média das 3 notas é: %.1f%n", med);
		}
		
		sc.close();
	}

}

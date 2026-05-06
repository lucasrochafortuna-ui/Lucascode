package question09;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		//training9
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um numero para saber se ele é primo ou não: ");
		int x = sc.nextInt();
		int prim = 0, div = 1;
		
		while (div <= x) {
			if (x % div == 0) {
				prim++;
			}
			div++;
		}
		
		if (prim == 2) {
			System.out.println("O numero é primo");
		} else if (prim == 1 || prim >= 3) {
			System.out.println("O numero não é primo");
		}
		sc.close();
	}

}

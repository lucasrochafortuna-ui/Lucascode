package question13more;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// training 19 (dividers)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantos números serão lidos: ");
		int x = sc.nextInt();
		System.out.println("Informe dois números para saber qual a divisão entre eles");
		for (int i = 0 ; i < x ; i++) {
			int z = sc.nextInt();
			int y = sc.nextInt();
			if (y == 0) {
				System.out.println("Divisão impossivel");
			} else {
				double div = (double) z / y;
				System.out.printf("A divisão é: %.1f%n", div);	
			}

		}
		
		sc.close();
	}

}

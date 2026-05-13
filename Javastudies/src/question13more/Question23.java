package question13more;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		// training 23 (Celsius for Fahrenheit)
		Scanner sc = new Scanner(System.in);
		
		char y;
		do {
			System.out.println("informe uma temperatura em celsius para saber em fahrenheit");
			double x = sc.nextDouble();
			double f = (x * 9) / 5 + 32;
			System.out.printf("Equivalente em fahrenheit: %.1f%n", f);
			System.out.println("Deseja continuar? [s/n] ");
			y = sc.next().charAt(0);
			
		} while (y == 's');
		
		sc.close();
	}

}

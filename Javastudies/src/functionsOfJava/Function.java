package functionsOfJava;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		// function 2 (showResult)
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Informe dois números:");
		int divisor = sc.nextInt();
		int dividendo = sc.nextInt();
		double result = resultado (divisor, dividendo);
		System.out.println(result);
		
				
		sc.close();
	}
	public static double resultado(double x, double y) {
		double re = x / y;
		return re;
	}
}

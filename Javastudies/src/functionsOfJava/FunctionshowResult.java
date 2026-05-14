package functionsOfJava;

import java.util.Scanner;

public class FunctionshowResult {

	public static void main(String[] args) {
		// function 2 (showResult)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe dois números:");
		int divisor = sc.nextInt();
		int dividendo = sc.nextInt();
		double resultado = (double) divisor / dividendo;
		mostreOResultado(resultado);
		
		sc.close();
	}
	public static void mostreOResultado(double value) {
		System.out.println("O valor da divisão é: " + value);
	}
}

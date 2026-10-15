package entites_for_POO_questions;

public class Calculadora {
	private static int contarOperaçoes = 0;
	
	public static int getcontarOperações() {
		return contarOperaçoes;
	}
	
	public static double adicionar (double n1, double n2) {
		contarOperaçoes++;
		return n1 + n2;
	}
	
	public static double subtrair (double n1, double n2) {
		contarOperaçoes++;
		return n1 - n2;
	}
	
	public static double multiplicar (double n1, double n2) {
		contarOperaçoes++;
		return n1 * n2;
	}
	
	public static double dividir (double n1, double n2) {
		contarOperaçoes++;
		if (n2 == 0) {
			return Double.NaN;
		} else {
			return n1 / n2;	
		}
	}
	
}

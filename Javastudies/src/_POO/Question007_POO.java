package _POO;

import java.util.Locale;
import java.util.Scanner;

import entites_for_POO_questions.Calculator;

public class Question007_POO {
	
	public static void main(String[] args) {
	    // training 7
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculator.circunferencia(raio);
		
		double v = Calculator.volume(raio);
		
		
		System.out.printf("Circuferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calculator.PI);
		
		
		sc.close();
	}
}

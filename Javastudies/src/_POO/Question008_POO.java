package _POO;

import java.util.Locale;
import java.util.Scanner;

import entites_for_POO_questions.Dollar;

public class Question008_POO {

	public static void main(String[] args) {
		// training 8
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o preço do dollar nos dias de hoje?: ");
		double dollar = sc.nextDouble();
		System.out.print("Quantos dollars você deseja comprar?: ");
		double pay = sc.nextDouble();
		System.out.printf("Você deverá pagar em reais: %.2f%n",  Dollar.CurrencyConverter(dollar, pay));
		
		sc.close();
	}

}

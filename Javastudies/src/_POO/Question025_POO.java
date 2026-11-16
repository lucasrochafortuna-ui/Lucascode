package _POO;

import java.util.Scanner;

import entites_for_POO_questions.CalculadoraArea;

public class Question025_POO {
	public static void main(String[] args) {
		// training 25
		Scanner sc = new Scanner(System.in);
		
		CalculadoraArea calcula = new CalculadoraArea();
		System.out.println("Informe o lado de um quadrado: ");
		double lado = sc.nextDouble();
		System.out.println("Area do quadrado: " + calcula.Calcular(lado));
		System.out.println("Informe a base e a altura de um retangulo: ");
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		System.out.println("Area do retânculo: " + calcula.Calcular(base, altura));
		System.out.println("Informe se o que o ultimo item é um circulo: ");
		char resposta = sc.next().charAt(0);
		double raio = 0;
		if (resposta == 's' || resposta == 'S') {
			calcula.seteCirculo(true);
			System.out.println("Informe o raio do circulo: ");
			raio = sc.nextDouble();
		} else {
			calcula.seteCirculo(false);
		}
		calcula.Calcular(raio, calcula.iseCirculo());
		
		sc.close();
	}
}

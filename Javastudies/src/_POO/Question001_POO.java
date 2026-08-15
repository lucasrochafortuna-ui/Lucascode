package _POO;

import java.util.Locale;
import java.util.Scanner;

import entites_for_POO_questions.Triangle_entites;

public class Question001_POO {

	public static void main(String[] args) {
		// training 1
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle_entites x, y;
		x = new Triangle_entites();
		y = new Triangle_entites();
		double A1, A2;
		String resp;
		
		do {
			System.out.println("Informe os três lados do triângulo X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
			
			System.out.println("Informe os três lados do triângulo Y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
			
			A1 = x.area();
			System.out.printf("A área do triângulo X é: %.4f%n", A1);
			A2 = y.area();
			System.out.printf("A área do triângulo Y é: %.4f%n", A2);
			
			if (A1 > A2) {
				System.out.println("O triângulo X é o maior traiângulo");
			} else if (A2 > A1) {
				System.out.println("O triângulo Y é o maior triângulo");
			}
			System.out.println("Deseja continuar testando outros valores de triangulo?(Não/Sim) ");
			resp = sc.next();
		} while (resp.equalsIgnoreCase("sim"));
		
		sc.close();
	}
	
}

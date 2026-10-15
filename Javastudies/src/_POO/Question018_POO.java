package _POO;

import java.util.Scanner;

import entites_for_POO_questions.Calculadora;

public class Question018_POO {

	public static void main(String[] args) {
		// training 18
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe dois números para executar as operações: ");
		double nume1 = sc.nextDouble();
		double nume2 = sc.nextDouble();
		System.out.println(Calculadora.adicionar(nume1, nume2));
		System.out.println(Calculadora.subtrair(nume1, nume2));
		System.out.println(Calculadora.multiplicar(nume1, nume2));
		System.out.println(Calculadora.dividir(nume1, nume2));
		System.out.println("A quantidade de operações realizadas é: " + Calculadora.getcontarOperações());
		
		sc.close();
	}

}

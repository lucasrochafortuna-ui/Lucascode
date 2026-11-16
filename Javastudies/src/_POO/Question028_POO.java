package _POO;

import java.util.Scanner;

import entites_for_POO_questions.Formatador;

public class Question028_POO {

	public static void main(String[] args) {
		// training 28
		Scanner sc = new Scanner(System.in);
		
		Formatador formatador = new Formatador();
		System.out.println("Informe um texto qualquer: "); 
		String texto = sc.nextLine();
		System.out.println("Em maiuscula o texto fica: ");
		System.out.println(formatador.formatar(texto));
		System.out.println("Informe se você deseja ver o texto em negrito: ");
		char resposta = sc.nextLine().charAt(0);
		if (Character.toLowerCase(resposta) == 's') {
			System.out.println(formatador.formatar(texto, true));
		} else {
			System.out.println(formatador.formatar(texto, false));
		}
		System.out.println("Informe um valor qualquer: "); 
		double valor = sc.nextDouble();
		System.out.printf("O valor em reais fica: " + formatador.formatar(valor));
		
		sc.close();
	}

}

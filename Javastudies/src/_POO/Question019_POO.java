package _POO;

import java.util.Scanner;

import entites_for_POO_questions.AlturaMedia;

public class Question019_POO {

	public static void main(String[] args) {
		// training 19
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de pessoas que serão contabilizadas: ");
		int quantidade = sc.nextInt();
		int idade = 0;
		double mediaAltura = 0, altura, menorIdade = 0;
		String nome;
		AlturaMedia[] vector = new AlturaMedia [quantidade];
		for (int i = 0 ; i < vector.length ; i++) {
			System.out.println("Dados da " + (i + 1) + " pessoa");
			System.out.print("Nome: ");
			nome = sc.next();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			System.out.print("Idade: ");
			idade = sc.nextInt();
			vector[i] = new AlturaMedia(nome, altura, idade);
			mediaAltura += vector[i].mediaAltura(altura);
			menorIdade += vector[i].menorIdade(idade);
			if (i == vector.length - 1) {
				mediaAltura = mediaAltura / vector.length;
				System.out.printf("A media das alturas é: %.2f%n", mediaAltura);
				menorIdade = (menorIdade / vector.length) * 100;
				System.out.printf("A porcentagem de pessoas com 16 anos ou menos é: %.2f%%%n", menorIdade );
			}
		}
		for (int i = 0 ; i < vector.length ; i++) {
			if (vector[i].getOld() < 16) {
				System.out.println(vector[i].getName());
			}
		}
		
		
		sc.close();
	}

}

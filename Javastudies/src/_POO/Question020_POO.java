package _POO;

import java.util.Scanner;

import entites_for_POO_questions.Notas;

public class Question020_POO {

	public static void main(String[] args) {
		// training 20
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantos alunos serão digitados: ");
		int tamanho = sc.nextInt();
		sc.nextLine();
		Notas[] vector = new Notas[tamanho];
		for (int i = 0 ; i < vector.length ; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "° aluno");
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			vector[i] = new Notas(nome, nota1, nota2);
			sc.nextLine();
		}
		System.out.println("Aprovados: ");
		for (int j = 0 ; j < vector.length ; j++) {
			if (vector[j].aprovado()) {
				System.out.println(vector[j].getName());
			}
		}
		
		sc.close();
	}

}

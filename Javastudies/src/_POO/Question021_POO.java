package _POO;

import java.util.Scanner;

import entites_for_POO_questions.Dados;

public class Question021_POO {

	public static void main(String[] args) {
		// training 21
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantas pessoas serão digitadas: ");
		int tamanho = sc.nextInt();
		double mediaAlturas = 0, menorH = Double.MAX_VALUE, maiorH = Double.MIN_VALUE;
		int quantidadeM = 0, quantidadeH = 0;
		Dados[] vector = new Dados[tamanho];
		for (int i = 0 ; i < vector.length ; i++) {
			System.out.println("Altura da " + (i + 1) + "° pessoa");
			double altura = sc.nextDouble();
			System.out.println("Genero da " + (i + 1) + "° pessoa");
			char sexo = Character.toLowerCase ( sc.next().charAt(0));
			vector[i] = new Dados(altura, sexo);
			if (menorH > altura) {
				menorH = altura;
			}
			if (maiorH < altura) {
				maiorH = altura;
			}
			if (vector[i].getSexo() == 'f') {
				mediaAlturas += vector[i].getAltura();
				quantidadeM++;
			} else {
				quantidadeH++;
			}
			if (i == vector.length - 1) {
				System.out.println("Menor altura: " + menorH);
				System.out.println("Maior altura: " + maiorH);
				System.out.printf("Media das alturas das mulheres: %.2f%n", vector[i].mediaAltura(mediaAlturas, quantidadeM));
				System.out.println("Quantidade de homens: " + quantidadeH);
			}
		}
		
		sc.close();
	}

}

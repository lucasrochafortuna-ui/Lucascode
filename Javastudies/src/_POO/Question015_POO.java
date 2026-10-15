package _POO;

import java.util.Scanner;

import entites_for_POO_questions.Products;


public class Question015_POO {

	public static void main(String[] args) {
		// training 15
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de produtos: ");
		int produtos = sc.nextInt();
		double soma = 0;
		String nomeProdutos;
		Products[] vector = new Products [produtos];
		for (int i = 0 ; i < vector.length ; i ++) {
			System.out.print("Nome: ");
			nomeProdutos = sc.next();
			System.out.print("Preço: ");
			double valor = sc.nextDouble();	
			vector[i] = new Products(nomeProdutos, valor);
			soma = soma + vector[i].getPrice();
		}
		soma = soma / vector.length;
		System.out.printf("A media dos preços é: %.2f", soma);
		sc.close();
	}

}

package _POO;

import java.util.Locale;
import java.util.Scanner;

import entites_for_POO_questions.Product;

public class Question003_POO {

	public static void main(String[] args) {
		// training 3
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product produtovazio = new Product();
		System.out.println(produtovazio);
		
		System.out.println("Insira a data do produto: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		
		
		Product product = new Product(name, price);
		
		System.out.println(product);
		System.out.println("\nInsira o numero de " + product.getName() + " que deseja adicionar no estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		product.loadProducts(product.getName(), product.getPrice(), product.getQuantity());
		System.out.println("\nInsira o numero de " + product.getName() + " que deseja retirar no estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		product.loadProducts(product.getName(), product.getPrice(), product.getQuantity());
		
		sc.close();
	}

}

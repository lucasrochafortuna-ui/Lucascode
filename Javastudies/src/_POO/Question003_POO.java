package _POO;

import java.util.Locale;
import java.util.Scanner;

import entites_for_POO_questions.Product;

public class Question003_POO {

	public static void main(String[] args) {
		// training 3
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Insira a data do produto: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		product.quantity = sc.nextInt();
		System.out.println(product);
		System.out.println("\nInsira o numero de " + product.name + " que deseja adicionar no estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		product.loadProducts(product.name, product.price, product.quantity);
		System.out.println("\nInsira o numero de " + product.name + " que deseja retirar no estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		product.loadProducts(product.name, product.price, product.quantity);
		
		
		sc.close();
	}

}

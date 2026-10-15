package _POO;

import java.util.Locale;
import java.util.Scanner;

import entites_for_POO_questions.Dog;

public class Question014_POO {

	public static void main(String[] args) {
		// training 14
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do seu animal: ");
		String animal = sc.nextLine();
		System.out.print("Informe a raça do seu animal: ");
		String raça = sc.nextLine();
		System.out.print("Informe o peso do seu animal: ");
		double peso = sc.nextDouble();
		
		Dog dog = new Dog(animal, raça, peso);
		System.out.println();
		System.out.println(dog);
		System.out.println();
		System.out.println("Informe quanta comida em gramas que você deseja dar ao animal: ");
		double comida = sc.nextDouble();
		dog.food(comida);
		System.out.println();
		System.out.println(dog);
		System.out.println("Informe novamente quanto de comida deseja dar ao animal: ");
		comida = sc.nextDouble();
		dog.food(comida);
		System.out.println();
		System.out.println(dog);
		
		sc.close();
	}

}

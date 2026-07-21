package _POO;

import java.util.Locale;
import java.util.Scanner;

import entites_for_POO_questions.Rectangle;

public class Question004_POO {

	public static void main(String[] args) {
		// Training 4
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Insira a largura e a altura do retangulo: ");
		rectangle.Width = sc.nextDouble();
		rectangle.Height = sc.nextDouble();
		rectangle.area(rectangle.Width, rectangle.Height);
		rectangle.perimeter(rectangle.Width, rectangle.Height);
		rectangle.Diagonal(rectangle.Width, rectangle.Height);
		System.out.println("\n" + rectangle);
		
		sc.close();
	}

}

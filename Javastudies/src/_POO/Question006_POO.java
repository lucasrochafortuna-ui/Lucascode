package _POO;

import java.util.Locale;
import java.util.Scanner;

import entites_for_POO_questions.School;

public class Question006_POO {

	public static void main(String[] args) {
		// training 6
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		School school = new School();
		
		System.out.print("Informe o seu nome: ");
		school.name = sc.nextLine();
		System.out.println("Informe as suas 3 notas que vc obteve no semestre\nSendo a do primeiro trimestre valendo até 30 e as dos dois ultimos trimestres valendo até 35: ");
		school.nota1 = sc.nextDouble();
		school.nota2 = sc.nextDouble();
		school.nota3 = sc.nextDouble();
		school.Student();
		school.Media();
		System.out.println(school.toString());
		
		
		sc.close();
	}

}

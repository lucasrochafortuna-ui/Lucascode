package questions;

import java.util.Locale;
import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// training 26
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe as suas notas: ");
		double nota1 = sc.nextInt();
		double nota2 = sc.nextInt();
		double nota3 = sc.nextInt();
		double nota4 = sc.nextInt();
		double media = media(nota1, nota2, nota3, nota4);
		if (media >= 7) {
			System.out.println("Você passou no semestre com nota: " + media); 
		} else {
			System.out.println("Você não passou no semestre com nota: " + media);
		}
		
		
		sc.close();
	}
	public static double media(double nota1, double nota2, double nota3, double nota4) {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}

}

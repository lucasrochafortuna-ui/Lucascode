package questions;

import java.util.Locale;
import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// training 26
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe as suas notas: ");
		int nota1 = sc.nextInt();
		int nota2 = sc.nextInt();
		int nota3 = sc.nextInt();
		int nota4 = sc.nextInt();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		if (media >= 7) {
			System.out.println("Você passou no semestre"); 
		} else {
			System.out.println("Você não passou no semestre");
		}
		
		
		sc.close();
	}

}

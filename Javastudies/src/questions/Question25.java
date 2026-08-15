package questions;

import java.util.Locale;
import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// training 25
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Informe o seu nome: ");
		String nome = sc.next();
		System.out.println("Informe o horário em forma de horas, minustos e segundos: ");
		int hora = sc.nextInt();
		int minu = sc.nextInt();
		int segu = sc.nextInt();
		int dia = (hora * 3600) + (minu * 60) + segu;
		System.out.println("Bom dia " + nome + " já se passaram " + dia + " segundos do dia");
		
		
		sc.close();
	}

}

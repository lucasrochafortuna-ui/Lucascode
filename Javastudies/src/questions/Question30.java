package questions;

import java.util.Locale;
import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		// training 30
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Informe diversos números até que seja digitado 10 números pares
		int cont1 = 0, cont2 = 0;
		double imp = 0;
		for (int i = 0 ; i != 10 ;) {
			System.out.println("Informe um número: ");
			int nun = sc.nextInt();
			if (nun % 2 == 0) {
				cont1 += nun;
				i++;
			} else {
				cont2 += nun;
				imp++;
			}
		}
		imp = cont2 / imp;
		System.out.println("Números pares: " + cont1);
		System.out.println("Números impares: " + imp);
		
		sc.close();
	}

}

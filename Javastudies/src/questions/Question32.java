package questions;

import java.util.Locale;
import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		// training 32
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] vector = new int [10];
		int soma = 0;
		//SERA INFORMADO 10 SALARIOS DIFERENTES E DEPOIS SERAO SOMADOS 
		System.out.println("Informe os salários: ");
		for (int i = 0 ; i < 10 ; i++) {
			vector[i] = sc.nextInt();
			soma += vector[i];
		}
		System.out.println("A soma dos salários será: " + soma);
		
		sc.close();
	}

}

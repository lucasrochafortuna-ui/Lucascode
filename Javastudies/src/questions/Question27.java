package questions;

import java.util.Locale;
import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		// training 27
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe o seu sald médio");
		double saldo = sc.nextDouble();
		if (saldo <= 0 && saldo <= 200) {
			System.out.println("Você receberá nenhum crédito");
		} else if (saldo >= 200.01 && saldo <= 400) {
			System.out.println("Você receberá: " + (saldo + 0.2 * saldo));
		} else if (saldo >= 400.01 && saldo <= 600) {
			System.out.println("Você receberá:" + (saldo + 0.3 * saldo));
		} else {
			System.out.println("Você receberá:" + (saldo + 0.4 * saldo));
		}
		
		
		sc.close();
	}

}

package questions;

import java.util.Locale;
import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// training 28
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Será escrito os números de 0 até esse número
		System.out.print("Informe uma número ");
		int nun = sc.nextInt();
		System.out.println("Os números de 0 até esse número são: ");
		for (int i = 0 ; i < nun + 1 ; i++) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}

}

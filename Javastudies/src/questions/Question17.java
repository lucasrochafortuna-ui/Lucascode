package questions;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// training 17 (interval)
		Scanner sc = new Scanner(System.in);
		
		int in = 0, out = 0;
		System.out.print("Quantos números serão lidos: ");
		int x = sc.nextInt();
		for (int i = 0 ; i < x ; i++) {
			System.out.println("Informe um número para saber se ele está dentro do intervalo");
			int y = sc.nextInt();
			if (y >= 10 && y <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + " in\n" + out + " out");
		
		sc.close();
	}

}

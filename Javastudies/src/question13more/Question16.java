package question13more;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// training 16 (dividers)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número para saber todos os números impares de 1 até esse número");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}

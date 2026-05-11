package question13more;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// training 21
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número para saber seus divisores: ");
		int x = sc.nextInt();
		for (int i = 1 ; i <= x ; i++) {
			if (x % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}

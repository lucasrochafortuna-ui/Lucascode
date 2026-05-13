package questions;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		//training6
		Scanner sc =new Scanner(System.in);
				
		System.out.println("Informe quantos numeros da sequência de fibonacci deseja ver: ");
		int x = sc.nextInt();
				
		int y = 1, z = 1, a;
				
		System.out.println(y);
		System.out.println(z);
				
		do {
			a = y + z;
			y =z;
			z =a;
			System.out.println(a);
			x--;
		} while (x > 2);

		sc.close();

	}

}

package question8;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		//training 8
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um numero para saber seus divisores: ");
		int x = sc.nextInt();
		int div = 1;
		System.out.println("Os divisores são: ");
		while (div <= x) {
			if (x % div == 0) {
				System.out.println(div);
			}
			div++;
		}
		
		sc.close();
	}

}

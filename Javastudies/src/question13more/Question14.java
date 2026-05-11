package question13more;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		//training 14 (coordinates)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe duas coordenadas\nPara sair digite 0 em uma das coordenadas ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrante");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto quadrante");
			} else {
				break;
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}

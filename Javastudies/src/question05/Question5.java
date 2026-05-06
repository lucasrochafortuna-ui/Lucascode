package question05;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		//training5fatorial
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número que deseja saber o seu fatorial: ");
		int x = sc.nextInt();
		int cont = x;
		while (x > 1) {
			x--;
			cont = cont * x;
		}
		System.out.println("O fatorial do numero é: " + cont);
		sc.close();
	}

}


package questions;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		//training 12
		Scanner sc = new Scanner(System.in);
				
		int cont = 0, x, z, casa = 0, solt = 0;
		double fem = 0, femi = 0;
		char y;
		do {
			cont++;
			System.out.println("Informe o seu sexo");
			y = sc.next().charAt(0);
			System.out.println("Informe a sua idade");
			x = sc.nextInt();
			System.out.println("Informe o seu estado civil 1[casado]-2[solteiro]");
			z = sc.nextInt();
			if (y == 'f' || y == 'F') {
				fem++;
				femi = femi + x;
			}
			if (z == 1) {
				casa++;
			} else if (z == 2) {
				solt++;
			}
		} while (cont != 5);
		fem = femi / fem;
		System.out.println("A media das idades das mulhers é: " + fem);
		if (casa > solt) {
			System.out.println("O estado civil que ocorreu mais foi o de casado");
		} else if (solt > casa) {
			System.out.println("O estado civil que ocorreu mais foi o de solteiro");
		} else {
			System.out.println("Ocorreu um empate entre os estados civis");
		}
		sc.close();

	}

}

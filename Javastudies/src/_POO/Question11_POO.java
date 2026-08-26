package _POO;

import java.util.Locale;
import java.util.Scanner;

public class Question11_POO {

	public static void main(String[] args) {
		// training 11
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// clothing store 
		
		String resposta;
		System.out.println("|Bem vindo a loja Insider|");
		System.out.println("Você deseja comprar: \n1 Camisa\n2 Short\3 Calça\4 Meia");
		int menu = sc.nextInt();
		do {
			switch (menu) {
			case 1: 
				System.out.println("As camisas da insider custam 150 R$");
				break;
			case 2:
				System.out.println("Os shorts da insider custam 80 R$");
				break;
			case 3:
				System.out.println("As calças da insider custam 200 R$");
				break;
			case 4:
				System.out.println("As meias da insider custam 35 R$");
				break;
			default:
				System.out.println("Opção invalida");
				menu = sc.nextInt();
			}
			System.out.println();
			
		} while (true);
		
		sc.close();
	}

}

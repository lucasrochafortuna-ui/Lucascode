package _POO;

import java.util.Locale;
import java.util.Scanner;

import entites_for_POO_questions.Clothing;

public class Question011_POO {

	public static void main(String[] args) {
		// training 11
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// clothing store 
		
		String menu;
		int quantity;
		double price;
		Clothing clothing = new Clothing();
		System.out.println("|Bem vindo a loja Insider|");
		System.out.println("Você deseja comprar: \n1 Camisa\n2 Short\3 Calça\4 Meia");
		menu = sc.nextLine();
		while(true) {
			switch (menu) {
			case "camisa": 
				System.out.println("As camisas da insider custam 150 R$");
				break;
			case "short":
				System.out.println("Os shorts da insider custam 80 R$");
				break;
			case "calça":
				System.out.println("As calças da insider custam 200 R$");
				break;
			case "meia":
				System.out.println("As meias da insider custam 35 R$");
				break;
			default:
				System.out.println("Opção invalida");
				menu = sc.nextLine();
			}
			clothing.setMenu(menu);
			System.out.println();
			
		}
	}

}

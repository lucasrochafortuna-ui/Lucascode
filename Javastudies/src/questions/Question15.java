package questions;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// training 15 (gas station)
		Scanner sc = new Scanner(System.in);
		
		int cont = 0, alcool = 0, gasolina = 0, diesel = 0;
		System.out.println("Informe o tipo de combustivel\n1 Alcool\n2 Gasolina\n3 Diesel\n4 Sair");
		int x = sc.nextInt();
		while (x != 4) {
			switch (x){
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			case 4: 
				System.out.println("Muito obrigado");
				break;
			default:
				System.out.println("Digite novamente");
				break;
			}
			if (x == 4) {
				break;
			}
			System.out.println("Informe o tipo de combustivel\n1 Alcool\n2 Gasolina\n3 Diesel\n4 Sair");
			x = sc.nextInt();
			cont++;
		}
		System.out.println("A quantidade de cliente que utilizaram o posto é: " + cont);
		System.out.println("Sendo " + alcool + " que queria alcool\nSendo " + gasolina + " que queria gasolina\nSendo " + diesel + " que queria diesel");
		
		sc.close();
	}

}

package questions;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		//training 10
		Scanner sc = new Scanner(System.in);
				
		int z = 0, comp = 0, laz = 0, ali = 0, cont = 0, fem = 0, masc = 0, x = 0;
		double serv = 0;
		do {
				
		System.out.println("Digite 1 se sua ida ao shopping tem relação com compras ");
		System.out.println("Digite 2 se sua ida ao shopping tem relação com serviços[Banco, correio e etc] ");
		System.out.println("Digite 3 se sua ida ao shopping tem relação com Lazer[Cinema, jogos e etc] ");
		System.out.println("Digite 4 se sua ida ao shopping tem relação com Alimentação[restaurantes e lanchonetes] ");
		System.out.println("Digite 5 se quiser sair ");
		System.out.print("Digite: ");
		z = sc.nextInt();
				
			switch (z) {
			case 1:
				comp++;
				break;
			case 2:
				serv++;
				break;
			case 3:
				laz++;
				break;
			case 4:
				ali++;
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Erro na leitura do número, recomece o processo");
				break;
			}
			if (z >= 5) {
				break;
			}
					
			System.out.print("Informe a sua idade: ");
			x = sc.nextInt();
			System.out.print("Informe seu sexo: ");
			String y = sc.next();
					
			if (y.equalsIgnoreCase("feminino")) {
				fem++;
			} else if (y.equalsIgnoreCase("masculino")) {
				masc++;
			} else {
				System.out.println("Sexo invalido");
				continue;
			}
			cont++;
					
		} while (z < 5);
				
		serv = serv / cont;
		System.out.println("O percentual de individuos que buscavam serviços é: " + serv);
		if (masc > fem) {
			System.out.println("Os homens frequentam mais o shopping do que as mulheres");
		} else if (fem > masc) {
			System.out.println("As mulheres frequentam mais o shopping do que os homens");
		} else {
			System.out.println("Há um empate em quem frequenta mais o shopping entre os homens e mulheres");
		}
					
				
		sc.close();

	}

}

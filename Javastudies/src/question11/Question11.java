package question11;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		//training11
		Scanner sc = new Scanner(System.in);
		
		int x = 10, fic = 0, rom = 0, avent = 0;
		double masc = 0, cont = 0;
		String y;
		while (x != 0) {
			System.out.println("1 [Ficção]\n2 [Romance]\n3 [Aventura]\n0 [sair]");
			System.out.print("Digite o seu interesse: ");
			x = sc.nextInt();
			if (x == 0) {
				break;
			} else if (x > 3) {
				System.out.println("numero invalido");
				continue;
			}
			System.out.print("Informe o seu sexo [feminino/masculino]: ");
			y = sc.next();
			cont++;
			switch (x) {
			case 1:
				fic++;
				break;
			case 2:
				rom++;
				 if (y.equalsIgnoreCase("masculino")) {
						masc++;
				 }
				break;
			case 3:
				avent++;
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			}
			
		}
		if (fic > rom && fic > avent) {
			System.out.println("O livro mais vendido foi o de ficção");
		} else if (rom > fic && rom > avent) {
			System.out.println("O livro mais vendido foi o de romance");
		} else if (avent > rom && avent > fic) {
			System.out.println("O livro mais vendido foi o de aventura");
		} else {
			System.out.println("Teve um empate nos livros mais vendidos do mês");
		}
		double perc = masc / cont;
		System.out.println("O percentual de homens que leem livros de romance é: " + perc);
		
		sc.close();
	}

}

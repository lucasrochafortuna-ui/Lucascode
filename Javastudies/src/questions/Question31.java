package questions;

import java.util.Locale;
import java.util.Scanner;

public class Question31 {
	//A INTELIGENCIA ARTIFICIAL QUE DEU ESSA IDEIA
	private static final int SOMA = 1;
	private static final int SUBTRACAO = 2;
	private static final int MULTIPLICACAO = 3;
	private static final int DIVISAO = 4;
	private static final int TROCAR = 5;
	private static final int SAIR = 6;

	public static void main(String[] args) {
		// training 31
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int menu = 0, nun1, nun2;
		boolean i = true;
		do {
			System.out.println("Informe 2 números inteiros: ");
			nun1 = sc.nextInt();
			nun2 = sc.nextInt();
			System.out.println("Escolha uma das opções para continuar: ");
			System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Trocar valores\n6 - Sair");
			menu = sc.nextInt();
			switch(menu) {
			case SOMA:
				nun1 = soma(nun1, nun2);
				System.out.println("Soma: " + nun1);
				break;
			case SUBTRACAO: 
				nun1 = sub(nun1, nun2);
				System.out.println("Subtração: " + nun1);
				break;
			case MULTIPLICACAO: 
				nun1 = mult(nun1, nun2);
				System.out.println("Multiplicação: " + nun1);
				break;
			case DIVISAO: 
				nun1 = div(nun1, nun2);
				System.out.println("Divisão: " + nun1);
				break;
			case TROCAR:
				System.out.println("Troque os valores");
				break;
			case SAIR:
				i = false;
				break;
			default: 
				System.out.println("Número invalido");
				break;
			}
			
		}while (i == true);
		
		sc.close();
	}
	private static int soma(int nun1, int nun2) {
		nun1 += nun2;
		return nun1;
	}
	private static int sub(int nun1, int nun2) {
		nun1 -= nun2;
		return nun1;
	}
	private static int mult(int nun1, int nun2) {
		nun1 *= nun2;
		return nun1;
	}
	private static int div(int nun1, int nun2) {
		if (nun2 == 0) {
			System.out.println("Erro de divisão");
			return 0;
		}
		nun1 /= nun2;
		return nun1;
	}

}

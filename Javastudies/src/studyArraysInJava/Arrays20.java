package studyArraysInJava;

import java.util.Scanner;

public class Arrays20 {
	//JOGO DA VELHA
	static void tabuleiro(String[][] vector) {
		for (int i = 0 ; i < vector.length ; i++) {
			for (int j = 0 ; j < vector[i].length ; j++) {
				System.out.print("|");
				System.out.print(" " + vector[i][j] + " ");
			}
			System.out.println("|");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] vector = new String [3][3];
		boolean vencedor = false;
		String marcardor1 = "X";
		String marcardor2 = "O";
		//MOSTRA O TABULEIRO
		for (int i = 0 ; i < vector.length ; i++) {
			for (int j = 0 ; j < vector[i].length ; j++) {
				vector[i][j] = " ";
			}
		}
		tabuleiro(vector);
		int cont = 0;
		while (vencedor != true) {
			//PEDE A JOGADA DO JODADOR 1
			System.out.println("Jogador 1: Informe a sua jogada por linha e coluna\nUtilizando 1, 2 e 3");
			int linha = sc.nextInt() - 1;
			int coluna = sc.nextInt() - 1;
			verificadordejogada(sc, "Linha: ");
			vector[linha][coluna] = marcardor1;
			tabuleiro(vector);
			cont++;
			//VERIFICA SE O JOGADOR 1 GANHOU
			if (vector[0][0].equals(marcardor1) && vector[0][1].equals(marcardor1) && vector[0][2].equals(marcardor1)||
				vector[1][0].equals(marcardor1) && vector[1][1].equals(marcardor1) && vector[1][2].equals(marcardor1)||
				vector[2][0].equals(marcardor1) && vector[2][1].equals(marcardor1) && vector[2][2].equals(marcardor1)||
				vector[0][0].equals(marcardor1) && vector[1][0].equals(marcardor1) && vector[2][0].equals(marcardor1)||
				vector[0][1].equals(marcardor1) && vector[1][1].equals(marcardor1) && vector[2][1].equals(marcardor1)||
				vector[0][2].equals(marcardor1) && vector[1][2].equals(marcardor1) && vector[2][2].equals(marcardor1)||
				vector[0][0].equals(marcardor1) && vector[1][1].equals(marcardor1) && vector[2][2].equals(marcardor1)||
				vector[0][2].equals(marcardor1) && vector[1][1].equals(marcardor1) && vector[2][0].equals(marcardor1)) {
				System.out.println("Jogador 1 venceu");
				vencedor = true;
				break;
			}
			//PEDE A JOGADA DO JOGADOR 2
			System.out.println("Jogador 2: Informe a sua jogada por linha e coluna\nUtilizando 1, 2 e 3");
			linha = sc.nextInt() - 1;
			coluna = sc.nextInt() - 1;
			vector[linha][coluna] = marcardor2;
			tabuleiro(vector);
			cont++;
			//VERIFICA SE O JOGADOR 2 GANHOU
			if (vector[0][0].equals(marcardor2) && vector[0][1].equals(marcardor2) && vector[0][2].equals(marcardor2)||
				vector[1][0].equals(marcardor2) && vector[1][1].equals(marcardor2) && vector[1][2].equals(marcardor2)||
				vector[2][0].equals(marcardor2) && vector[2][1].equals(marcardor2) && vector[2][2].equals(marcardor2)||
				vector[0][0].equals(marcardor2) && vector[1][0].equals(marcardor2) && vector[2][0].equals(marcardor2)||
				vector[0][1].equals(marcardor2) && vector[1][1].equals(marcardor2) && vector[2][1].equals(marcardor2)||
				vector[0][2].equals(marcardor2) && vector[1][2].equals(marcardor2) && vector[2][2].equals(marcardor2)||
				vector[0][0].equals(marcardor2) && vector[1][1].equals(marcardor2) && vector[2][2].equals(marcardor2)||
				vector[0][2].equals(marcardor2) && vector[1][1].equals(marcardor2) && vector[2][0].equals(marcardor2)) {
				System.out.println("Jogador 2 venceu");
				vencedor = true;
				break;
			}
			//VERIFICA SE TODAS AS CASAS FORAM PREENCHIDAS SEM ALGUM JOGADOR GANHAR
			if (cont == 9) {
				System.out.println("A partida deu velha");
				vencedor = true;
				break;
			}
		}
		sc.close();
	}
	public static int verificadordejogada(Scanner sc, String mensagem) {
		while(true) {
			if (sc.hasNextInt()) {
				int valor = sc.nextInt();
				System.out.println(mensagem);
				if (valor < 1 | valor > 3) {
					System.out.println("Número invalido\nInforme um número entre 1, 2 e 3");
				} else {
					return valor;
				}
			} else {
				System.out.println("Número invalido\nInforme um número entre 1, 2 e 3");
				sc.next();
			}
		}
	}
}
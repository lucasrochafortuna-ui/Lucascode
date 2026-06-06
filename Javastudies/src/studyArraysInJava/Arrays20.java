package studyArraysInJava;

import java.util.Scanner;

public class Arrays20 {
	
	static void tabuleiro(String[][] vector) {
		for (int i = 0 ; i < vector.length ; i++) {
			System.out.print("|");
			for (int j = 0 ; j < vector[i].length; j++) {
				System.out.print(" " + vector[i][j] + " ");
				System.out.print("|");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// JOGO DA VELHA 
		Scanner sc = new Scanner(System.in);
		
		String[][] vector = new String [3] [3];
		String marcardor1 = "X";
		String marcardor2 = "O";
		boolean ganhador = false;
		for (int i = 0 ; i < vector.length ; i++) {
			for (int j = 0 ; j < vector[i].length ; j++) {
				vector[i][j] = " ";
			}
		}
		tabuleiro(vector);
		int linha, coluna, cont = 0;
		while (ganhador != true) {
			System.out.println("Jogador 1: Informe o seu movimento");
			linha = sc.nextInt() - 1;
			coluna = sc.nextInt() - 1;
			vector[linha][coluna] = marcardor1;
			cont++;
			tabuleiro(vector);
			// VERIFICADOR DE JOGADAS
			if (vector[0][0].equals(marcardor1) && vector[1][1].equals(marcardor1) && vector[2][2].equals(marcardor1)||
				vector[0][0].equals(marcardor1) && vector[1][0].equals(marcardor1) && vector[2][0].equals(marcardor1)||
				vector[0][0].equals(marcardor1) && vector[0][1].equals(marcardor1) && vector[0][2].equals(marcardor1)||
				vector[0][2].equals(marcardor1) && vector[1][2].equals(marcardor1) && vector[2][2].equals(marcardor1)||
				vector[2][0].equals(marcardor1) && vector[2][1].equals(marcardor1) && vector[2][2].equals(marcardor1)||
				vector[1][0].equals(marcardor1) && vector[1][1].equals(marcardor1) && vector[1][2].equals(marcardor1)||
				vector[0][1].equals(marcardor1) && vector[1][1].equals(marcardor1) && vector[2][1].equals(marcardor1)||
				vector[0][2].equals(marcardor1) && vector[1][1].equals(marcardor1) && vector[2][0].equals(marcardor1)) {
				System.out.println("O jogador 1 ganhou"); 
				ganhador = true;
				break;
			}
			if (cont == 9) {
				System.out.println("O jogo deu velha");
				ganhador = true;
				break;
			}
			System.out.println("Jogador 2: Informe o seu movimento");
			linha = sc.nextInt() - 1;
			coluna = sc.nextInt() - 1;
			vector[linha][coluna] = marcardor2;
			cont++;
			tabuleiro(vector);
			// VERIFICADOR DE JOGADAS 
			if (vector[0][0].equals(marcardor2) && vector[1][1].equals(marcardor2) && vector[2][2].equals(marcardor2)||
				vector[0][0].equals(marcardor2) && vector[1][0].equals(marcardor2) && vector[2][0].equals(marcardor2)||
				vector[0][0].equals(marcardor2) && vector[0][1].equals(marcardor2) && vector[0][2].equals(marcardor2)||
				vector[0][2].equals(marcardor2) && vector[1][2].equals(marcardor2) && vector[2][2].equals(marcardor2)||
				vector[2][0].equals(marcardor2) && vector[2][1].equals(marcardor2) && vector[2][2].equals(marcardor2)||
				vector[1][0].equals(marcardor2) && vector[1][1].equals(marcardor2) && vector[1][2].equals(marcardor2)||
				vector[0][1].equals(marcardor2) && vector[1][1].equals(marcardor2) && vector[2][1].equals(marcardor2)||
				vector[0][2].equals(marcardor2) && vector[1][1].equals(marcardor2) && vector[2][0].equals(marcardor2)) {
				System.out.println("O jogador 2 ganhou"); 
				ganhador = true;
				break;
			}
		}
		
		sc.close();
	}

}

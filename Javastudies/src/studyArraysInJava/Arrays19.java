package studyArraysInJava;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays19 {

	public static void main(String[] args) {
		// training 19
		Scanner sc = new Scanner(System.in);
		
		int[][] vector = new int [13][3];
		int[] resultado = new int [13];
		String[][] gabarito = new String [13][3];
		System.out.println("Primeira coluna é na vitoria do 1° time, segunda coluna é no empate e 3° coluna é na vitoria do 2° time \nInforme as suas apostas em 13 jogos: \nO para não apostar e 1 para apostar");
		for (int i = 0 ; i < vector.length ; i++) {
			System.out.println("Jogo " + (i+1));
			for (int j = 0 ; j < vector[i].length ; j++) {
				if (j == 0) {
					System.out.println("Time A vence: ");
				} else if (j == 1) {
					System.out.println("Os dois times irão empatar: ");
				} else {
					System.out.println("Time B vence: ");
				}
				vector[i][j] = sc.nextInt();
			}
		}
		System.out.println("Informe os resultados: \n0 para vitoria do time A\n1 para empate\n2 para a vitoria do time B");
		for (int i = 0 ; i < resultado.length ; i++) {
			System.out.println("Informe o resultado do " + (i + 1) + "° jogo");
			resultado[i] = sc.nextInt();
		}
		int cont = 0; 
		for (int i = 0 ; i < vector.length ; i++) {
			int coluna = resultado[i];
			if (vector[i][coluna] == 1) {
				cont++;
				System.out.println("Você acertou o " + (i + 1) + "° jogo");
			} else {
				System.out.println("Você errou o " + (i + 1) + "° jogo");
			}
		}
		System.out.println("Suas apostas: ");
		for (int i = 0 ; i < vector.length ; i++) {
			System.out.println(Arrays.toString(vector[i]));
		}
		System.out.println("Os resultados: ");
		for (int i = 0 ; i < gabarito.length ; i++) {
			for (int j = 0 ; j < gabarito[i].length ; j++) {
				if (j == resultado[i]) {
					gabarito[i][j] = "1";
				} else {
					gabarito[i][j] = "0";
				}
			}
		}
		for (int i = 0 ; i < gabarito.length ; i++) {
			System.out.println(Arrays.toString(gabarito[i]));
		}
		System.out.println("O total de acertos que você deteve foi: " + cont + " /13");
		
		
		sc.close();
	}

}

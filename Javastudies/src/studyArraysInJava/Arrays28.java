package studyArraysInJava;

import java.util.Scanner;

public class Arrays28 {

	public static void main(String[] args) {
		// training 28
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você irá digitar: ");
		int tamanho = sc.nextInt();
		String maisVelho = null;
		int maior = 0;
		int[] idade = new int[tamanho];
		String[] nome = new String[tamanho];
		for (int i = 0 ; i < idade.length ; i++) {
			System.out.println("Dados da " + (i + 1) + " pessoa");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			if (i > 0 && maior < idade[i]) {
				maisVelho = nome[i];
				maior = idade[i];
			} else if (i == 0){
				maisVelho = nome[i];
				maior = idade[i];
			}
		}
		System.out.println("A pessoa mais velha é: " + maisVelho);
		
		sc.close();
	}

}

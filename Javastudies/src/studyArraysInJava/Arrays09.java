package studyArraysInJava;

import java.util.Scanner;

public class Arrays09 {

	public static void main(String[] args) {
		// training 9
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor "); //representará a quantidade de letras que poderão ser digitadas
		int tamanho = sc.nextInt();
		String[] vector1 = new String [tamanho];
		System.out.println("Informe as palavras que estarão no vetor");
		for (int i = 0 ; i < vector1.length ; i++) {
			vector1[i] = sc.next().toLowerCase();
		}
		for (int i = 0 ; i < vector1.length ; i++) {
			for (int j = i + 1 ; j < vector1.length ; j++) {
				if (vector1[i].equals(vector1[j])) {
					System.out.println("As palavras são anagramas");
				} else {
					int[] cont = new int [26];
					for (int k = 0 ; k < vector1[i].length() ; k++) {
						cont[vector1[i].charAt(k) - 'a']++;
					}
					for (int k = 0 ; k < vector1[j].length() ; k++){
							cont[vector1[j].charAt(j) - 'a']++;
					}
				}
			}
		}
		
		sc.close();
	}
}

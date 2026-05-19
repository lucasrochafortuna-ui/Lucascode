package studyArraysInJava;

import java.util.Scanner;

public class Arrays09 {

	public static void main(String[] args) {
		// training 9
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor "); //representará a quantidade de letras que poderão ser digitadas
		int tamanho = sc.nextInt();
		String[] vector1 = new String [tamanho];
		System.out.println("Informe as palavras que estarão no vetor com até 10 caracteres");
		for (int i = 0 ; i < vector1.length ; i++) {
			vector1[i] = sc.next().toLowerCase();
		}
		for (int i = 0 ; i < vector1.length ; i++) {
			for (int j = i + 1 ; j < vector1.length ; j++) {
				String palavra1 = vector1[i];
				String palavra2 = vector1[j];
				
				if (palavra1.equals(palavra2)) {
					System.out.println("As palavras " + palavra1 + " e " + palavra2 + " são anagramas");
					continue;
				}
				if (palavra1.length() != palavra2.length()) {
					System.out.println("As palavras " + palavra1 + " e " + palavra2 + " não são anagramas");
					continue;
				}
				int[] cont = new int [26];
				for (int k = 0 ; k < palavra1.length() ; k++) {
					cont[palavra1.charAt(k) - 'a']++;
					cont[palavra2.charAt(k) - 'a']--;
				}
				boolean anagrama = true;
				for (int k = 0 ; k < 26 ; k++) {
					if (cont[k] != 0) {
						anagrama = false;
						break;
					}
				}
				if (anagrama) {
					System.out.println("As palavras " + palavra1 + " e " + palavra2 + " são anagramas");
				} else {
					System.out.println("As palavras " + palavra1 + " e " + palavra2 + " não são anagramas");
				}
			}
		}
		
		
		sc.close();
	}
}

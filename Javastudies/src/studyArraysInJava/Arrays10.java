package studyArraysInJava;

import java.util.Scanner;

public class Arrays10 {

	public static void main(String[] args) {
		// training 10
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Informe o tamanho do primeiro vetor");
		int[] vector1 = new int [sc.nextInt()];
		System.out.println("Informe o tamanho do segundo vetor");
		int[] vector2 = new int [sc.nextInt()];
		System.out.println("Informe os números que estarão no 1° vetor\nDigite 999 para sair");
		int cont1 = 0, cont2 = 0, vet1 = 0, vet2 = 0;
		for (int i = 0 ; i < vector1.length ; i++) {
			vector1[i] = sc.nextInt();
			if (vector1[i] == 999) {
				break;
			} else if (vector1[i] <= 0){
				i--;
				System.out.println("Número nulo/negativo repita");
				continue;
			}
			cont1++;
		}
		for (int i = 0 ; i < cont1 ; i++) {
			for (int j = 0 ; j < cont1 - i - 1; j++) {
				if (vector1[j] > vector1[j + 1]) {
					int temp = vector1[j];
					vector1[j] = vector1[j + 1];
					vector1[j + 1] = temp;
				}
			}
		}
		for (int i = 0 ; i < cont1 ; i++) {
			if (i > 0 && vector1[i] == vector1[i - 1]) {
				continue;
			}
			vector1[vet1] = vector1[i];
			vet1++;
		}
		System.out.println("Informe os números que estarão no 2° vetor\nDigite 999 para sair");
		for (int i = 0 ; i < vector2.length ; i++) {
			vector2[i] = sc.nextInt();
			if (vector2[i] == 999) {
				break;
			} else if (vector2[i] <= 0){
				i--;
				System.out.println("Número nulo/negativo repita");
				continue;
			}
			cont2++;
		}
		for (int i = 0 ; i < cont1 ; i++) {
			for (int j = 0 ; j < cont1 - i - 1; j++) {
				if (vector2[j] > vector2[j + 1]) {
					int temp = vector2[j];
					vector2[j] = vector2[j + 1];
					vector2[j + 1] = temp;
				}
			}
		}
		for (int i = 0 ; i < cont2 ; i++) {
			if (i > 0 && vector2[i] == vector2[i - 1]) {
				continue;
			}
			vector2[vet2] = vector2[i];
			vet2++;
		}
		
		int[] vector3 = new int [vet1 + vet2];
		
		for (int i = 0; i < cont1 ; i++) {
			vector3[i] = vector1[i];
		}
		int tamanho = 0;	
		for (int i = cont1 ; i < vector3.length ; i++) {
			vector3[i] = vector2[tamanho];
			tamanho++;
		}
				
		for (int i = 0 ; i < vector3.length ; i++) {
			for (int j = 0 ; j < vector3.length - i - 1 ; j++) {
				if (vector3[j] > vector3[j + 1]) {
					int temp = vector3[j];
					vector3[j] = vector3[j + 1];
					vector3[j + 1] = temp;
				}
			}
		}
		tamanho = 0;
		for (int i = 0 ; i < vector3.length; i++) {
			if (i > 0 && vector3[i] == vector3[i - 1]) {
				continue;
			}
			vector3[tamanho] = vector3[i];
			tamanho++;
		}
		System.out.println("O terceiro vetor sem repetições fica");
		for (int i = 0 ; i < tamanho ; i++) {
			System.out.println(vector3[i]);
		}
		
		int tamanho2 = 0;
		int[] vector4 = new int [vet1];
		for (int i = 0 ; i < vet1; i++) {
			tamanho = 0;
			for (int j = 0 ; j < cont2; j++) {
				if (vector1[i] == vector2[j]) {
					tamanho++;
					continue;
				}
			}
			if (tamanho < 1) {
				vector4[tamanho2] = vector1[i];
				tamanho2++;
			}
		}
		System.out.println("O 4° vetor ficará assim: ");
		for (int i = 0 ; i < tamanho2 ; i++) {
			System.out.println(vector4[i]);
		}
				
		sc.close();	

	}

}

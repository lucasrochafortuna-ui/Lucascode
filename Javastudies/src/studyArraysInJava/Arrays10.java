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
		System.out.println("Informe os números que estarão no 1° vetor");
		int cont1 = 0, cont2 = 0;
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
		System.out.println("Informe os números que estarão no 2° vetor");
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
		
		int[] vector3 = new int [cont1 + cont2];
		
		for (int i = 0; i < cont1 ; i++) {
			vector3[i] = vector1[i];
		}
		int p = 0;	
		for (int i = cont1 ; i < vector3.length ; i++) {
			vector3[i] = vector2[p];
			p++;
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
		int tamanho = 0;
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
		int[] vector4 = new int [cont1];
		boolean v = false;
		for (int i = 0 ; i < cont1; i++) {
			for (int j = 0 ; j < cont1 ; j++) {
				if (j > 0 && vector1[i] == vector2[j]) {
					v = false;
					continue;
				} else {
					v = true;
				}
			}
			if (v) {
				vector4[i] = vector1[i];
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

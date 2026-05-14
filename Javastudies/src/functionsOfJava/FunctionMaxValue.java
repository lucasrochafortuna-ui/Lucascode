package functionsOfJava;

import java.util.Scanner;

public class FunctionMaxValue {

	public static void main(String[] args) {
		// function 1 (Max value and showResult)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
	} 
	/*
	Entre as chaves da função main e da classe é possivel criar uma nova função para o código, coomo a main original do java. ({})
	 
	O public ele serve para deixar claro que essa função pode ser chamada para outra, o static ele serve como o executor que permite que essa função seja chamada. (public ; static)
	
	Os parâmetros que utilizamos na noss anova função não necessáriamente necessita apresentar o mesmo nome que o que está dentro da função main. (int x ; int y ; int z)
	*/
	public static int max(int x, int y, int z) {
		int aux; 
		if (x > y && x > z) {
			aux = x;
		} else if (y > x && y > z){
			aux = y;
		} else {
			aux = z;
		}
		return aux; // Vai retornar o valor que foi anexado a aux.
	}
	public static void showResult(int value) { 
	/*
	O comando void significa que a função não tem a intençao de retornar algum valor que foi incrementado nela, então não se usa return em uma função com void. 
	O comando showResult ele serve o mesmo propósito ao System.out.println();
	*/
		System.out.println("Higher: " + value);
	}
}

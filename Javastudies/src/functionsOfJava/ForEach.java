package functionsOfJava;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		// training ForEach
		Scanner sc = new Scanner(System.in);
		
		String[] objeto = new String[] {"Maria", "Joao", "Lucas"};
		for (String obj: objeto) {
			System.out.println(obj);
		}
		int[] idade = {30, 10, 11};
		for (int old : idade) {
			System.out.println(old);
		}
		
		sc.close();
	}

}

package question13more;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// training 22 (lines)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe quantas linhas serão mostradas");
		int x = sc.nextInt();
		for (int i = 1 ; i <= x ; i++) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf ("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		sc.close();
	}

}

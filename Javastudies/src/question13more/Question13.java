package question13more;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		//training 13 (password)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe uma senha de 4 digitos: ");
		int x = sc.nextInt();
		while (x != 2002) {
			System.out.println("Acesso negado");
			System.out.print("Informe uma senha de 4 digitos: ");
			x = sc.nextInt();
		}
		System.out.println("Acesso permitido");
			
		sc.close();
	}

}

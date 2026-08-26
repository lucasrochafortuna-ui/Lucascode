package _POO;

import java.util.Locale;
import java.util.Scanner;

import entites_for_POO_questions.Bookstore;

public class Question009_POO {

	public static void main(String[] args) {
		// training 9
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o seu nome: ");
		String name = sc.nextLine();
		System.out.println("Informe o nome do livro que você deseja alugar: ");
		String bookname = sc.nextLine();
		System.out.println("Deseja alugar quantos exemplares: ");
		int quantity = sc.nextInt();
		sc.nextLine();
		Bookstore BS = new Bookstore(name, bookname, quantity);
		
		System.out.println("Deseja trocar o livro " + BS.name + " ? |Yes ou No|");
		String answer = sc.nextLine();
		char letra = answer.charAt(0); 
		while (true) {
			if (letra == 'y' || letra == 'Y') {
				System.out.print("Nome: ");
				bookname = sc.nextLine();
				break;
			} else if (letra == 'n' || letra == 'N') {
				break;
			} else {
				System.out.println("Resposta invalida");
				letra = sc.nextLine().charAt(0);
				continue;
			}
		}
		BS.setBookname(bookname);
		System.out.println(BS);
		
		sc.close();
	}

}

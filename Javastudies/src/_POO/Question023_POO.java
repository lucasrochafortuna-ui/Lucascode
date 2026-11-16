package _POO;

import java.util.Scanner;

import entites_for_POO_questions.Pensionato;

public class Question023_POO {

	public static void main(String[] args) {
		// training 23
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented: ");
		int rooms = sc.nextInt();
		
		Pensionato[] pensionato = new Pensionato[10];
		
		for (int i = 0 ; i < rooms  ; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: "); 
			int room = sc.nextInt();
			
			pensionato[room] = new Pensionato(name, email, room);
			
		}
		System.out.println("Busy rooms: ");
		for (int i = 0 ; i < pensionato.length ; i++) {
			if (pensionato[i] == null) {
				continue;
			}
			System.out.println(pensionato[i].toString());
		}
		
		sc.close();
	}

}

package _POO;

import java.util.Locale;
import java.util.Scanner;

import entites_for_POO_questions.Gas_Stations;

public class Question002_POO {

	public static void main(String[] args) {
		// training 2
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Gas_Stations c, v;
		c = new Gas_Stations();
		v = new Gas_Stations();
		
		System.out.println("Informe o codigo do posto e o valor inteiro da sua bomba");
		System.out.println("1° posto");
		c.a = sc.nextInt();
		v.a = sc.nextInt();
		System.out.println("2° posto");
		c.b = sc.nextInt();
		v.b = sc.nextInt();
		System.out.println("3° posto");
		c.c = sc.nextInt();
		v.c = sc.nextInt();
		double p1 = v.result(v.a);
		double p2 = v.result(v.b);
		double p3 = v.result(v.c);
		System.out.println("O codigo do 1° posto é: " + c.a + " e o valor da bomba é: " + p1);
		System.out.println("O codigo do 2° posto é: " + c.b + " e o valor da bomba é: " + p2);
		System.out.println("O codigo do 3° posto é: " + c.c + " e o valor da bomba é: " + p3);
		
		sc.close();
	}

}

package _POO;

import java.util.Locale;
import java.util.Scanner;

import entites_for_POO_questions.Monthly_fee;

public class Question10_POO {

	public static void main(String[] args) {
		// training 10
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Monthly_fee mensal = new Monthly_fee();
		System.out.println(mensal);
		
		String name;
		int course;
		double income;
		
		while (true) {
			System.out.println("Informe seu nome completo: ");
			name = sc.nextLine();
			System.out.println("Informe o seu curso: \n1: Medicina\n2: Advocacia\nOutros números: Engenharia");
			course = sc.nextInt();
			System.out.println("Informe a sua renda familiar: ");
			income = sc.nextInt();
			Monthly_fee mensalidade = new Monthly_fee(name, course, income);
			System.out.println(mensalidade);
			mensalidade.Curso(course);
			System.out.println("\nOs dados digitados estão corretos?: ");
			sc.nextLine();
			String dados = sc.nextLine();
			if (dados.equals("S") || dados.equals("s")) {
				break;
			} else {
				System.out.println("Corrigindo...");
			}
		}
		Monthly_fee pagamento = new Monthly_fee();
		pagamento.Renda(income);
		pagamento.Pagamento();
		
		
		
		sc.close();
	}

}

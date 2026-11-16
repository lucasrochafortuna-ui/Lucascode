package _POO;

import java.util.Scanner;

import entites_for_POO_questions.Credencial;

public class Question030_POO {

	public static void main(String[] args) {
		// training 30
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da sua credencial: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Tipo de acesso que deseja: ");
		String tipoAcesso = sc.nextLine();
		Credencial credencial = new Credencial(nome, "010190", tipoAcesso, false, true);
		System.out.println("Tente entrar com o codigo informado no seu email: ");
		credencial.validarAcesso("010190");
		credencial.validarAcesso("010190");
		System.out.println("Criando uma segunda credencial");
		System.out.print("Informe o nome: ");
		nome = sc.nextLine();
		System.out.print("Informe o tipo de acesso: ");
		tipoAcesso = sc.nextLine();
		Credencial credencial2 = new Credencial(nome, "010191", tipoAcesso, false, true);
		credencial2.validarAcesso("010189");
		credencial2.alterarTipoAcesso("Organizador");
		credencial2.cancelarCredencial();
		credencial2.validarAcesso("010191");
		System.out.println("---------------------------------------------");
		System.out.println(credencial.exibirCredencial());
		System.out.println(credencial2.exibirCredencial());
		
		sc.close();
	}

}

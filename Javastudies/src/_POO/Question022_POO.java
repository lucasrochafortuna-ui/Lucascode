package _POO;

import entites_for_POO_questions.Usuario;

public class Question022_POO {

	public static void main(String[] args) {
		// training 22
		
		Usuario appUsuario = new Usuario("ana.souza", "Senha123");
		appUsuario.setSenha("123");
		appUsuario.setSenha("senhaSemNumero");
		System.out.println(appUsuario.setSenha("Segura2026"));
		System.out.println(appUsuario.autenticar("ana.souza", "Segura2026"));
		appUsuario.setAtivo(false);
		System.out.println(appUsuario.autenticar("ana.souza", "Segura2026"));
		
			

	}

}

package entites_for_POO_questions;

public class Usuario {
	private String login;
	private String senha;
	private boolean ativo;
	
	public Usuario(String login, String senhaInicial) {
		this.login = login;
		if (senhaInicial.matches(".*\\d.*") || senhaInicial.length() < 8) {
			this.senha = "Padrao123";
		} else {
			this.senha = senhaInicial;	
		}
		this.ativo = true;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public boolean setSenha(String novaSenha) {
		if (novaSenha.matches(".*\\d.*") && novaSenha.length() >= 8) {
			this.senha = novaSenha;
			return true;
		} else {
			System.out.println("Error");
			return false;
		}
	}
	
	public boolean autenticar(String loginInformado, String senhaInformada) {
		if (loginInformado == this.login && senhaInformada == this.senha && ativo == true) {
			return true;
		}
		return false;
	}
	
}

package entites_for_POO_questions;

public class Credencial {
	private String titular;
	private String codigo;
	private String tipoAcesso;
	private boolean utilizada;
	private boolean ativa;
	public Credencial(String titular, String codigo, String tipoAcesso, boolean utilizada, boolean ativa) {
		this.titular = titular;
		this.codigo = codigo;
		this.tipoAcesso = tipoAcesso;
		this.utilizada = false;
		this.ativa = true;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTipoAcesso() {
		return tipoAcesso;
	}
	public void setTipoAcesso(String tipoAcesso) {
		this.tipoAcesso = tipoAcesso;
	}
	
	public boolean getAtiva() {
		return ativa;
	}
	
	public boolean getUtilizada() {
		return utilizada;
	}
	
	public String exibirCredencial() {
		return "O nome do titular é: " + titular + "\nO codigo é: " + codigo + "\nO tipo de acesso é: " + tipoAcesso + "\nUtilizada: " + utilizada + "\nAtiva: " + ativa;
	}
	
	public boolean validarAcesso(String codigoInformado) {
		if (codigoInformado.equals(codigo) && ativa == true && utilizada == false) {
			System.out.println("A entrada foi permitida com sucesso");
			return utilizada = true;
		}
		System.out.println("A entrada foi negada!!!");
		return utilizada;
	}
	
	public boolean cancelarCredencial() {
		System.out.println("A credencial não pode ser mais utilizada!!!");
		return ativa = false;
	}
	
	public String alterarTipoAcesso(String novoTipo) {
		if (novoTipo.equals(null)||novoTipo.equals("")) {
			System.out.println("Não é aceito valores vazios ou nulos!!!");
			return tipoAcesso;
		} else if(ativa == false || utilizada == true) {
			System.out.println("Não é possivel alterar credenciais canceladas!!!");
			return tipoAcesso;
		}
		this.tipoAcesso = novoTipo;
		return tipoAcesso;
	}
	
}

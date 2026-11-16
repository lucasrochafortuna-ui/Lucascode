package entites_for_POO_questions;

public class Formatador {
	public String formatar(String texto) {
		return texto.toUpperCase();
	}
	public String formatar(String texto, boolean emNegrito) {
		if (emNegrito) {
			return ("\u001B[1m" + texto + "\u001B[0m");
		} else {
			return texto;
		}
	}
	public String formatar(double valor) {
		return String.format("R$: %.2f%n", valor);
	}
}

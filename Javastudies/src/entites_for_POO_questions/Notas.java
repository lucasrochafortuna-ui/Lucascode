package entites_for_POO_questions;

public class Notas {
	private String nome;
	private double nota1;
	private double nota2;
	
	public Notas() {
	}
	public Notas(String name, double nota1, double nota2) {
		this.nome = name;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public String getName() {
		return nome;
	}
	
	public boolean aprovado () {
		if ((nota1 + nota2) / 2 >= 6) {
			return true;
		} else {
			return false;
		}
	}
}

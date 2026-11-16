package entites_for_POO_questions;

public class Pensionato {
	private String name;
	private String email;
	private int room;
	
	public Pensionato() {
	}
	
	public Pensionato(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}
	
	public String toString() {
		return this.room + ": " + this.name + ", " + this.email;
	}
}

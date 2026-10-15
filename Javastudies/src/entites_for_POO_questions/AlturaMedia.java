package entites_for_POO_questions;

public class AlturaMedia {
	private String name;
	private double heigth;
	private int old;
	
	public AlturaMedia() {
		
	}
	
	public AlturaMedia(String name, double higth, int old) {
		this.name = name;
		this.heigth = higth;
		this.old = old;
	}
	
	public String getName() {
		return name;
	}
	
	public int getOld() {
		return old;
	}
	
	public double mediaAltura(double heigth) {
		return heigth;
	}
	
	public int menorIdade (int old) {
		if (old < 16) {
			return 1;
		}
		return 0;
	}
	public String nomeMenor (int old) {
		if (old < 16) {
			return name;
		}
		return null;
	}
}

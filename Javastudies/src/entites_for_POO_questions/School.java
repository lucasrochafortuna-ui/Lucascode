package entites_for_POO_questions;

public class School {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double Student() {
		return nota1 + nota2 + nota3;
	}
	public double Media() {
		return (100 - Student())- 40;
	}
	public String toString() { 
		if (Student() >= 60) {
			return "FINAL GRADE: " + String.format("%.2f",Student()) + "\nPASS";
		} else if (Media() > 0 && Student() < 60){
			return "FINAL GRADE: " + String.format("%.2f",Student()) + "\nFAILED\n" + "Missing " + String.format("%.2f", Media()) + " POINTS";
		} else {
			return "ERROR";
		}
	}
}

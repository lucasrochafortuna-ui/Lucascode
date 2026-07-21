package entites_for_POO_questions;

public class Triangle_entites {
	
	public double a;
	public double b;
	public double c;

	public double area() {
		double P = (a + b + c) / 2;
		return Math.sqrt(P * (P - a) * (P - b) * (P - c));
	}
}

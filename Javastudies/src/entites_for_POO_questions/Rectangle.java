package entites_for_POO_questions;

public class Rectangle {
	public double Width;
	public double Height;
	
	public double area(double Width, double Heigth) {
		return Width * Height;
	}
	public double perimeter(double Width, double Heigth) {
		return (2 * Width) + (2 * Height);
	}
	public double Diagonal(double Width, double Heigth) {
		double P1 = Math.sqrt(Math.pow(Height, 2) + Math.pow(Width, 2));
		return P1;
	}
	public String toString() {
		return String.format("Área = %.2f\nPerimetro = %.2f\nDiagonal = %.2f", area(Width, Height), perimeter(Width, Height), Diagonal(Width, Height));
	}
}

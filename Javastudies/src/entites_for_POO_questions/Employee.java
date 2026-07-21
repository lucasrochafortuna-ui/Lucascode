package entites_for_POO_questions;

public class Employee {
	public String name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary(double GrossSalary, double Tax) {
		return GrossSalary - Tax;
	}
	public void IncreaseSalary(String name) {
		this.name = name;
		
		System.out.println("|Updated data| " + this);
	}
	public String toString() {
		return "Employee: " + name + ", $ " + String.format("%.2f",NetSalary(GrossSalary, Tax)); 
	}
}

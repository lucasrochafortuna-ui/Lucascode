package entites_for_POO_questions;
public class _Employee {
	private String name;
	private int id;
	private double salary;
	
	public _Employee() {
	}
	public _Employee (String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double aumento(int id, double percent) {
		return this.salary = salary + salary * (percent / 100);
	}
	
	public String toString() {
		return ("Name: " + this.name + "\nID: " + this.id) + String.format("\nSalary: %.2f%n", this.salary);
	}
	
}

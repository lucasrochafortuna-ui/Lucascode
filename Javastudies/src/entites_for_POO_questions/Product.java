package entites_for_POO_questions;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public void loadProducts(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		System.out.println("|UPDATED| " + this);
	}
	public String toString() {
		return "Product data: " + name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, total: $ " + String.format("%.2f", totalValueInStock());
	}
}

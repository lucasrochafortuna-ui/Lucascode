package entites_for_POO_questions;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		this("Desconhecido", 0.0, 0);
		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
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
		System.out.println("|UPDATED| " + this);
	}
	public String toString() {
		return "Product data: " 
				+ name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, total: $ " 
				+ String.format("%.2f", totalValueInStock());
	}
}

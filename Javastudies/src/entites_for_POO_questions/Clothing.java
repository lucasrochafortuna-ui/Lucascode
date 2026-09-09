package entites_for_POO_questions;

public class Clothing {
	private String menu;
	private double price;
	private int quantity;

	public Clothing() {
		this ("Desconhecido " , 0.0 , 0);
	}
	
	public Clothing(String menu, double price, int quantity) {
		this.menu = menu;
		this.price = price;
		this.quantity = quantity;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	public void preçototal(double price, int quantity) {
		this.quantity *= this.price;
	}

	public String toString() {
		return "Product data: " + "\nProduto: " + this.menu + "\nPreço: " + this.price + "\nQuantidade: " + this.quantity;
	}
}

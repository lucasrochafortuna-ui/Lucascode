package entites_for_POO_questions;

public class Bookstore {
	public String name;
	public String bookname;
	public int quantity;
	
	public Bookstore(String name, String bookname, int quantity) {
		this.name = name;
		this.bookname = bookname;
		this.quantity = quantity;
		System.out.println("Product data: " + this.name + "\nBook: " + this.bookname + "\nquantity: " + this.quantity);
	}
	public void setBookname (String bookname) {
		this.bookname = bookname;
	}
	public String toString() {
		return "|UPDATE| " + this.name + " " + "\nBook: " + this.bookname + "\nquantity: " + this.quantity;
	}
}

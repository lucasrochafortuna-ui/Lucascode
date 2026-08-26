package entites_for_POO_questions;

public class Clothing {
	private String menu;
	private double price;
	private int quantity;

	public Clothing(String menu, double price, int quantity) {
		this ("Desconhecido " + 0.0 + 0);
	}
	
	
	
	public String escolha (int menu) {
		switch (menu) {
		case 1: 
			return "As camisas da insider custam 150 R$"; 
			break;
		case 2:
			System.out.println("Os shorts da insider custam 80 R$");
			break;
		case 3:
			System.out.println("As calças da insider custam 200 R$");
			break;
		case 4:
			System.out.println("As meias da insider custam 35 R$");
			break;
		default:
			System.out.println("Opção invalida");
			menu = sc.nextInt();
		}
	}
	
	public String toString() {
		return "Product data: " + "\nProduto: " + menu
	}
}

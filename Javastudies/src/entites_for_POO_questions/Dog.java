package entites_for_POO_questions;

public class Dog {
	public String name, race;
	public int hungry = 80;
	public double weight;
	
	public Dog (String name, String race, double weight) {
		this.name = name;
		this.race = race;
		this.weight = weight;
	}
	
	
	public String toString() {
		return "O noem do animal é: " + this.name + "\nA raça do animal é: " + this.race + "\nO peso do animal é: " + this.weight + " KG" + "\nSeu nivel de fome é: " + this.hungry;
	}
	
	
	public void food (double quantityfood) {
		int quantidade = 0, quantidade2 = 0;
		do {
			if (quantityfood >= 50) {
				quantidade += 1;
				quantityfood -= 50;
			} else if (quantityfood >= 5) {
				quantidade2 += 1;
				quantityfood -= 5;
			} else {
				break;
			}
		}while (true);
		
		do {
			if (this.hungry < 5) {
				break;
			} else if (quantidade >= 1) {
				this.hungry -= 10;
				quantidade -= 1;
			} else if (quantidade2 >= 1) {
				this.hungry -= 5;
				quantidade2 -= 1;
			} else {
				break;
			}
			
		} while(true);
		
		if (this.hungry >= 80) {
			System.out.println("O animal está com muita fome");
		} else if(this.hungry < 80 && this.hungry >= 60) {
			System.out.println("O animal está com fome: ");
		} else if (this.hungry < 60 && this.hungry >= 30) {
			System.out.println("O animal não está satisfeito");
		} else if (this.hungry < 30 && this.hungry >= 1) {
			System.out.println("O animal se encontra satisfeito");
		} else if (this.hungry == 0) {
			System.out.println("O animal se encontra extremamente satisfeito");
		} else {
			System.out.println("ERRO");
		}
		
	}
}

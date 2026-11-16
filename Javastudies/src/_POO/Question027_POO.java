package _POO;

import entites_for_POO_questions.Carro;
import entites_for_POO_questions.Moto;

public class Question027_POO {

	public static void main(String[] args) {
		// training 27
		Carro carro = new Carro("Fiat", "Uno", 2000, 4);
		Moto moto = new Moto("kavasaki", "venonXN", 2025, 450);
		System.out.println("A marca do carro é: " + carro.getMarca());
		System.out.println("O modelo do carro é: " + carro.getModelo());
		System.out.println("O ano do carro é: " + carro.getAno());
		System.out.println("A quantidade de portas no carro é: " + carro.getQuantidadeDePortas());
		System.out.println("--------------------------------------");
		System.out.println("A marca da moto é: " + moto.getMarca());
		System.out.println("O modelo da moto é: " + moto.getModelo());
		System.out.println("O ano da moto é: " + moto.getAno());
		System.out.println("O número de cilindradas da moto é: " + moto.getCilindradas());

	}

}

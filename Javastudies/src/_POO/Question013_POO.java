package _POO;

import java.util.Locale;
import java.util.Scanner;

import entites_for_POO_questions.Car;

public class Question013_POO {

	public static void main(String[] args) {
		// training 13
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Car car = new Car();
		
		car.marca = "FIAT";
		
		car.modelo = "UNO";
		
		car.ano = 2015;
		
		car.velocidadeAtual = 20.00;
		
		System.out.println(car);
		
		System.out.println("Informe a velociadade que deseja acelerar ao carro: ");
		double novaVelocidade = sc.nextInt();
		car.acelerar(novaVelocidade);
		System.out.println();
		System.out.println("Ao acelerar o carro a nova velocidade será: ");
		System.out.println(car);
		
		sc.close();
	}

}

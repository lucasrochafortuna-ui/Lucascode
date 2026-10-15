package entites_for_POO_questions;

public class Car {
	public String marca, modelo;
	public int ano;
	public double velocidadeAtual;
	public Car() {
	}
	
	public void acelerar(double novaVelocidadeAtual) {
		velocidadeAtual += novaVelocidadeAtual;
	}
	public String toString() {
		return "A marca do carro é: " + marca + "\nO modelo do carro é: " + modelo + "\nO ano do carro é: " + ano + "\nA velocidade atual dele é: " + String.format("%.2f%n", velocidadeAtual);
	}
	
}

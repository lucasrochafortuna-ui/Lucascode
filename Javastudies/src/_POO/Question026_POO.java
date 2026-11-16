package _POO;

import entites_for_POO_questions.Funcionario;
import entites_for_POO_questions.Gerente;

public class Question026_POO {

	public static void main(String[] args) {
		// training 26
		Funcionario funcionario = new Funcionario("Arthur Dos Santos Rocha", 1478.56);
		Gerente gerente = new Gerente("Lucas Rocha Fortuna Silva", 2000.76, 1000);
		
		System.out.println("Salario do Funcionario: " + funcionario.calcularSalario());
		System.out.println("Salario do Gerente" + gerente.calcularSalario());
		System.out.println("Reajustar salario do funcionario sem o bonus: " + funcionario.reajustarSalario(10));
		System.out.println("Reajustar salario do funcionario sem o bonus: " + funcionario.reajustarSalario(10, 1000));
		System.out.println("Reajustar salario do gerente: " + gerente.reajustarSalario(10, 1000, 1500));
	}

}

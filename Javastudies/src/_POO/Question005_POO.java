package _POO;

import java.util.Locale;
import java.util.Scanner;

import entites_for_POO_questions.Employee;

public class Question005_POO {

	public static void main(String[] args) {
		// training 5
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		double porcentagem;
		
		System.out.print("Informe o nome do funcionário: ");
		employee.name = sc.nextLine();
		System.out.print("Informe o salario bruto do funcionário: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.print("Informe o imposto sobre o salario do funcionário: ");
		employee.Tax = sc.nextDouble();
		employee.NetSalary(employee.GrossSalary, employee.Tax);
		System.out.println(employee.toString());
		System.out.print("Qual a porcentagem que deseja acrescentar no salário do funcionário: ");
		porcentagem = sc.nextDouble();
		employee.GrossSalary += employee.GrossSalary * (porcentagem / 100);
		employee.NetSalary(employee.GrossSalary, employee.Tax);
		employee.IncreaseSalary(employee.name);
		
		
		sc.close();
	}

}

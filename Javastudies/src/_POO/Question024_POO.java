package _POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entites_for_POO_questions._Employee;

public class Question024_POO {

	public static void main(String[] args) {
		// training 24
		Scanner sc = new Scanner(System.in);
		
		List<_Employee> list = new ArrayList<>();
		System.out.print("How many emplyees will be register: ");
		int quantidade = sc.nextInt();
		for (int i = 0 ; i < quantidade ; i++) {
			sc.nextLine();
			System.out.println("Employee " + (i + 1) + ":");
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			_Employee employee = new _Employee(nome, id, salary);
			list.add(employee);
		}
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		if (pos != null) {
			System.out.print("Enter the percent: ");
			double percent = sc.nextDouble();
			list.get(pos).aumento(idSalary, percent);
		} else {
			System.out.println("This id does not exist");
		}
		
		System.out.println("List of employees: ");
		for (int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		
		sc.close();
	}
	public static Integer position(List<_Employee> list, int id) {
		for (int i = 0 ; i < list.size() ; i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}

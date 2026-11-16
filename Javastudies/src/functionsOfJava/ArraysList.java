package functionsOfJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		//Adicionar itens 
		list.add(13);
		list.add(10);
		list.add(34);
		list.add(58);
		for (Integer x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------------------");
		//Adicionar item em uma determinada posição
		list.add(2, 14);
		for (Integer x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------------------");
		//Ver o tamanho da lista
		System.out.println(list.size());
		System.out.println("------------------------------------------");
		//remover um item da lista
		list.remove(0);
		for (Integer x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------------------");
		//Remover por predicado (expecificação) 
		list.removeIf(x -> x < 15);
		for (Integer x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------------------");
		//Encontrar um elemento na lista
		System.out.println(list.indexOf(34));
		System.out.println("------------------------------------------");
		/*Filtra valores que são maiores que 35
		*O filter que faz esse filtro utilizando a operação de lambida
		*O collect ele coleta os valores e converte em List novamente, pois o stream não é do mesmo tipo que Lista
		*/
		List<Integer> result = list.stream().filter(x -> x > 35).toList();
		for (Integer x: result) {
			System.out.println(x);
		}
		System.out.println("------------------------------------------");
		/*Esta filtrando para encontrar um com base no predicado um número entre 10 e 59, o findFirts está preocurando o 1° numero que atende
		 * mas se não encontrar ele imprime null
		*/
		Integer number = list.stream().filter(x -> x > 9 && x < 60).findFirst().orElse(null);
		System.out.println(number);
	}

}

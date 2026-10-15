package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question35 {
	public static class Processos {
		String nome;
		int chegada;
		int surto;
		int restante;
		int espera;
		boolean executado = false;
		Processos (String nome, int chegada, int surto) {
			this.nome = nome;
			this.chegada = chegada;
			this.surto = surto;
			this.restante = surto;
		}
	}

	public static void main(String[] args) {
		// training 35
		Scanner sc = new Scanner(System.in);
		List<Processos> processo = new ArrayList<>(); 
		processo.add(new Processos("P1", 0, 7));
		processo.add(new Processos("P2", 2, 4));
		processo.add(new Processos("P3", 4, 1));
		processo.add(new Processos("P4", 5, 4));
		
		int tempo = 0, tempomedio = 0;
		int concluidos = 0;
		int tamanho = processo.size();
		double tm = 0;
		double tme = 0;
		
		while (concluidos < tamanho){
			Processos atual = null;
			for (Processos p : processo) {
				if (p.chegada <= tempo && p.restante > 0) {
					if (atual == null || atual.restante > p.restante) {
						atual = p;
						if (atual.chegada == tempo && atual.executado == false) {
							atual.espera = 0;
						} else if (atual.chegada < tempo && atual.executado == false) {
							atual.espera = tempo - atual.chegada;
							tme += atual.espera;
						}
						atual.executado = true;
					}
				}
			}
			if (atual == null) {
				System.out.println("A CPU está sem nehum processo no tempo " + tempo);
				tempo++;
				continue;
			}
			System.out.println("Tempo " + tempo + " executando " + atual.nome + "(restante " + atual.restante + ")");
			
			atual.restante--;
			tempo++;
			
			if (atual.restante == 0) {
				System.out.println(">>> " + atual.nome + " finalizado no tempo " + tempo + " <<<");
				tempomedio = tempo - atual.chegada;
				tm += tempomedio;
				concluidos++;
			}
			if (concluidos == processo.size()) {
				tm = tm / concluidos;
				tme = tme / concluidos;
			}
		}
		System.out.println("Todos os processos terminaram no tempo " + tempo);
		System.out.println("Tempo médio de saída: " + tm);
		System.out.println("Tempo medio de espera foi: " + tme);
		
	}
}

package functionsOfJava;
import java.util.*;
public class SJFPreemptivo {

	    static class Processo {
	        String nome;
	        int chegada;
	        int burst;
	        int restante;

	        Processo(String nome, int chegada, int burst) {
	            this.nome = nome;
	            this.chegada = chegada;
	            this.burst = burst;
	            this.restante = burst;
	        }
	    }

	    public static void main(String[] args) {
	        List<Processo> processos = new ArrayList<>();
	        processos.add(new Processo("P1", 0, 8));
	        processos.add(new Processo("P2", 1, 4));
	        processos.add(new Processo("P3", 2, 9));
	        processos.add(new Processo("P4", 3, 5));

	        int tempo = 0;
	        int concluidos = 0;
	        int n = processos.size();

	        while (concluidos < n) {
	            // Escolhe, entre os processos já chegados e não terminados,
	            // aquele com MENOR tempo restante (SRTF)
	            Processo atual = null;
	            for (Processo p : processos) {
	                if (p.chegada <= tempo && p.restante > 0) {
	                    if (atual == null || p.restante < atual.restante) {
	                        atual = p;
	                    }
	                }
	            }

	            if (atual == null) {
	                System.out.println("Tempo " + tempo + ": CPU ociosa");
	                tempo++;
	                continue;
	            }

	            System.out.println("Tempo " + tempo + ": executando " + atual.nome + " (restante: " + atual.restante + ")");

	            atual.restante--;
	            tempo++;

	            if (atual.restante == 0) {
	                System.out.println(">>> " + atual.nome + " finalizado no tempo " + tempo + " <<<");
	                concluidos++;
	            }
	        }

	        System.out.println("\nTodos os processos foram concluídos no tempo " + tempo);
	    }
	}

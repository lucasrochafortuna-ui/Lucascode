package functionsOfJava;

import java.util.ArrayList;
import java.util.Scanner;

import functionsOfJava.SJFPreemptivo.Processo;

public class SimulaProcessos {
	public static class Tabela {
	    ArrayList<String> pronto = new ArrayList<>(); 
	    
	    String execucao = "";
	    String terminado = "";
	    int tempo;
	    
	    public void imprimirLinha() {
	        String listaProntos = String.join(", ", pronto);
	        
	        
	        if(listaProntos == null || listaProntos.isEmpty()) {
	            listaProntos = "--";
	        }
	        if(terminado == null || terminado.isEmpty()) {
	            terminado = "--";
	        }
	        if(execucao == null || execucao.isEmpty()) {
	            execucao = "--";
	        }
	        
	        System.out.printf("Tempo %-3d | Prontos: %-20s | Execução: %-10s | Terminou: %s\n", 
	                          tempo, listaProntos, execucao, terminado);
	    }
	}

	public static class Processo {
		String numProcess;
		int chegada;
		int duracao;
		int tempoSaida;
		int tempoEspera;
		int maisVelho;
		int tempoRestante;
		String status = "AGUARDANDO";
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Processo> lista = new ArrayList<>();
        int op = 0;
        
        System.out.println("--- CONFIGURAÇÃO DOS PROCESSOS ---");
        do {
            Processo processo = new Processo();
            
            System.out.print("Digite o ID do Processo (Ex: P1): ");
            processo.numProcess = sc.next();
            
            System.out.print("Digite o Valor de Chegada: ");
            processo.chegada = sc.nextInt();
            
            System.out.print("Digite o Tempo de Duração de Surto: ");
            processo.duracao = sc.nextInt();
            
            
            processo.tempoRestante = processo.duracao; 
            
            lista.add(processo);
            
            System.out.println("\nQuer Mais Um Processo? (1 = Sim / 0 = Não)");
            op = sc.nextInt(); 
        } while(op == 1);
        
        System.out.println("\n--- INICIANDO SIMULAÇÃO SRTF (SJF PREEMPTIVO) ---\n");

       
        int tempoAtual = 0;
        int processosConcluidos = 0;
        int totalProcessos = lista.size();
        Processo processoEmExecucao = null; 

       
        while (processosConcluidos < totalProcessos) {
            
            Tabela linha = new Tabela();
            linha.tempo = tempoAtual;

            
            for (Processo p : lista) {
                if (p.chegada == tempoAtual && p.status.equals("AGUARDANDO")) {
                    p.status = "PRONTO";
                }
            }

           
            Processo candidato = processoEmExecucao; 
            for (Processo p : lista) {
                if (p.status.equals("PRONTO") || p.status.equals("EXECUTANDO")) {
                    if (candidato == null || candidato.status.equals("TERMINADO")) {
                        candidato = p;
                    } else if (p.tempoRestante < candidato.tempoRestante) {
                        candidato = p; 
                    } else if (p.tempoRestante == candidato.tempoRestante) {
                        
                        if (p.chegada < candidato.chegada) {
                            candidato = p;
                        }
                    }
                }
            }

           
            if (candidato != null && candidato != processoEmExecucao) {
                if (processoEmExecucao != null && !processoEmExecucao.status.equals("TERMINADO")) {
                    processoEmExecucao.status = "PRONTO"; 
                }
                processoEmExecucao = candidato;
                processoEmExecucao.status = "EXECUTANDO"; 
            }

           
            for (Processo p : lista) {
                if (p.status.equals("PRONTO")) {
                    linha.pronto.add(p.numProcess + "(" + p.tempoRestante + ")");
                }
            }
            if (processoEmExecucao != null) {
                linha.execucao = processoEmExecucao.numProcess + "(" + processoEmExecucao.tempoRestante + ")";
            }

            
            if (processoEmExecucao != null) {
                processoEmExecucao.tempoRestante--; 
            }
            
            for (Processo p : lista) {
                if (p.status.equals("PRONTO")) {
                    p.tempoEspera++; 
                }
            }

            
            if (processoEmExecucao != null && processoEmExecucao.tempoRestante == 0) {
                processoEmExecucao.status = "TERMINADO";
                processoEmExecucao.tempoSaida = tempoAtual + 1; 
                linha.terminado = processoEmExecucao.numProcess;
                processosConcluidos++;
                processoEmExecucao = null; 
            }

            
            linha.imprimirLinha();

           
            tempoAtual++;
        }
        
        
        System.out.println("\n--- RESULTADOS FINAIS ---");
        double somaEspera = 0;
        double somaRetorno = 0; 
        
        for (Processo p : lista) {
            int tempoRetorno = p.tempoSaida - p.chegada;
            somaEspera += p.tempoEspera;
            somaRetorno += tempoRetorno;
            
            System.out.println(p.numProcess + " -> Espera: " + p.tempoEspera + " | Retorno (Saída - Chegada): " + tempoRetorno);
        }
        
        System.out.printf("\nMédia de Tempo de Espera: %.2f\n", (somaEspera / totalProcessos));
        System.out.printf("Média de Tempo de Retorno: %.2f\n", (somaRetorno / totalProcessos));
        
        sc.close();
    }
}
package _POO;

import java.util.Scanner;

import entites_for_POO_questions.Arqueiro;
import entites_for_POO_questions.Guerreiro;
import entites_for_POO_questions.Mago;

public class Question029_POO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as informações dos personagens [Gurreiro / Mago / Arqueiro]");
		int quantidade = 0;
		Guerreiro guerreiro = null;
		Arqueiro arqueiro = null;
		Mago mago = null;
		int a = 1, b = 1, c = 1;
		while(quantidade < 3) {
			System.out.println("Digite o nome do personagem que seja inserir os status: ");
			String nome = sc.nextLine();
			System.out.print("Vida maxima: ");
			int vidaMaxima = sc.nextInt();
			System.out.println("Força: ");
			int forca = sc.nextInt();
			System.out.println("Defesa: ");
			int defesa = sc.nextInt();
			sc.nextLine();
			if (nome.equals("Guerreiro") && a > 0) {
				guerreiro = new Guerreiro(nome, vidaMaxima, vidaMaxima, forca, defesa);
				a--;
				quantidade++;
			} else if(nome.equals("Arqueiro") && b > 0) {
				arqueiro = new Arqueiro(nome, vidaMaxima, vidaMaxima, forca, defesa);
				b--;
				quantidade++;
			} else if(nome.equals("Mago") && c > 0) {
				mago = new Mago(nome, vidaMaxima, vidaMaxima, forca, defesa);
				c--;
				quantidade++;
			}
		}
		if (guerreiro != null) {
			System.out.println("O bonus que o guerreiro ganha com a sua arma é o dobro da sua força ");
		}
		if (arqueiro != null) {
			System.out.println("Informe a quantidade de flechas: ");
			int quantidadeFlechas = sc.nextInt();
			arqueiro.setQuantidadeFlechas(quantidadeFlechas);
			System.out.println("Informe a quantidade de precisão do arqueiro: ");
			int precisao = sc.nextInt();
			arqueiro.setBonusPrecisao(precisao);
		}
		if (mago != null) {
			System.out.println("Informe o dano de magia: ");
			int poderMagia = sc.nextInt();
			mago.setPoderMagia(poderMagia);
			System.out.println("Informe o custo por magia: ");
			int custoMagia = sc.nextInt();
			mago.setCustoMagia(custoMagia);
			System.out.println("Informe a mana maxima: ");
			int manaMaxima = sc.nextInt();
			mago.setManaMaxima(manaMaxima);
		}
		guerreiro.exibirStatus();
		arqueiro.exibirStatus();
		mago.exibirStatus();
		guerreiro.atacar(mago);
		mago.atacar(arqueiro);
		arqueiro.atacar(guerreiro);
		arqueiro.atacar(mago);
		arqueiro.atacar(guerreiro);
		if (guerreiro.estaVivo()) {
			System.out.println("Guerreiro continua vivo");
		} else {
			System.out.println("Guerreiro morreu");
		}
		if (arqueiro.estaVivo()) {
			System.out.println("Arqueiro continua vivo");
		} else {
			System.out.println("Arqueiro morreu");
		}
		if (mago.estaVivo()) {
			System.out.println("Mago continua vivo");
		} else {
			System.out.println("Mago morreu");
		}
		guerreiro.exibirStatus();
		arqueiro.exibirStatus();
		mago.exibirStatus();
		
		
		sc.close();
	}

}

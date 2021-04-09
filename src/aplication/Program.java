package aplication;

import java.util.Scanner;

import entities.Pensao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pensao[] vetOcupacao = new Pensao[10];
		String nome, email;
		int escolhido, n;
		
		System.out.println("Qual a quantidade de estudantes irão alugar os quartos?");
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			nome = sc.next();
			sc.nextLine();
			email = sc.nextLine();
			escolhido = sc.nextInt();
			//System.out.println(nome + " " + email + " " + escolhido);
			
			vetOcupacao[escolhido] = new Pensao(nome, email, escolhido);
		}
		
		for (int i=0; i<vetOcupacao.length; i++) {
			if (vetOcupacao[i] != null) {
				vetOcupacao[i].relatorioOcupacao();
			}
		}
		
		sc.close();
	}

}

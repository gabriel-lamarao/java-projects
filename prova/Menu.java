package prova;

import java.util.Scanner;

public class Menu {
	public void menu() {
		Estoque estoque = new Estoque();
		Scanner leia = new Scanner(System.in);
		int opcao;
		int parametro;
		int quantidade;
		System.out.println("Selecione uma opcao");
		System.out.println("1-Registrar entrada de estoque");
		System.out.println("2-Consultar estoque");
		System.out.println("3-Regiatrar saida de estoque");
		System.out.println("4-Sair do sistema");
		opcao = leia.nextInt();
		switch (opcao) {
		case 1:
			//Entrada
			System.out.println("Selecione uma opcao");
			System.out.println("1-Borracha");
			System.out.println("2-Caneta");
			System.out.println("3-Lapis");
			System.out.println("4-Papel");
			parametro = leia.nextInt();
			System.out.println("Digite a quantidade de entrada:");
			quantidade = leia.nextInt();
			estoque.entrada(parametro, quantidade);
			menu();
		case 2:
			//Consulta
			System.out.println(estoque.consulta());
		case 3:
			//Saida
			System.out.println("Selecione uma opcao");
			System.out.println("1-Borracha");
			System.out.println("2-Caneta");
			System.out.println("3-Lapis");
			System.out.println("4-Papel");
			parametro = leia.nextInt();
			System.out.println("Digite a quantidade de saida:");
			quantidade = leia.nextInt();
			estoque.saida(parametro, quantidade);
			menu();
		case 4:
			opcao = 4;
			System.out.println("Até logo!");
			break;
		default:
			System.out.println("Opcao Invalida! Tente novamente");
			menu();
		}
	}
}

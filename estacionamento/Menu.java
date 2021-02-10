package estacionamento;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Menu {
	public void menu(int opcao) {
		
		System.out.println("1-Entrada \n"+"2-Saida \n"+"3-Sair \n");
		
		Scanner entrada = new Scanner(System.in);
		opcao = entrada.nextInt();
		Veiculo novoVeiculo = new Veiculo();
		
		
		switch (opcao) {
		case 1:
			novoVeiculo.getEntrada();
			menu(opcao);
		case 2:
			novoVeiculo.setHoraSaida();
			menu(opcao);
		case 3:
			break;
			
		}
		System.out.println("Saiu");	
			

		
	}
}

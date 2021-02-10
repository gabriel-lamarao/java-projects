package estacionamento;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Veiculo {
	LocalDate dia = LocalDate.now();
	Calendar horas = Calendar.getInstance();
	
	private int horaEntrada = horas.get(Calendar.HOUR_OF_DAY);
	private int minutosEntrada = horas.get(Calendar.MINUTE);
	private int segundosEntrada = horas.get(Calendar.SECOND);
	
	String entrada = (dia+" "+horaEntrada+":"+minutosEntrada+":"+segundosEntrada);
	/*
	private int horaSaida = horas.get(Calendar.HOUR_OF_DAY);
	private int minutosSaida = horas.get(Calendar.MINUTE);
	private int segundosSaida = horas.get(Calendar.SECOND);
	*/
	
	private int horaSaida;
	private int minutosSaida;
	private int segundosSaida;
	
	public int getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a hora de saida: ");
		this.horaEntrada = entrada.nextInt();
	}

	public int getMinutosSaida() {
		return minutosSaida;
	}

	public void setMinutosSaida() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os minutos de saida: ");
		this.minutosEntrada = entrada.nextInt();
	}

	public int getSegundosSaida() {
		return segundosSaida;
	}

	public void setSegundosSaida(int segundosSaida) {
		this.segundosSaida = segundosSaida;
	}

	public void getEntrada(){
		System.out.println(entrada);
	}
	
	public void getSaida() {
		if(minutosSaida < minutosEntrada+15) {
			System.out.println("Saida sem pagamento\n");
		}
		if(minutosSaida > minutosEntrada+15 & horaSaida < horaEntrada+1) {
			System.out.println("Valor do pagamento R$ 5");
		}
		if(minutosSaida > minutosEntrada+15 & horaSaida > horaEntrada+1) {
			int horaExtra = horaSaida-horaEntrada;
			int pagamento = 5 + horaExtra;
			System.out.println("Valor do pagamento R$"+pagamento);
		}
	}
	
}

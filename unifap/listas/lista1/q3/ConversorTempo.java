package unifap.listas.lista1.q3;

public class ConversorTempo {
	public String conversor(int tempoSegundos) {
		int hora;
		int minutos;
		int segundos;
		
		hora = tempoSegundos / 3600;
		minutos = ((tempoSegundos - (hora * 3600)) / 60);
		segundos = tempoSegundos % 60;
		return hora+":"+minutos+":"+segundos;
	}
}

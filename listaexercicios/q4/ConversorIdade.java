package listaexercicios.q4;

public class ConversorIdade {
	public String conversorIdade(int anos, int meses, int dias) {
		int total;
		int bissextos = (anos / 4);
		total = (anos * 12) * 365;
		total += meses * 365;
		total += dias + bissextos;
		return "Dias: " + total;
	}
}

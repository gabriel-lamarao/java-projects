package unifap.provas.prova1.produtos;

public class Papel {
	int resma = 5;
	int saida = 0;
	public int getResma() {
		return this.resma;
	}
	public void entraResma(int quantidade) {
		this.resma = getResma()+quantidade;
	}
	
	public int getSaida() {
		return saida;
	}
	
	public void saidaDeResna(int quantidade) {
		this.resma = getResma()-quantidade;
		this.saida = getSaida()+quantidade;
	}
	public Papel() {
		this.resma = getResma();
		this.saida = getSaida();
	}
}

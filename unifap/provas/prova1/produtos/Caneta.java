package unifap.provas.prova1.produtos;

public class Caneta {
	int caixa = 10;
	int unidade = caixa * 12;
	int saida = 0;
	public int getCaixa() {
		return this.caixa;
	}
	public void entraCaixa(int quantidade) {
		this.caixa = getCaixa()+quantidade;
	}
	public int getUnidade() {
		return unidade;
	}
	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}
	
	public int getSaida() {
		return saida;
	}
	
	public void saidaDeCaixa(int quantidade) {
		this.caixa = getCaixa()-quantidade;
		this.saida = getSaida()+quantidade;
	}
	public Caneta() {
		this.caixa = getCaixa();
		this.unidade = getUnidade();
		this.saida = getSaida();
	}
}

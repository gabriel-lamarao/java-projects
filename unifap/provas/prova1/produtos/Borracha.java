package unifap.provas.prova1.produtos;

public class Borracha {
	int caixa = 1;
	int unidade = caixa * 6;
	int saida = 0;
	public int getCaixa() {
		return caixa;
	}
	public void entraCaixa(int quantidade) {
		this.caixa = getCaixa()+quantidade;
	}
	public int getUnidade() {
		return this.unidade;
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
	public Borracha() {
		this.caixa = getCaixa();
		this.unidade = getUnidade();
		this.saida = getSaida();
	}
	
}

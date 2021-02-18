package unifap.provas.prova1;

import unifap.provas.prova1.produtos.Borracha;
import unifap.provas.prova1.produtos.Caneta;
import unifap.provas.prova1.produtos.Lapis;
import unifap.provas.prova1.produtos.Papel;

public class Estoque {
	Borracha borracha = new Borracha();
	Caneta caneta = new Caneta();
	Lapis lapis = new Lapis();
	Papel papel = new Papel();
	public void entrada(int parametro,int quantidade) {
		if(parametro == 1) {
			borracha.entraCaixa(quantidade);
		}
		if(parametro == 2){
			caneta.entraCaixa(quantidade);
		}
		if(parametro == 3){
			lapis.entraCaixa(quantidade);
		}
		if(parametro == 4){
			papel.entraResma(quantidade);
		}
	}
	
	public String consulta() {
		return "Borrachas "+borracha.getCaixa()+"\n"
				+ "Canetas: "+caneta.getCaixa()+"\n"
				+ "Lapis: "+lapis.getCaixa()+"\n"
				+ "Papel:"+papel.getResma()+"\n";
	}
	public void saida(int parametro, int quantidade) {
		if(parametro == 1) {
			borracha.saidaDeCaixa(quantidade);
			System.out.println("Numero de borrachas retiradas do estoque: "+borracha.getSaida());
		}
		if(parametro == 2) {
			caneta.saidaDeCaixa(quantidade);
			System.out.println("Numero de canetas retiradas do estoque: "+caneta.getSaida());
		}
		if(parametro == 3) {
			lapis.saidaDeCaixa(quantidade);
			System.out.println("Numero de lapis retirados do estoque:"+lapis.getSaida());
		}
		if(parametro == 4) {
			papel.saidaDeResna(quantidade);
			System.out.println("Numero de resmas de papel retirados do estoque:"+papel.getSaida());
		}
	}
}

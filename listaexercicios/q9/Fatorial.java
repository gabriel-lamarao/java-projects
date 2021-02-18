package listaexercicios.q9;

public class Fatorial {
	public void fatorial(int numero) {
		int resultado;
		resultado = numero * (numero-1);
		System.out.println(numero+" x "+(numero-1)+" = "+resultado);
		numero +=  -1;
		if(numero > 0) {
			fatorial(numero);
		}
		
	}
}

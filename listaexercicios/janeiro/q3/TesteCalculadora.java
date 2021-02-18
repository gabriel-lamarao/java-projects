package listaexercicios.janeiro.q3;

public class TesteCalculadora {
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		CalculadoraCientifica cc = new CalculadoraCientifica();
		c.soma(2, 2);
		c.subtracao(2, 2);
		c.multiplicacao(2, 2);
		c.divisao(2, 2);
		cc.raizQuadrada(16);
		cc.potencia(2, 2);
	}
}

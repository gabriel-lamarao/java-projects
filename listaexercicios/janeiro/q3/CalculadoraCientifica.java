package listaexercicios.janeiro.q3;

public class CalculadoraCientifica {
	public void raizQuadrada(double A) {
		double B = Math.sqrt(A);
		System.out.println(A+" R²"+" = "+B);
	}
	public void potencia(double A, int potencia) {
		double B = Math.pow(A, potencia);
		System.out.println(A+"^"+potencia+" = ");
	}
}

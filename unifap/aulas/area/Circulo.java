package unifap.aulas.area;

public class Circulo {
	public double raio;
	
	public double area(double raio) {
		this.raio = raio;
		double raioTotal = Math.PI*(raio*raio);
		return raioTotal;
	}
}

package unifap.aulas.area;

public class Triangulo {
	public double altura;
	public double base;
	
	public double area(double altura, double base) {
		this.altura = altura;
		this.base = base;
		double areaTotal = (altura*base)/2;
		return areaTotal;
	}
}

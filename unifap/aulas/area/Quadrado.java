package unifap.aulas.area;

public class Quadrado {
	public double lado;
	
	public double area(double lado) {
		this.lado = lado;
		double areaTotal = lado*lado;
		return areaTotal;
	}
}

package area;

public class Main {
	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo();
		Quadrado quadrado = new Quadrado();
		Circulo circulo = new Circulo();
		
		System.out.println(triangulo.area(3, 4));
		System.out.println(quadrado.area(2));
		System.out.println(circulo.area(2));
	}
}

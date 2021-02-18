package unifap.listas.lista1.q7;

public class Conceito {
	public void calculaConceito(double media) {
		
		if(media >= 0 && media <= 4.9) {
			System.out.println("D");
		}
		if(media >= 5 && media <=6.9) {
			System.out.println("C");
		}
		if(media >= 7 && media <=8.9 ) {
			System.out.println("B");
		}
		if(media >= 9 && media <=10.0) {
			System.out.println("A");
		}
	}
	
}

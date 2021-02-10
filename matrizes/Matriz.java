package matrizes;

import java.util.Scanner;

// Receba do usuário dois pontos do plano cartesiano
public class Matriz {
	public static void matriz() {
		Scanner entrada =  new Scanner(System.in);
		
		int [] coordenada = new int[2];
		int parar = 0;
		
		// Faz a leitura das coordenadas de X e Y
		System.out.println("Digite a coordenada X:");
		coordenada[0] = entrada.nextInt();
		System.out.println("Digite a coordenada de Y");
		coordenada[1] = entrada.nextInt();
		
		// É um retangulo?
		if(coordenada[0]==coordenada[1]) {
			System.out.println("Nao e um retangulo!");
			parar = 1;
		}
		if(coordenada[0]==0) {
			System.out.println("E uma reta vertical!");
		}
		if(coordenada[1]==0) {
			System.out.println("E uma reta horizontal!");
		}
		
		switch (parar) {
		case 1:
			
			break;

		default:
			// Ler o terceiro ponto
			
			int terceiro;
			System.out.println("Digite o terceiro ponto: ");
			terceiro = entrada.nextInt();
			
			// Acima e esquerda
			if(terceiro > coordenada[1] & terceiro < (coordenada[0]/2)) {
				System.out.println("Acima e a esquerda");
			}
			
			// Acima 
			if(terceiro > coordenada[1] & terceiro == (coordenada[0]/2)) {
				System.out.println("Acima");
			}
			// Acima e direita
			if(terceiro < coordenada[1] & terceiro > (coordenada[0]/2)) {
				System.out.println("Acima e direita");
			}
			
			// Embaixo e a esquerda
			if(terceiro < (coordenada[1]/2) & terceiro < coordenada[0]/2) {
				System.out.println("Embaixo e a esquerda");
			}
			
			// Embaixo
			if(terceiro == (coordenada[0]/2) & coordenada[1] == 0) {
				System.out.println("Embaixo");
			}
			
			// Embaixo e a direita
			if(terceiro > (coordenada[0]/2) & terceiro > (coordenada[1]/2)) {
				System.out.println("Embaixo e a direita");
			}
			
			// Esquerda
			if(terceiro < coordenada[0]/2) {
				System.out.println("Esquerda");
			}
			
			// Direira
			if(terceiro > (coordenada[0]/2)){
				System.out.println("Direita");
			}
			
			// Dentro do retangulo
			if(terceiro < coordenada[0] & terceiro < coordenada[1]) {
				System.out.println("Dentro do retangulo");
			}
			
			// Na linha do retangulo
			if(terceiro == coordenada[0] || terceiro == coordenada[1] 
					|| terceiro <= coordenada[0] & coordenada[1] == 0 
					|| terceiro <= coordenada[1] & coordenada[0] == 0) {
				System.out.println("Na linha do retangulo");
			}
			break;
		}		
	}	
}

package listaexercicios.q8;

import java.util.Scanner;

public class MediaValores {

		public void mediaValores(float numero) {
			int contador = 0;
			int total = 0;
			float media = 0;
			while(numero > 0 ) {	
				contador += 1;
				Scanner entrada = new Scanner(System.in);
				System.out.println("Numero: ");
				numero = entrada.nextFloat();
				total += numero;
			}
			media = total/(contador-1);
			System.out.println("Media aritmetica: "+media);
		}
}

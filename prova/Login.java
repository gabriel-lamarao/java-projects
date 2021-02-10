package prova;

import java.util.Scanner;

public class Login {
	private String usuario = "unifap";
	private String senha = "unifap123";
	public void login() {
		Menu iniciar = new Menu(); 
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o usuario: ");
		String nomeUsuario = leia.next();
		System.out.println("Digite a senha:");
		String senhaUsuario = leia.next();
		if(usuario.equals(nomeUsuario) && senha.equals(senhaUsuario)) {
			System.out.println("Bem vindo");
			iniciar.menu();
		}else {
			System.out.println("Login ou senha incorretos!");
		}
		
	}
}

package main;

import unifap.aulas.empresa.Empresa;
import unifap.aulas.empresa.Funcionario;

public class Main {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		f1.setNome("Gabriel");
		f1.setSalario(2100);
		f1.setCpf("123456789-90");
		f1.setCargo("Desenvolvedor");
		empresa.adicionaFuncionario(f1);
				
		f2.setNome("mario");
		f2.setSalario(3000);
		f2.setCargo("Gerente");
		f2.setCpf("098765432-12");
		empresa.adicionaFuncionario(f2);
		
		f3.setNome("Carlos");
		f3.setSalario(3000);
		f3.setCargo("Gerente");
		f3.setCpf("098765432-12");
		empresa.adicionaFuncionario(f3);
		empresa.getAll();
		System.out.println(empresa.isFuncionario(f2));
	}
}

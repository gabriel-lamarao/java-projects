package unifap.listas.lista2.q2;

public class Teste {
	public static void main(String[] args) {
		CadernoDeEnderecos c = new CadernoDeEnderecos();
		c.setNome("gabriel");
		c.setAniversario("01/02/1965");
		c.setEndereco("Avenida x, 1234 Bairro Y cidade Z");
		c.setTelefone("91 92222-3344");
		c.setEmail("sobrenome.nome@email.com");
		
		c.getAll();
	}
}

package unifap.listas.lista2.q2;

public class CadernoDeEnderecos {
	private String nome;
	private String telefone;
	private String email;
	private String aniversario;
	private String endereco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAniversario() {
		return aniversario;
	}
	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public void getAll() {
		System.out.println("nome: "+nome);
		System.out.println("telefone: "+telefone);
		System.out.println("email: "+email);
		System.out.println("aniversario: "+aniversario);
		System.out.println("endereco: "+endereco);
	}
}

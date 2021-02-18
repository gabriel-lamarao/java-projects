package listaexercicios.janeiro.q4;

public class Empresa {
	private String nome;
	private String endereco;
	private String cidade;
	private String estado;
	private String cep;
	private String fone;
	
	Empresa(){
		
	}
	
	Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone){
		this.nome =  nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.fone = fone;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	
	public void getAll() {
		System.out.println("nome: "+nome);
		System.out.println("endereço: "+endereco);
		System.out.println("cidade: "+cidade);
		System.out.println("estado: "+ estado);
		System.out.println("cep: "+cep);
		System.out.println("fone: "+fone);
	}
	
}

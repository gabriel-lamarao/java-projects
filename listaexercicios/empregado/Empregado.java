package listaexercicios.empregado;

public class Empregado {
	public String nome;
	private String sobrenome;
	private String dataNascimento;
	private long rg;
	private String dataAdmissao;
	private double salario;
	public  static int id;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Empregado(String nome, String sobrenome, String dataNascimento,
			long rg, String dataAdmissao, double salario) {
		id += 1;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	public void mostraDados() {
		System.out.println("Id: "+ id);
		System.out.println("Nome: "+ nome);
		System.out.println("Sobrenome: "+ sobrenome);
		System.out.println("Data Nascimento: "+ dataNascimento);
		System.out.println("Rg: "+ rg);
		System.out.println("Data de Admissao: "+ dataAdmissao);
		System.out.println("Salario: "+ salario);
	}
	
	
	public static void main(String[] args) {
		Empregado empregados[] = new Empregado[2];
		empregados[0] = new Empregado("Gabriel","lamarao","09/09/1997",123450,"01/01/2021",3000);
		empregados[0].mostraDados();
		empregados[1] = new Empregado("Maria","lamarao","01/04/2020",54321,"01/01/2018",3000);
		empregados[1].mostraDados();
		
	}
}

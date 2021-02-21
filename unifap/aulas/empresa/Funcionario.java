package unifap.aulas.empresa;

public class Funcionario {
	private String nome;
	private String cpf;
	private String cargo;
	private int id;
	private double salario;
	
	public Funcionario(){
		id = Empresa.totalDeFuncionarios + 1;
		Empresa.totalDeFuncionarios +=1;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	public String getAll() {
		return "Id: " + id +
				"\n" + "Nome: " + nome +
				"\n" + "Salario: " + salario +
				"\n" + "Cargo: " + cargo;
	}
	
}

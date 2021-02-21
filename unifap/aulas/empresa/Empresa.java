package unifap.aulas.empresa;


public class Empresa {
	private String nome;
	private String cnpj;
	public static int totalDeFuncionarios;
	public Funcionario[] funcionarios;
	
	public Empresa(){
		funcionarios = new Funcionario[10];
	}
	
	public void adicionaFuncionario(Funcionario funcionario) {
		funcionarios[funcionario.getId()-1] = funcionario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void getAll() {
		for (int i = 0; i < totalDeFuncionarios; i++) {
			System.out.println("Index: "+i);
			System.out.println("Nome: "+funcionarios[i].getNome());
			System.out.println("Salario: "+funcionarios[i].getSalario());
		}
	}
	
	public void getAllForEach(){
		for (Funcionario funcionario : funcionarios) {
			System.out.println("Nome: "+funcionario.getNome());
			System.out.println(" Salario: "+funcionario.getSalario());
			System.out.println("Id: "+funcionario.getId());
			System.out.println("Index: "+funcionario.hashCode());
		}
	}
	
	public boolean isFuncionario(Funcionario funcionario) {
		for(int i = 0; i < totalDeFuncionarios;) {
			if(funcionario.equals(funcionarios[i])){
				System.out.println("achei");
				return true;
			}
			else {
				System.out.println("nao achei");
				return false;
			}
		}
		System.out.println("Funcionario "+funcionario.getNome()+" nao encontrado");
		return false;
	}
}

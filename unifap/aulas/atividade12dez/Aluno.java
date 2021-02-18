package unifap.aulas.atividade12dez;

public class Aluno extends Pessoa {
	private long matricula;
	
	public Aluno(String nome, long matricula) {
		super(nome);
		this.matricula = matricula;
	}

	public String toString() {
		return "Nome: "+nome+" matricula: "+matricula;
	}
}

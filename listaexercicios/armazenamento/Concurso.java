package listaexercicios.armazenamento;

public class Concurso {
	public int numeroInscricao;
	public String nome;
	public String naturalidade;
	public String estado;
	public double altura;
	public double peso;
	Concurso participantes[] = new Concurso[30];
	
	public void armazena(String nome, String naturalidade, String estado,
			double altura, double peso) {
		this.numeroInscricao +=1; 
		this.nome = nome;
		this.naturalidade = naturalidade;
		this.estado = estado;
		this.altura = altura;
		this.peso = peso;
		
	}
	
	public void mostraDados() {
		System.out.println(nome);
		System.out.println(naturalidade);
		System.out.println(estado);
		System.out.println(altura);
		System.out.println(peso);
		System.out.println();
	}
	
		
	public void armazenaVetor() {
		for(int i=0; i<30; i++) {
			participantes[i] = new Concurso();
			participantes[i].armazena("nome "+i, "estadoense ", "estado "+(i-6), Math.random(), Math.random());
		}
	}
	
	public void mostraTodosDados() {
		for(int i=0; i<30; i++) {
			participantes[i].mostraDados();
		}
	}
}

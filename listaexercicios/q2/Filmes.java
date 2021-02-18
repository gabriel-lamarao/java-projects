package listaexercicios.q2;

public class Filmes {
	public int codigo;
	public String titulo;
	public String genero;
	public String categoria;
	public double valor;
	
	Filmes filmes[] = new Filmes[500];
	
	public void armazenaVetor() {
		for(int i=0; i<=500; i++) {
			this.codigo+=1;
			filmes[i] = new Filmes();
			filmes[i].armazena(codigo, "filme", "acao", "bom", Math.random());
		}
	}
	
	public void armazena(int codigo, String titulo, String genero,
			String categoria, double valor) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.genero = genero;
		this.categoria = categoria;
		this.valor = valor;
	}
	
	public void mostraDados() {
		System.out.println(codigo);
		System.out.println(titulo);
		System.out.println(genero);
		System.out.println(categoria);
		System.out.println(valor);
	}
	
	public void mostraTodosDados() {
		for(int i=0; i<=500; i++) {
			this.codigo+=1;
			filmes[i] = new Filmes();
			filmes[i].mostraDados();;
		}
	}
	
}

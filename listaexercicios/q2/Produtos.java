package listaexercicios.q2;

public class Produtos {
	public long codigo;
	public String descricao;
	public int quantidadeEstoque;
	public int quantidadeMinima;
	public double preco;
	
	Produtos produtos[] = new Produtos[50];
	
	public void armazenar(long codigo, String descricao, int quantidadeEstoque, 
			int quantidadeMinima, double preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidadeEstoque = quantidadeEstoque;
		this.quantidadeMinima = quantidadeMinima;
		this.preco = preco;
	}
	
	public void mostraDados() {
		System.out.println(codigo);
		System.out.println(descricao);
		System.out.println(quantidadeEstoque);
		System.out.println(quantidadeMinima);
		System.out.println(preco);
	}
	
	
	
}

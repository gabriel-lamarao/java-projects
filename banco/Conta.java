package banco;

public class Conta {
	private long numeroConta;
	private String tipo;
	private String nome;
	private double saldo;
	private double limite;
	
	public long getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public long getNumero() {
		return numeroConta;
	}
	public void setNumero(long numero) {
		this.numeroConta = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean saca(double quantidade) {
		this.saldo = this.saldo - quantidade;
		return true;
	}
	
	public boolean deposita(double quantidade) {
		this.saldo = this.saldo + quantidade;
		return true;
	}
	
	public boolean transfere(double quantidade, Conta conta) {
		this.saldo = this.saldo - quantidade;
		conta.deposita(quantidade);
		return true;
	}
	

}

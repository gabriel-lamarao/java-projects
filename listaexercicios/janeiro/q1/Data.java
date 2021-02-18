package listaexercicios.janeiro.q1;



public class Data {
	private int ano;
	private int mes;
	private int dia;
	
	
	Data(int dia,int mes,int ano){
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if(ano < 0 || ano < 2021|| ano > 2021 ) {
			System.out.println("O valor da variavel ano é invalido!");
		}else {
			this.ano=ano;
		}
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if(mes<=0 || mes > 12) {
			System.out.println("O valor da variavel mes é invalido!");
		}else {
			this.mes=mes;
		}
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		if(dia<0 || dia > 31) {
			System.out.println("O valor da variavel dia é invalido!");
		}else {
			this.dia=dia;
		}
	}
	
	public void displayData() {
		System.out.println("Data fornecida: "+dia+"/"+mes+"/"+ano);
		System.out.println("Data do sistema operacional: "+java.time.LocalDate.now());
	}
	
}

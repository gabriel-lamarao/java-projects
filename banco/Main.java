package banco;


public class Main {
	public static void main(String[] args) {
	Conta c1 = new Conta();
	Conta c2 = new Conta();
	
	c1.setNome("Gabriel");
	c1.setSaldo(200);
	c1.deposita(300);
	c1.transfere(200, c2);
	
	System.out.println(c1.getSaldo());
	System.out.println(c2.getSaldo());
	
	}
}
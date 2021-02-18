package unifap.listas.lista1.q2;

public class Colmeia {
	public int codigo;
	public String regiao;
	public String estado;
	QualificacaoMel qualificacao = new QualificacaoMel();
	public long numeroAbelhas;
	Colmeia dados[] = new Colmeia[100]; 
	
	public void armazena() {
		this.codigo +=1;
		this.regiao = "regiao x";
		this.estado = "estado y";
		
	}
	public void mostraDados() {
		
	}
}

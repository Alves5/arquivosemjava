package AVFPACOTE;

public class AssaltanteViolento_6 extends Assaltante_5{
	public AssaltanteViolento_6(String nome, double altura,String arma) {
		super(nome,altura);
		this.arma = arma;
	}
	private String arma;
	public void atirar() {
		System.out.println("Mandando bala com minha "+this.arma+"...");
	}
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
	}
	
}

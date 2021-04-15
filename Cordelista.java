package AVFPACOTE;

public class Cordelista extends Poeta{
	public Cordelista(String nome,int quantP, int quantC) {
		super(nome,quantP);
		this.quantC = quantC;
	}
	int quantC = 0;
	public void escreverCordel() {
		System.out.println("Escrevendo um cordel...");
		quantC += 1;
	}
	public int getQuantC() {
		return quantC;
	}
	public void setQuantC(int quantC) {
		this.quantC = quantC;
	}
	
}

package AVFPACOTE;

public class Poeta {
	public Poeta(String nome, int quantP) {
		this.nome = nome;
		this.quantP = quantP;
	}
	String nome;
	int quantP = 0;
	public void escrever() {
		System.out.println("Escrevendo um poema...");
		quantP += 1;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantP() {
		return quantP;
	}
	public void setQuantP(int quantP) {
		this.quantP = quantP;
	}
	
}

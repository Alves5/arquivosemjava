package AVFPACOTE;
public class Assaltante_5 {
	public Assaltante_5(String nome, double altura) {
		this.nome = nome;
		this.altura = altura;
	}
	private String nome;
	private double altura;
	public void furtar() {
		System.out.println("Furtanto um pertence...");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}

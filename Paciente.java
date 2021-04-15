package AVFPACOTE;

public class Paciente {
	public Paciente(String nome, int idade, double peso,double altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	String nome;
	int idade;
	double peso;
	double altura;
	public void imc() {
		System.out.println("Seu IMC: "+peso/(altura*altura));
	}
	
}

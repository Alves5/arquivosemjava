package AVFPACOTE;

public class Aluno_9 {
	public Aluno_9(String nome, String curso,double ap1,double ap2) {
		this.nome = nome;
		this.curso = curso;
		this.ap1 = ap1;
		this.ap2 = ap2;
	}
	String nome;
	String curso;
	double ap1,ap2;
	public double Media() {
		double media = 0;
		media = ((this.ap1+this.ap2)/2);
		return media;
	}
}

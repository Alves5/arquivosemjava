package AVFPACOTE;

public class MainAluno {

	public static void main(String[] args) {
		Aluno_9 al1 = new Aluno_9("Gustavo","informática",8.7,9);
		Aluno_9 al2 = new Aluno_9("Felipe","Gastronomia",6,10);
		System.out.println("Aluno 1");
		System.out.println("Nome: "+al1.nome);
		System.out.println("Curso: "+al1.curso);
		System.out.println("Ap1: "+al1.ap1);
		System.out.println("Ap2: "+al1.ap2);
		System.out.println(al1.Media());
		System.out.println("======================");
		System.out.println("Aluno 2");
		System.out.println("Nome: "+al2.nome);
		System.out.println("Curso: "+al2.curso);
		System.out.println("Ap1: "+al2.ap1);
		System.out.println("Ap2: "+al2.ap2);
		System.out.println(al2.Media());
	}

}

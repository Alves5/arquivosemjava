package AVFPACOTE;
import java.util.Scanner;
public class ListaAlunos_10 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		String nome;
		String curso;
		double ap1, ap2;
			System.out.println("Seu nome: ");
			nome = leia.next();
			System.out.println("Seu curso: ");
			curso = leia.nextLine();
			System.out.println("Sua ap1: ");
			ap1 = leia.nextDouble();
			System.out.println("Sua ap2: ");
			ap2 = leia.nextDouble();
			Aluno_9 al1 = new Aluno_9(nome,curso,ap1,ap2);
			
			System.out.println("Seu nome: ");
			nome = leia.next();
			System.out.println("Seu curso: ");
			curso = leia.nextLine();
			System.out.println("Sua ap1: ");
			ap1 = leia.nextDouble();
			System.out.println("Sua ap2: ");
			ap2 = leia.nextDouble();
			Aluno_9 al2 = new Aluno_9(nome,curso,ap1,ap2);
		}
}

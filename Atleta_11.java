package AVFPACOTE;
import java.util.Scanner;
public class Atleta_11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int test;
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Sua testosterona: ");
		test = leia.nextInt();
		if(test > 1400) {
			System.out.println("Nome: "+nome);
			System.out.println("Teste positivo");
		}else {
			System.out.println("Nome: "+nome);
			System.out.println("Teste negativo");
		}
	}

}

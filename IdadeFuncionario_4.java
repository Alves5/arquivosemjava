package AVFPACOTE;
import java.util.Scanner;
public class IdadeFuncionario_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[90];
		int soma = 0;
		int media;
		for(int i =0; i < 5; i++) {
			System.out.println("Digite sua idade: ");
			vetor[i] = leia.nextInt();
			soma += vetor[i];
		}
		media = soma/5;
		System.out.println(media);
	}
}

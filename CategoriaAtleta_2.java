package AVFPACOTE;
import java.util.Scanner;
public class CategoriaAtleta_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		if(idade >= 11 && idade <= 13) {
			System.out.println("Juvenil");
		}else if(idade >= 13 && idade <= 17) {
			System.out.println("Juvenil 2");
		}else if(idade >= 18) {
			System.out.println("Adulto");
		}else {
			System.out.println("Você ainda é muito jovem, tente no próximo ano");
		}
	}
}

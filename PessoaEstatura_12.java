package AVFPACOTE;
import java.util.Scanner;
public class PessoaEstatura_12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		float altura;
		String sexo;
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Digite sua altura: ");
		altura = leia.nextFloat();
		System.out.println("Digite seu sexo: (1 - masculino, 2 - feminino): ");
		sexo = leia.next();
		if(sexo == "masculino" || sexo == "1") {
			if(altura > 1.78) {
				System.out.println("Estatura Alta");
			}else if(altura > 1.65 && altura < 1.78) {
				System.out.println("Estatura média");
			}else {
				System.out.println("Estatura baixa");
			}
		}else {
			if(altura > 1.70) {
				System.out.println("Estatura Alta");
			}else if(altura > 1.59 && altura < 1.70) {
				System.out.println("Estatura média");
			}else {
				System.out.println("Estatura baixa");
			}
		}

	}

}

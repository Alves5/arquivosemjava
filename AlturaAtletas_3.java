package AVFPACOTE;
import java.util.Scanner;
public class AlturaAtletas_3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int altura;
		int maiorA = 0;
		for(int i = 0;i < 5;i++) {
			System.out.println("Digite sua altura: ");
			altura = leia.nextInt();
			if(altura > maiorA) {
				maiorA = altura;
			}
		}
		System.out.println("A maior altura é: "+maiorA);
		
		
	}

}

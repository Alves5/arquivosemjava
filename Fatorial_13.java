package AVFPACOTE;
import java.util.Scanner;
public class Fatorial_13 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int numero;
		int c = 0;
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		for(int i = numero; i > 1; i--) {
			c = i - 1;
			numero = numero * c;
		}
		System.out.println(numero);
	}
}

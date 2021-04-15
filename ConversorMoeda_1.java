package AVFPACOTE;
import java.util.Scanner;
public class ConversorMoeda_1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double dolar = 5.53;
		double euro = 6.75;
		double libra = 7.78;
		double valor;
		double recebe;
		int opcao;
		System.out.println("Digite o valor: ");
		valor = leia.nextDouble();
		System.out.println("Converter para qual moeda: (1 - dolar, 2 - euro, 3 - libra): ");
		opcao = leia.nextInt();
		if(opcao == 1) {
			recebe = valor/dolar;
			System.out.println("Valor convertido para dolar: "+recebe);
		}
		if(opcao == 2) {
			valor = valor/euro;
			System.out.println("Valor converstido para euro: "+valor);
		}
		if(opcao == 3){
			valor = valor/libra;
			System.out.println("Valor convertido para libra: "+valor);
		}
		
	}
}

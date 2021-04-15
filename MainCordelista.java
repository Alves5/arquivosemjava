package AVFPACOTE;
import java.util.Scanner;
public class MainCordelista {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Cordelista co1 = new Cordelista("Manoel",2,7);
		Cordelista co2 = new Cordelista("Gustavo",6,3);
		System.out.println("Cordelista 1");
		System.out.println("Nome: "+co1.getNome());
		System.out.println("Quantidade de poemas: "+co1.getQuantP());
		System.out.println("Quantidade de cordeis: "+co1.getQuantC());
		co1.escrever();
		co1.escreverCordel();
		System.out.println("=============================");
		System.out.println("Cordelista 2");
		System.out.println("Nome: "+co2.getNome());
		System.out.println("Quantidade de poemas: "+co2.getQuantP());
		System.out.println("Quantidade de cordeis: "+co2.getQuantC());
		co2.escrever();
		co2.escreverCordel();

	}

}

package AVFPACOTE;
import java.util.Scanner;
public class MainPoeta {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Poeta po1 = new Poeta("Manoel",2);
		Poeta po2 = new Poeta("Gustavo",6);
		System.out.println("Poeta 1");
		System.out.println("Nome: "+po1.getNome());
		System.out.println("Quantidade de poemas: "+po1.getQuantP());
		po1.escrever();
		System.out.println("=============================");
		System.out.println("Poeta 2");
		System.out.println("Nome: "+po2.getNome());
		System.out.println("Quantidade de poemas: "+po2.getQuantP());
		po2.escrever();
	}	

}

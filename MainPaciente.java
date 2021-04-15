package AVFPACOTE;

import java.util.Scanner;

public class MainPaciente {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		Paciente pa1 = new Paciente("Manoel",20,67.9,1.76);
		Paciente pa2 = new Paciente("Gustavo",34,78,1.70);
		System.out.println("Paciente 1");
		System.out.println("Nome: "+pa1.nome);
		System.out.println("Idade: "+pa1.idade);
		System.out.println("Peso: "+pa1.peso);
		System.out.println("Altura: "+pa1.altura);
		pa1.imc();
		System.out.println("Paciente 2");
		System.out.println("Nome: "+pa2.nome);
		System.out.println("Idade: "+pa2.idade);
		System.out.println("Peso: "+pa2.peso);
		System.out.println("Altura: "+pa2.altura);
		pa2.imc();
	}
	
}

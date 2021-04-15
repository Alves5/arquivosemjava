package AVFPACOTE;
public class MainAssaltante {

	public static void main(String[] args) {
		Assaltante_5 ass1 = new Assaltante_5("Rodrigo",1.74);
		Assaltante_5 ass2 = new Assaltante_5("Gustavo",1.80);
		System.out.println("Assaltante 1");
		System.out.println("Nome: "+ass1.getNome());
		System.out.println("Altura: "+ass1.getAltura());
		ass1.furtar();
		System.out.println("=======================");
		System.out.println("Assaltante 2");
		System.out.println("Nome: "+ass2.getNome());
		System.out.println("Altura: "+ass2.getAltura());
		ass2.furtar();
	}

}

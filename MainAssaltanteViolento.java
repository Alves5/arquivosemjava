package AVFPACOTE;

public class MainAssaltanteViolento {

	public static void main(String[] args) {
		AssaltanteViolento_6 ass1 = new AssaltanteViolento_6("Rodrigo",1.74,"RUS-90");
		AssaltanteViolento_6 ass2 = new AssaltanteViolento_6("Gustavo",1.80,"Artic.50");
		System.out.println("Assaltante 1");
		System.out.println("Nome: "+ass1.getNome());
		System.out.println("Altura: "+ass1.getAltura());
		System.out.println("Arma: "+ass1.getArma());
		ass1.furtar();
		ass1.atirar();
		System.out.println("=======================");
		System.out.println("Assaltante 2");
		System.out.println("Nome: "+ass2.getNome());
		System.out.println("Altura: "+ass2.getAltura());
		System.out.println("Arma: "+ass2.getArma());
		ass2.furtar();
		ass2.atirar();
	}

}

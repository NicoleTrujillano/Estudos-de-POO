package Lista9_Ex3;

public class UsaLampada {

	public static void main(String[] args) {

		Lampada lampada1 = new Lampada(false);
		Lampada lampada2 = new Lampada(true);
		
		System.out.print("Lampada 1: ");
		lampada1.observar();
		System.out.print("Lampada 2: ");
		lampada2.observar();
		
		lampada1.ligar();
		lampada2.desligar();
		
		System.out.print("Lampada 1: ");
		lampada1.observar();
		System.out.print("Lampada 2: ");
		lampada2.observar();
		
	}

}

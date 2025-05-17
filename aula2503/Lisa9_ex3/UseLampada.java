package Lisa9_ex3;

public class UseLampada {

	public static void main(String[] args) {
		
		Lampada lp1 = new Lampada();
		Lampada lp2 = new Lampada();
		lp1.setStatus(false);
		lp2.setStatus(true);
		
		lp1.observar();
		lp2.observar();
		
		lp1.ligar();
		lp2.desligar();
		
		lp1.observar();
		lp2.observar();
		

	}

}

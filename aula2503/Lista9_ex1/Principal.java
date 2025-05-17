package Lista9_ex1;

public class Principal {

	public static void main(String[] args) {

		Computador c1 = new Computador();
		c1.setMarca("HP");
		c1.imprimirDados();
		
		Computador c2 = new Computador("HP", null, null, null, 0);
		c2.imprimirDados();
		
	}

}

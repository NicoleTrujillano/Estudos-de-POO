package Lista9_Ex3;

public class Lampada {
	
	boolean status;
	
	public Lampada(boolean status) {
		this.status = status;
	}
	
	public void ligar() {
		status = true;
	}
	
	public void desligar() {
		status = false;
	}
	
	public void observar() {
		if (status == true) {
			System.out.println("Ligada");
		} else {
			System.out.println("Desligada");
		}
	}

}

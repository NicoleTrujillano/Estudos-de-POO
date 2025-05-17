package Lisa9_ex3;

public class Lampada {

	private boolean status;
	
	// -------------------------------- métodos
	public void ligar() {
		status = true;
	}
	
	public void desligar() {
		status = false;
	}
	public void observar() {
		if(status == true) {
			System.out.println("Lampada: ligada");
		} else {
			System.out.println("Lampada: desligada");
		}
	}

	// -------------------------------- JAVABEAN
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}

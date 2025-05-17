package aula2904;

public abstract class Aeronave {

	protected String modelo;
	protected int capacidade;
	
	public Aeronave() {
	}

	public Aeronave(String modelo, int capacidade) {
		this.modelo = modelo;
		this.capacidade = capacidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	

}

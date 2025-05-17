package aula2904;

public class AviaoCarga extends Aeronave implements Voo {

	public AviaoCarga(String modelo, int capacidade) {
		super(modelo,capacidade);
	}
	
	public void exibirInformacoes() {
		System.out.println("Modelo: "+modelo);
		System.out.println("Capacidade: "+capacidade);
		System.out.println("Tipo de Voo: "+tipoDeVoo());
	}
	
	public String tipoDeVoo() {
		return "Transporte de Carga";
	}
}

package aula2904;

public class PricipalAviao {

	public static void main(String[] args) {

		AviaoComercial ac = new AviaoComercial ("Boing 737", 180);
		ac.exibirInformacoes();
		
		
		AviaoCarga carga = new AviaoCarga ("Airbus Beluga", 50);
		ac.exibirInformacoes();
	}

}

package Lista9_Ex1;

public class Computador {
	
	//atributos: marca, cor, modelo, serie e valor;
	
	String marca, cor, modelo, serie;
	double valor;

	public Computador(String marca, String cor, String modelo, String serie, double valor) {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.serie = serie;
		this.valor = valor;

	}
	
	public void ImprimirDados() {
		System.out.println("\n----------------------------");
		System.out.println("MARCA: "+ marca);
		System.out.println("COR: "+cor);
		System.out.println("MODELO: "+modelo);
		System.out.println("SERIE: "+serie);
		System.out.println("VALOR: "+valor);
		System.out.println("-----------------------------\n");
	}

}

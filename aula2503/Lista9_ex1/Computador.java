package Lista9_ex1;

public class Computador {

	// atributos
	private String marca;
	private String cor;
	private String modelo;
	private String serie;
	private double valor = 0;
	
	// construtores (overload ou sobrecarga - metodos com o mesmo nome, mas com parâmetros diferentes)
	public Computador() {
	}
	public Computador(String marca, String cor, String modelo, String serie, double valor) {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.serie = serie;
		this.valor = valor;
	}
	
	// getters e setters (Encapsulamento)
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//demais métodos
	public void imprimirDados() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Serie: " + serie);
		System.out.println("Valor: " + valor);
	}

}

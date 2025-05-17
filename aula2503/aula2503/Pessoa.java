package aula2503;

public class Pessoa {
	
	// Encapsulamento public protected e private
	private String nome;
	private int idade;
	
	// Cosntrutor com parametros
		public Pessoa(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}

	// Construtor sem parâmetros
	public Pessoa(){
			
	}
	
	
	//JAVABEAN - construtor nulo e permite acesso de getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}

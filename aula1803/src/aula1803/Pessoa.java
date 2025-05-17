package aula1803;

public class Pessoa {
	
	// modificadores public / protected / privado
	// default ou padrao
	
	private String nome;
	private int idade;
	
	// getters e setters
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome () {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}

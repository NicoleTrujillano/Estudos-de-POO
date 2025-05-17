package br.edu.fatecgru.model;

// JavaBean
public class Aluno {

	// atributos
	private int ra;
	private String nome;
	private String email;
	private String dataNascimento;
	private String endereço;
	private int idade;
	
	// construtores
	public Aluno() {
		
	}
	public Aluno(int ra, String nome, String email, String dataNascimento, String endereço, int idade) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.endereço = endereço;
		this.idade = idade;
	}
	
	// getters e setters
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}

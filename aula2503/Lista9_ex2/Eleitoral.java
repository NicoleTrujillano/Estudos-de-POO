package Lista9_ex2;

public class Eleitoral {

	// atributos
	private String nome;
	private int idade;
	
	// construtor
	public Eleitoral() {
	}
	
	// métodos
	public void imprimir() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		verificar();
	}
	
	public void verificar() {
		if(idade <16) {
			System.out.println("O Eleitor nao pode votar");
		} else if (idade >= 16 && idade <= 65) {
			System.out.println("O Eleitor deve Votar");
		} else {
			System.out.println("Voto facultativo");
		}
	}

	// JAVABEAN
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

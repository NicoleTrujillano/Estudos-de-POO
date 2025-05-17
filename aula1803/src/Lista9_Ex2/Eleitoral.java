package Lista9_Ex2;

public class Eleitoral {
	// atributos: nome, e idade
	
	String nome;
	int idade;
	
	public Eleitoral(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void imprimirDados() {
		System.out.println("NOME: "+nome);
		System.out.println("IDADE: "+idade);
	}
	
	public void verificar(int idade) {
		if (idade < 16) {
			System.out.println("O Eleitor nao pode votar");
		} else if (idade >= 16 && idade <=65) {
			System.out.println("O Eleitor deve Votar");
		} else {
			System.out.println("Voto facultativo");
		}
	}
}

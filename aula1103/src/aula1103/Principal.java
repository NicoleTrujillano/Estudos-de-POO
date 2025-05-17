package aula1103;

public class Principal {

	public static void main(String[] args) {
		// Instanciar a classe Pessoa
		Pessoa p = new Pessoa();
		Pessoa p1 = new Pessoa();
		// inicializar os atributos
		p.nome = "Jose";
		p.cpf = 124151;
		
		p.imprimirDados();
		p1.imprimirDados(); 
		
	}

}

package Lista8;

public class TestaConta {
	public static void main(String[] args) {
		// Criacao da conta
		// Inicializacao da conta 
		// Impressao dos dados da conta
		// Saque da conta
		// Impressao dos dados da conta
		// Deposito em conta
		// Impressao dos dados da conta
		// Impressao do saldo da conta, utilizando o metodo getSaldo();
		Conta c = new Conta(7000.00, "1", "Fulano", "01945", 234);
		
		
		c.imprimeDados();
		c.saque(-5000.00);
		c.imprimeDados();
		c.deposito(2000.00);
		c.imprimeDados();
		System.out.println("Saldo: R$" +c.getSaldo());
	}

}

package Ex3_lista7;

public class TestaConta {

	public static void main(String[] args) {

		Conta c = new Conta();

		c.saldo = 10000;
		c.nrAgencia = "1";
		c.titular = "FULANO";
		c.nrConta = "01945";
		c.codBanco = 234;
		
		System.out.println("-----------------------------");
		System.out.print("AGENCIA: "+ c.nrAgencia + " ");
		System.out.println("BANCO: "+ c.codBanco);
		System.out.println("CONTA CORRENTE: "+ c.nrConta);
		System.out.println("TITULAR: "+ c.titular);
		System.out.println("SALDO: "+ c.saldo);
		System.out.println("-----------------------------");

		

	}

}

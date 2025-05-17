package Ex2_lista7;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente c = new Cliente();
		
		c.nomeCliente = "FULANO";
		c.cpfCliente = "234232323";
		
		System.out.println("-----------------------------");
		System.out.println("NOME: " + c.nomeCliente);
		System.out.println("CPF: "+ c.cpfCliente);
		System.out.println("-----------------------------");
	}

}

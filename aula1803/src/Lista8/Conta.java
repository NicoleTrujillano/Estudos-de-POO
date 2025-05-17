package Lista8;

public class Conta {
	
	double saldo;
	String nrAgencia, titular, nrConta;
	int codBanco;

	public Conta(double saldo, String nrAgencia, String titular, String nrConta, int codBanco) {
		this.saldo = saldo;
		this.nrAgencia = nrAgencia;
		this.titular = titular;
		this.nrConta = nrConta;
		this.codBanco = codBanco;
	}
	
	public void saque(double valorSaque) {
		if (valorSaque >0) {
			if(saldo >= valorSaque) {
				saldo = saldo - valorSaque;
				System.out.println("O saque no valor de R$" +valorSaque+ " foi efetuado com sucesso!");
			} else {
				System.out.println("Saldo insuficiente!");		
			}
		} else {
			System.out.println("Valor do saque negativo!");		
		}
	}
	void deposito(double valorDep) {
		 
		if(valorDep > 0) {
			saldo = saldo + valorDep;
			System.out.println("O deposito no valor de R$" +valorDep+ " foi efetuado com sucesso!");
		} else {
			System.out.println("Valor do deposito negativo!");		
		}
	}
	
	// Metodo para impressao de todos os dados da classe
	
	public void imprimeDados() {
		System.out.println("\n----------------------------");
		System.out.println("AGENCIA:\t"+nrAgencia+"\t BANCO:\t"+codBanco);
		System.out.println("Conta: \t"+nrConta);
		System.out.println("TITULAR: \t"+titular);
		System.out.println("SALDO: \t"+saldo);
		System.out.println("-----------------------------\n");
	}
	
	// @return saldo da conta
	
	double getSaldo() {
		return saldo;
	}

}

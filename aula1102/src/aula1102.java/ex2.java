package aula1102;
import java.util.Scanner; //Biblioteca para ler variaveis

public class ex2 {

	public static void main(String[] args) {
		System.out.println("Insira a quantidade e o valor do primeiro produto:");
		
		Scanner sc = new Scanner(System.in); //criando um escaner para ler as variáveis
		
		int q1, v1, q2, v2, total;
		q1 = sc.nextInt(); //Lendo váriavel
		v1 = sc.nextInt();
		System.out.println("Insira a quantidade e o valor do segundo produto:");
		q2 = sc.nextInt();
		v2 = sc.nextInt();
		
		total = (q1 * v1) + (q2 * v2);
		
		System.out.println("Total a ser pago: " +total);

	}

}

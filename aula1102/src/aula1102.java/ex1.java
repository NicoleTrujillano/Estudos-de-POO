package aula1102;
import java.util.Scanner; //Biblioteca para ler variaveis

public class ex1 {

	public static void main(String[] args) {
		System.out.println("Insira 3 nomes");
		
		Scanner sc = new Scanner(System.in); //criando um escaner para ler as variáveis
		
		String x, y, z;
		x = sc.next(); //Lendo váriavel
		y = sc.next();
		z = sc.next();
		
		System.out.println("Nome 1: "+x+ ", " + "Nome 3: " +z+ ",");
		System.out.println("Nome 2: "+y);
	}

}

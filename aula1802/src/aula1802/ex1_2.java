package aula1802;
import java.util.Scanner; //Biblioteca para ler variaveis
public class ex1_2 {

	public static void main(String[] args) {
		System.out.println("Insira 3 valores inteiros:");
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, z, b, valor;
		x = sc.nextInt();
		y = sc.nextInt();
		valor = x>y? x : y; // guardando o maior valor
		z = sc.nextInt();
		valor = z>valor? z : valor; // comparando o valor com o z
		
		System.out.println("O valor maior e: " +valor);

	}

}

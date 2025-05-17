package aula1102;
import java.util.Scanner; //Biblioteca para ler variaveis

public class ex3 {

	public static void main(String[] args) {
		System.out.println("Insira com as seguintes medidas (em metros):");
		System.out.print("Comprimento: ");
		
		Scanner sc = new Scanner(System.in);
		int c,l,area;
		c = sc.nextInt();
		
		System.out.print("Largura: ");
		
		l = sc.nextInt();
		
		area = c * l;
		
		System.out.println("A area total e: " +area);

	}

}

package aula1802;
import java.util.Scanner; //Biblioteca para ler variaveis
public class ex1_3 {

	public static void main(String[] args) {
		System.out.println("Escreva uma frase:");
		
		Scanner sc = new Scanner(System.in);
		String frase = "";
		int tamanho=0;
		
		frase = sc.nextLine();
		tamanho = frase.length();
		
		for(int i = tamanho - 1; i >= 0; i--){
			System.out.print(frase.charAt(i));
		}
		
		
		

	}

}

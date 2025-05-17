package aula1802;
import java.util.Scanner; //Biblioteca para ler variaveis
public class ex3_3 {

	public static void main(String[] args) {
		System.out.println("Insira uma data:");
		
		Scanner sc = new Scanner(System.in);
		
		String dt = sc.nextLine();
		
		System.out.println("Dia: "+ dt.substring(0,2));
		System.out.println("Mes: "+ dt.substring(3,5));
		System.out.println("Ano: "+ dt.substring(6,10));
	}

}

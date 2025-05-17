package aula1102;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		System.out.println("Insira 4 numeros:");
		
		Scanner sc = new Scanner(System.in);
		
		double x,y,z,d, soma, media;
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		d = sc.nextDouble();
		
		soma = x + y + z + d;
		media = (x + y + z + d) / 4;
		
		System.out.println("A media e a soma desses 4 numeros sao, respectivamente: " +media+ " e " +soma+ ".");
	}

}

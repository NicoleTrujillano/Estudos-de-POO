package aula1802;
import java.util.Scanner; //Biblioteca para ler variaveis
public class ex4_2 {

	public static void main(String[] args) {
		System.out.println("Digite um valor minimo e um valor maximo:");
		
		Scanner sc = new Scanner(System.in);
		int v1, v2;
		double vf;
		v1 = sc.nextInt();
		v2 = sc.nextInt();
		
		vf = v1 + (Math.random() * (v2-v1));
		
		System.out.println("Um numero aleatório entre os valores máximo e mínimo recebidos e: " +vf);
		
	}

}

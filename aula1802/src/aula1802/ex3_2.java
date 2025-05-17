package aula1802;

public class ex3_2 {

	public static void main(String[] args) {
		
		int valor=1, i=1;
		
		do {
			valor = valor*i;
			i = i + 2;
		}while(i <= 15);

		System.out.println("O produto dos inteiros ímpares de 1 a 15 e: " +valor);
	}

}

package aula1802;

public class ex2_2 {

	public static void main(String[] args) {
		int valor = 0, i = 1;
		
		do {
			valor = valor + i;
			i++;
		}while(i <= 100);

		System.out.println("A soma dos cem primeiros números inteiros e: " +valor);
	}

}

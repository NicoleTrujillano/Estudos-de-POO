package aula1802;

public class ex2_3 {

	public static void main(String[] args) {
		String palavra="Java";
		int tamanho, x = 0;
		tamanho = palavra.length();
		for(int i = 0; i <= tamanho; i++) {
			System.out.println(palavra.substring(x,i));
		}
		for(int i = tamanho - 1; i >= 0; i--) {
			System.out.println(palavra.substring(x,i));
		}

	}

}

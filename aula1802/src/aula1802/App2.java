package aula1802;

public class App2 {

	public static void main(String[] args) {
		
		String palavra = "Exemplo";
		System.out.println(palavra.charAt(6));
		System.out.println(palavra.indexOf('e'));
		System.out.println(palavra.indexOf("pl"));
		//
		System.out.println(palavra.length());
		System.out.println(palavra.toLowerCase());
		System.out.println(palavra.toUpperCase());
		System.out.println(palavra.valueOf('e'));
		palavra = "caraguatatuba";
		System.out.println(palavra.substring(3,7));

	}

}

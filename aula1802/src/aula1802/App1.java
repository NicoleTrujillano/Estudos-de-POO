package aula1802;

public class App1 {

	public static void main(String[] args) {
		
		// valor absoluto
		System.out.println( Math.abs(-10)); // Resultado igual a 10
		// raiz quadrada
		System.out.println( Math.sqrt(625)); // Resultado igual a 25
		// exponencial
		System.out.println( Math.pow(2,3)); // Resultado igual a 8
		// numero aleatorio entre 0 e 1
		System.out.println( (int) (Math.random()*60)); // Resultado: qualquer valor entre 0.0 (inclusive) e menor que 1.0 
		
		int a = 2;
		int b = 3;
		int c = 4;
		
		System.out.println(a = b>c? b : c); 
		// condição (b ser maior que c), se sim então a será igual a b, senão a será igual a c
		
		
		

	}

}

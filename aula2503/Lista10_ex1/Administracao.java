package Lista10_ex1;
import javax.swing.JOptionPane;

public class Administracao {

	public static void main(String[] args) {

		int n;
		Populacao p = new Populacao(4,5);

		for (int i=0; i<4; i++){
			for (int j=0; j<5; j++){
			n = Integer.parseInt(JOptionPane.showInputDialog("Informe a população da cidade " + String.valueOf(j+1) + "\ndo estado " + String.valueOf(i+1)));
			p.atualizarPopulacao(n);
			
			}
		}
		p.popMedia();
	}

}

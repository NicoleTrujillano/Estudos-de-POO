package Lista10_ex1;

public class Populacao {
	private int pop[ ][ ] = new int [4][5];
	public int estados=0, municipios=0, medpop=0, poptotal = 0;
	
	
	public Populacao(int estados, int municipios) {
		this.estados = estados;
		this.municipios = municipios;
	}
	
	public void atualizarPopulacao(int populacao){
		for (int i=0; i<4; i++){
			for (int j=0; j<5; j++){
				pop[i][j] = populacao;
			}
		}
	}

	public void popMedia() {
		for (int i=0; i<4; i++){
			for (int j=0; j<5; j++){
				poptotal = poptotal + pop[i][j];
			}
		}	
		medpop = poptotal / (estados * municipios);
		System.out.println("População média: "+medpop);
	}


}

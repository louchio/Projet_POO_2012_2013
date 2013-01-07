package cases_du_tapis;

import materiels.Tapis;

public class Numero{
	private int numero;
	private Tapis tapis;
	private PartieCaseNumero partie_case_numero[];
	
	public Numero(int numero, Tapis tapis, PartieCaseNumero[] partie_case) {
		this.numero = numero;
		this.tapis = tapis;
		
		////// initialiser partie_case en fonction du nombre de billes......
		this.partie_case_numero = partie_case;
	}

	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Tapis getTapis() {
		return tapis;
	}

	public void setTapis(Tapis tapis) {
		this.tapis = tapis;
	}

	public PartieCaseNumero[] getPartie_case() {
		return partie_case_numero;
	}

	public void setPartie_case(PartieCaseNumero[] partie_case) {
		this.partie_case_numero = partie_case;
	}
	

	
}

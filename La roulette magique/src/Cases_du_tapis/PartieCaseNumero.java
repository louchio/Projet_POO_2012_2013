package Cases_du_tapis;

import java.awt.Color;

public class PartieCaseNumero extends Mise{	
	private int indice;				// l'indice de la partie de la case
	
	public PartieCaseNumero(int indice, int coef, Color couleur) {
		super(coef, couleur);
		this.indice = indice;
	}
	
	public PartieCaseNumero(int indice, int coef, int mise, Color couleur) {
		super(coef, mise, couleur);
		this.indice = indice;	
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
	
}

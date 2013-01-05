package Cases_du_tapis;

import java.awt.Color;

public class PartieCaseNumero extends Mise{	
	private Color couleur;

	public PartieCaseNumero(Color couleur, int coef, int mise) {
		super(coef, mise);
		this.couleur = couleur;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
		
}

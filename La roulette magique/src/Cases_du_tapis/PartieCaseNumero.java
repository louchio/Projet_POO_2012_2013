package Cases_du_tapis;

import java.awt.Color;

public class PartieCaseNumero{	
	private Color couleur;
	private int coef_multiplicateur;
	private int mise;

	public PartieCaseNumero(Color couleur, int coef_multiplicateur, int mise) {
		super();
		this.couleur = couleur;
		this.coef_multiplicateur = coef_multiplicateur;
		this.mise = mise;
	}

	
	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}

	public int getCoef_multiplicateur() {
		return coef_multiplicateur;
	}

	public void setCoef_multiplicateur(int coef_multiplicateur) {
		this.coef_multiplicateur = coef_multiplicateur;
	}

	public int getMise() {
		return mise;
	}

	public void setMise(int mise) {
		this.mise = mise;
	}
		
}

package Cases_du_tapis;

import java.awt.Color;

public class Mise {
	private int coef_multiplicateur;
	private int mise;
	private Color couleur; // la couleur de la case sur laquelle on mise..
	
	
	// constructeur avec 2 paramètres 
	public Mise(int coef_multiplicateur, Color couleur) {
		super();
		this.coef_multiplicateur = coef_multiplicateur;
		this.couleur = couleur;
	}

	// constructeur avec 3 paramètres 
	public Mise(int coef_multiplicateur, int mise, Color couleur) {
		this.coef_multiplicateur = coef_multiplicateur;
		this.mise = mise;
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

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
	
	
}

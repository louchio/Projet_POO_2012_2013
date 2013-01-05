package Matériels;

import vitesse.Vitesse;

import java.awt.Color;

public class Bille{
	private Color couleur;
	private Vitesse vit;
	private int poids;
	
	public Bille(Color couleur, Vitesse vit, int poids) {
		this.couleur = couleur;
		this.vit = vit;
		this.poids = poids;
	}
	
	public Color getCouleur() {
		return couleur;
	}
	
	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
	
	public Vitesse getVitesse() {
		return vit;
	}
	
	public void setVitesse(Vitesse vit) {
		this.vit = vit;
	}
	
	public int getPoids() {
		return poids;
	}
	
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
}

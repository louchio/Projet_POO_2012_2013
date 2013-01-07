package cases_du_tapis;

import java.awt.Color;

public class Impair extends Mise{
	private int liste_impair[];
	
	public Impair(int coef, Color couleur) {
		super(coef, couleur);
		// initialiser liste impair
	}
	
	public Impair(int coef, int mise, Color couleur) {
		super(coef, mise, couleur);
		// initialiser liste impair
	}
	
	
	public int[] getListe_impair() {
		return liste_impair;
	}

	public void setListe_impair(int[] liste_impair) {
		this.liste_impair = liste_impair;
	}	
}

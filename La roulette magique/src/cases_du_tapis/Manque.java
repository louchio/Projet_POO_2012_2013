package cases_du_tapis;

import java.awt.Color;

public class Manque extends Mise {
	private int liste_manque[];
	
	public Manque(int coef, Color couleur) {
		super(coef, couleur);
		// initialiser liste pair
	}

	public Manque(int coef, int mise, Color couleur) {
		super(coef, mise, couleur);
		// initialiser liste pair
	}	
	
	
	public int[] getListe_manque() {
		return liste_manque;
	}

	public void setListe_manque(int[] liste_manque) {
		this.liste_manque = liste_manque;
	}
	
	
}

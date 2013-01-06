package Cases_du_tapis;

import java.awt.Color;

public class Pair extends Mise{
	private int liste_pair[];
	
	public Pair(int coef, Color couleur) {
		super(coef, couleur);
		// initialiser liste pair
	}

	public Pair(int coef, int mise, Color couleur) {
		super(coef, mise, couleur);
		// initialiser liste pair
	}
	
	public int[] getListe_pair() {
		return liste_pair;
	}

	public void setListe_pair(int[] liste_pair) {
		this.liste_pair = liste_pair;
	}

}

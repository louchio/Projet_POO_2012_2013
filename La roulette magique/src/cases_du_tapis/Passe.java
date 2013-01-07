package cases_du_tapis;

import java.awt.Color;

public class Passe extends Mise{
	private int liste_passe[];
	
	public Passe(int coef, Color couleur) {
		super(coef, couleur);
		// initialiser liste passe
	}
	
	public Passe(int coef, int mise, Color couleur) {
		super(coef, mise, couleur);
		// initialiser liste passe
	}

	public int[] getListe_passe() {
		return liste_passe;
	}

	public void setListe_passe(int[] liste_passe) {
		this.liste_passe = liste_passe;
	}
	
	

}

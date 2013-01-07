package cases_du_tapis;

import java.awt.Color;
import java.util.ArrayList;

public class Manque extends Mise implements Liste{
	private ArrayList<Integer> liste_manque;
	
	public Manque(int coef, Color couleur) {
		super(coef, couleur);
		// initialiser liste pair
	}

	public Manque(int coef, int mise, Color couleur) {
		super(coef, mise, couleur);
	}	
	
	
	public ArrayList<Integer> getListe_manque() {
		return liste_manque;
	}

	public void setListe_manque(ArrayList<Integer> liste_manque) {
		this.liste_manque = liste_manque;
	}

	public void initialiserListe(ArrayList<Integer> l) {
		liste_manque = new ArrayList<Integer>();
		int i = 0;
		while(i<19)
		{
			liste_manque.add(i);
		}
	}
	
}

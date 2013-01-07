package cases_du_tapis;

import java.awt.Color;
import java.util.ArrayList;

public class Pair extends Mise{
	private ArrayList liste_pair;
	
	public Pair(int coef, Color couleur) {
		super(coef, couleur);
		liste_pair = new ArrayList<Integer>();
		for(int i=2; i<=36; i=i+2){
			liste_pair.add(i);
		}
	}

	public Pair(int coef, int mise, Color couleur) {
		super(coef, mise, couleur);
		// initialiser liste pair
	}
	
	public ArrayList getListe_pair() {
		return liste_pair;
	}

	public void setListe_pair(ArrayList liste_pair) {
		this.liste_pair = liste_pair;
	}

}

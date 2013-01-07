package cases_du_tapis;

import java.awt.Color;
import java.util.ArrayList;

public class Pair extends Mise implements Liste{
	private ArrayList<Integer> liste_pair;
	
	public Pair(int coef, Color couleur) {
		super(coef, couleur);
		initialiserListe(liste_pair);
	}

	public Pair(int coef, int mise, Color couleur) {
		super(coef, mise, couleur);
		initialiserListe(liste_pair);
	}
	
	public ArrayList<Integer> getListe_pair() {
		return liste_pair;
	}

	public void setListe_pair(ArrayList<Integer> liste_pair) {
		this.liste_pair = liste_pair;
	}

	public void initialiserListe(ArrayList<Integer> l) {
		liste_pair = new ArrayList<Integer>();
		for(int i=2; i<=36; i=i+2){
			liste_pair.add(i);
		}
	}
}

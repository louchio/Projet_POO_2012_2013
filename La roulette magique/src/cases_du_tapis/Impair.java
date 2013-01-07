package cases_du_tapis;

import java.awt.Color;
import java.util.ArrayList;

public class Impair extends Mise{
	private ArrayList<Integer> liste_impair;
	
	public Impair(int coef, Color couleur) {
		super(coef, couleur);

		liste_impair = new ArrayList<Integer>();
		for(int i=1; i<=35; i=i+2){
			liste_impair.add(i);
		}
		
		//liste_impair = {0, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35};
	}
	
	public Impair(int coef, int mise, Color couleur) {
		super(coef, mise, couleur);
		// initialiser liste impair
	}
	
	
	public ArrayList<Integer> getListe_impair() {
		return liste_impair;
	}

	public void setListe_impair(ArrayList<Integer> liste_impair) {
		this.liste_impair = liste_impair;
	}	
}

package cases_du_tapis;

import java.awt.Color;
import java.util.ArrayList;

public class Passe extends Mise implements Liste{
	private ArrayList<Integer> liste_passe;
	
	public Passe(int coef, Color couleur) {
		super(coef, couleur);
		initialiserListe(liste_passe);
	}
	
	public Passe(int coef, int mise, Color couleur) {
		super(coef, mise, couleur);
		initialiserListe(liste_passe);
	}

	public ArrayList<Integer> getListe_passe() {
		return liste_passe;
	}

	public void setListe_passe(ArrayList<Integer> liste_passe) {
		this.liste_passe = liste_passe;
	}

	public void initialiserListe(ArrayList<Integer> l) {
		liste_passe = new ArrayList<Integer>();
		int i = 19;
		while(i<37)
		{
			liste_passe.add(i);
			i++;
		}
		
	}
}

package Materiels;

import vitesse.Vitesse;

public class Roue {
	private int nb_Billes;
	private Vitesse vit;
	private Bille liste_bille[];
	private Tapis tapis;
	
	/* Constructeur */
	
	public Roue(int nb_Billes, Vitesse vit, Bille[] liste_bille, Tapis tapis) {
		this.nb_Billes = nb_Billes;
		this.vit = vit;
		this.liste_bille = liste_bille;
		this.tapis = tapis;
	}	
	
	/* Setteurs et getteurs */
	
	public int getNb_Billes() {
		return nb_Billes;
	}


	public void setNb_Billes(int nb_Billes) {
		this.nb_Billes = nb_Billes;
	}

	public Vitesse getVit() {
		return vit;
	}

	public void setVit(Vitesse vit) {
		this.vit = vit;
	}

	public Bille[] getListe_bille() {
		return liste_bille;
	}

	public void setListe_bille(Bille[] liste_bille) {
		this.liste_bille = liste_bille;
	}

	public Tapis getTapis() {
		return tapis;
	}

	public void setTapis(Tapis tapis) {
		this.tapis = tapis;
	}
	
	
	/* Autres methodes*/

	public void tourner()
	{
		vit = new Vitesse(10);
	}	
	
}

package Materiels;

import Cases_du_tapis.*;

public class Tapis {
	private Roue roue;
	private int nbre_cases;
	private Numero liste_numeros[];
	private Passe passe;
	private Manque manque;
	private Impair impair;
	private Pair pair;

	public Tapis(Roue roue, int nbre_cases) {
		this.roue = roue;
		this.nbre_cases = nbre_cases;
		// ........................
		// créer les cases(numeros) (avec les couleurs..)
		// et remplire liste_numeros
		// manque, passe.. 
		
	}

	public int getNbre_cases() {
		return nbre_cases;
	}

	public void setNbre_cases(int nbre_cases) {
		this.nbre_cases = nbre_cases;
	}
	
	public Roue getRoue() {
		return roue;
	}

	public void setRoue(Roue roue) {
		this.roue = roue;
	}

	
	public void calculGain()
	{
		
	}
}

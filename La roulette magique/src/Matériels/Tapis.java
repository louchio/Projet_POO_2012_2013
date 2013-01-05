package Matériels;

import Cases_du_tapis.*;

public class Tapis {
	private Roue roue;
	private int nbre_cases;
	private Numero liste_cases[];
	private Gagne gagne;

	public Tapis(Roue roue, int nbre_cases) {
		this.roue = roue;
		this.nbre_cases = nbre_cases;
		// ........................
		// créer les cases... (avec les couleurs..)
		// et remplire liste_cases
		
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

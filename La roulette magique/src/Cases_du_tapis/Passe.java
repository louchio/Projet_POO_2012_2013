package Cases_du_tapis;

public class Passe extends Mise{
	private int liste_passe[];
	
	public Passe(int coef, int mise) {
		super(coef, mise);
		// initialiser liste passe
	}

	public int[] getListe_passe() {
		return liste_passe;
	}

	public void setListe_passe(int[] liste_passe) {
		this.liste_passe = liste_passe;
	}
	
	

}

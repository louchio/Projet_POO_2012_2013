package Cases_du_tapis;

public class Manque extends Mise {
	private int liste_manque[];
	
	public Manque(int coef, int mise) {
		super(coef, mise);
		// initialiser liste pair
	}

	public int[] getListe_manque() {
		return liste_manque;
	}

	public void setListe_manque(int[] liste_manque) {
		this.liste_manque = liste_manque;
	}
	
	
}

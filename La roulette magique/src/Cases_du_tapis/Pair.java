package Cases_du_tapis;

public class Pair extends Mise{
	private int liste_pair[];
	
	public Pair(int coef, int mise) {
		super(coef, mise);
		// initialiser liste pair
	}

	public int[] getListe_pair() {
		return liste_pair;
	}

	public void setListe_pair(int[] liste_pair) {
		this.liste_pair = liste_pair;
	}

}

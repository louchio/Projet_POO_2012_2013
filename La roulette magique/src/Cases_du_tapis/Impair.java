package Cases_du_tapis;

public class Impair extends Mise{
	private int liste_impair[];
	
	public Impair(int coef, int mise) {
		super(coef, mise);
		// initialiser liste impair
	}
	
	public int[] getListe_impair() {
		return liste_impair;
	}

	public void setListe_impair(int[] liste_impair) {
		this.liste_impair = liste_impair;
	}	
}

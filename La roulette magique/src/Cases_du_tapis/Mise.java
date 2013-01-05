package Cases_du_tapis;

public class Mise {
	private int coef_multiplicateur;
	private int mise;
	
	public Mise(int coef_multiplicateur, int mise) {
		this.coef_multiplicateur = coef_multiplicateur;
		this.mise = mise;
	}

	public int getCoef_multiplicateur() {
		return coef_multiplicateur;
	}

	public void setCoef_multiplicateur(int coef_multiplicateur) {
		this.coef_multiplicateur = coef_multiplicateur;
	}

	public int getMise() {
		return mise;
	}

	public void setMise(int mise) {
		this.mise = mise;
	}
	
}

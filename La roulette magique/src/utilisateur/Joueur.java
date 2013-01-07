package utilisateur;

public class Joueur {
	private String nom;
	private Compte cpt;
	
	public Joueur(String nom, Compte cpt) {
		this.nom = nom;
		this.cpt = cpt;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Compte getcpt() {
		return cpt;
	}

	public void setcpt(Compte cpt) {
		this.cpt = cpt;
	}
	
	//public void miser(Jeton j)
}

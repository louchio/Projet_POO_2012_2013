package vitesse;

public class Vitesse {
	private int vit;

	public Vitesse(int vit) {
		this.vit = vit;
	}

	public int getVitesse() {
		return vit;
	}

	public void setVitesse(int vit) {
		this.vit = vit;
	}
	
	// pour accelerer et ralentir, je pense qu'on peut associer deux touches du clavier(2 pour bille et 2 pour roue),
	// une pour ralentir et une pour accelerer..
	//(commentaire à supprimer)
	public void accelerer()
	{
		vit += 5; // par exemple
	}
	
	public void ralentir()
	{
		vit -= 5; // par exemple		
	}
	
	public void arreter()
	{
		vit = 0 ;
	}


	
}

package personnage;

public class Samourai extends Humain{
	//public int honneur; int honneur,
	private String seigneur;
	
	
	public Samourai(String nom, String boisson, int argent, String seigneur) {
		super(nom, boisson, argent);
		//this.honneur=honneur;
		this.seigneur= seigneur;
	}
	
	
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir " + seigneur);
	}
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du "+ boisson);
	}
}

		
		
		
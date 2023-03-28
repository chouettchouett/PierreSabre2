package personnage;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		// TODO Auto-generated constructor stub
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent() / 10;  
		perdreArgent(don);
		parler(beneficiaire.getNom() + " prend ces " + don + " sous." );
		beneficiaire.recevoir(don);
	}

}

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
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (honneur*2 >= adversaire.getReputation()) { // voir yakuza
			parler("Je t’ai eu petit yakusa!");
			int gain = adversaire.perdre();
			gagnerArgent(gain);
			honneur++;
		} else {
			parler(" J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			int perte = getArgent();
			perdreArgent(perte);
			adversaire.gagner(perte);
			honneur--;
		}
	}

}

package personnage;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public int getReputation() {
		return reputation;
	}

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan);
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		reputation++;
		parler("J'ai pique les " + gain + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi ! Hi !");	
	}

	public int perdre() {
		parler("J’ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai déshonoré le clan de "+ clan);
		int perte = getArgent();
		perdreArgent(perte);
		reputation = reputation - 1;
		return perte;
	} 
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation = reputation + 1;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + "? Je l'ai depouille de ses "
				+ gain + " sous.");
	}
}

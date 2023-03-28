package personnage;

public class Commerçant extends Humain{

	public Commerçant(String nom , int argent) {
		super(nom, "thé", argent);
		// TODO Auto-generated constructor stub
	}

	public int seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste...");
		int perte = getArgent();
		perdreArgent(perte);
		return perte;
	}
	
	public void recevoir(int argent) {
		parler( argent +" sous ! Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}
}

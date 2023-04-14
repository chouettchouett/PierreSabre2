package personnage;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	public int nombreConnaissance;
	private int nbConnaissanceMax=30;
	public Humain[] memoire = new Humain[30];
	
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS ! " );
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir une " + bien + " à " + prix + " sous" );
			perdreArgent(prix);
			}
		else {
			parler(" Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un "  + bien + " à " + prix + " sous");
		}
	}
	
	public void gagnerArgent(int gain) {
		argent = argent + gain;
	}
	public void perdreArgent(int perte) {
		argent = argent - perte;
	}
	
	// ---- TP5
	
	private void memoriser(Humain humain) {
		if (nombreConnaissance>nbConnaissanceMax-1) {
			for (int i = 0; i < nbConnaissanceMax-1; i++) {
				memoire[i]=memoire[i+1];
				
			}
			memoire[nbConnaissanceMax-1]=humain;
		} else {
			memoire[nombreConnaissance]=humain;
			nombreConnaissance++;
		}
	}
	public void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}

	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
		
	}
	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont :");
		for (int i = 0; i < nombreConnaissance; i++) {
			System.out.print(" "+memoire[i].getNom()+", " );
		}
		System.out.println("");
	}
	
}

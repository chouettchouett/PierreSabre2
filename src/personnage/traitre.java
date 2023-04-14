package personnage;

import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise;
	
	public Traitre(String nom, String boisson, int argent, String seigneur,int niveauTraitrise ) {
		super(nom, boisson, argent, seigneur);
		this.niveauTraitrise = niveauTraitrise;

	}

	public void direBonjour() {
		super.direBonjour();
		parler( "Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + " . Chut !");
	}
	
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise >= 3 ) {
			parler( " Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
		else {
			int x=commercant.getArgent()*2/10;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + x +" sous ou gare à toi !");
			commercant.perdreArgent(x);
			super.gagnerArgent(x);
			commercant.parler("Tout de suite grand "+ getNom());
			niveauTraitrise++;
		}
	}
	
	public void faireLeGentil() {
		Random random= new Random();
		if (super.nombreConnaissance==0) {
			parler("Je ne peux faire connaissance avec personne snif snif... ");
		}
		else {			
			int ami = random.nextInt(super.nombreConnaissance);
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + memoire[ami].getNom());
			int x= super.getArgent()*1/20;
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant "+ x +" sous");
			memoire[ami].gagnerArgent(x);
			super.perdreArgent(x);
			memoire[ami].parler("Merci "+ getNom() +". Vous êtes quelqu'un de bien");
			niveauTraitrise--;
		}
	}
}

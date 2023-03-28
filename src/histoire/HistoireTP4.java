package histoire;

import personnage.Commercant;
import personnage.Humain;
import personnage.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain ("Prof","kombucha",54);
		Commercant marco = new Commercant ("Marco",20);
		Yakuza yak = new Yakuza ("Yaku Le Noir","whisky",30,"Warsong");
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("kimono", 50);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		yak.extorquer(marco);
		marco.boire();
	}
}

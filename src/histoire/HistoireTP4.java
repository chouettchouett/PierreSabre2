package histoire;

import personnage.Commer�ant;
import personnage.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain ("Prof","kombucha",54);
		Commer�ant marco = new Commer�ant ("Marco",20);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("kimono", 50);
		
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}
}

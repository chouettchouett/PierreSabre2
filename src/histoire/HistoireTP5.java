package histoire;

import personnage.Commercant;
import personnage.Humain;
import personnage.Ronin;
import personnage.Samourai;
import personnage.Traitre;
import personnage.Yakuza;

public class HistoireTP5 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Humain yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Akimoto","saké", 80 ,"Miyamoto");
		Traitre masako = new Traitre( "Masako","whisky",100,"Miyamoto", 0);
		
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		
		akimoto.faireConnaissanceAvec(masako);
		masako.ranconner(marco);
		yaku.faireConnaissanceAvec(masako);
		masako.faireLeGentil();
		
		masako.faireConnaissanceAvec(roro);
		
		
		//marco.faireConnaissanceAvec(roro);
		//marco.faireConnaissanceAvec(yaku);
		//marco.faireConnaissanceAvec(chonin);
		//marco.faireConnaissanceAvec(kumi);
		//marco.listerConnaissance();
		//roro.listerConnaissance();
		//yaku.listerConnaissance();
		//akimoto.boire("thé");
		
	
	}
	
}

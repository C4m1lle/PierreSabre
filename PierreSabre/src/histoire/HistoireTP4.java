package histoire;
import personnages.Commercant;
import personnages.Humain;



public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu",2);
		prof.acheter("kimono", 50);
		
		Commercant bob = new Commercant("bob",100);
		bob.direBonjour();
		bob.acheter("boisson", 12);
	}
}

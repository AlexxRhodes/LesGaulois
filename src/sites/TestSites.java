package sites;

import personnages.*;

public class TestSites {
	public static void main(String[] args) {
		Stuff[] stuff = {Stuff.CASQUE};

		
		Gaulois Vercingetorix = new Gaulois("Vercingetorix", 5);
		Village village = new Village(Vercingetorix);
		village.getChef().parler("Je suis un grand guerrier et je vais créer mon village");
		
		System.out.println("");
		
		Gaulois Abraracourcix = new Gaulois("Abraracourcix", 5);
		village.ajouterVillageois(Abraracourcix);

		System.out.println("");
		System.out.println("");
		
		
		Soldat Minus = new Soldat("Minus", 2, grade.CENTURION);
		Camp camp = new Camp(Minus);
		camp.getCommandant().parler("Je suis en charge de créer un nouveau camp romain.");
		
		System.out.println("");
		
		Soldat Briseradius = new Soldat("Briseradius", 4, grade.SOLDAT);
		Soldat Chorus = new Soldat("Chorus", 4, grade.CENTURION);
		camp.ajouterSoldat(Briseradius);
		camp.ajouterSoldat(Chorus);
		System.out.println("");
		
		village.changerChef(Abraracourcix);
		System.out.println("");
		camp.changerCommandant(Briseradius);
		camp.changerCommandant(Chorus);
		
		System.out.println("");
		
	}
}

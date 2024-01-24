package sites;

import personnages.*;

public class TestSites {
	public static void main(String[] args) {
		Gaulois Vercingetorix = new Gaulois("Vercingetorix", 5);
		Village village = new Village(Vercingetorix);
		village.getChef().parler("Je suis un grand guerrier et je vais créer mon village");
		
		System.out.println("");
		
		village.ajouterVillageois(new Gaulois("Agecanonix", 1));
		village.ajouterVillageois(new Gaulois("Assurancetourix", 2));
		village.ajouterVillageois(new Gaulois("Astérix", 5));
		village.ajouterVillageois(new Gaulois("Obelix", 15));
		village.ajouterVillageois(new Gaulois("Prolix", 2));

		System.out.println("");
		System.out.println("");
		
		
		Soldat Minus = new Soldat("Minus", 2, grade.CENTURION);
		Camp camp = new Camp(Minus);
		camp.getCommandant().parler("Je suis en charge de créer un nouveau camp romain.");
		
		System.out.println("");
		
		camp.ajouterSoldat(new Soldat("Brutus", 5, grade.CENTURION));
		camp.ajouterSoldat(new Soldat("Milexcus", 2, grade.SOLDAT));
		camp.ajouterSoldat(new Soldat("Tullius Octopus", 2, grade.TESSERARIUS));
		camp.ajouterSoldat(new Soldat("Ballondebaudrus", 3, grade.OPTIO));
		
		System.out.println("");
		
		village.afficherVillage();
		
		System.out.println("");
		
		camp.afficherCamp();
		
	}
}

package sites;

import personnages.*;

public class Village {
	private Gaulois chef;
	private Gaulois[] villageois;
	int nbVillageois;
	
	public Village(Gaulois chef) {
		this.chef = chef;
		nbVillageois = 0;
		villageois = new Gaulois[4];
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois g) {
		if(nbVillageois != villageois.length) {
			villageois[nbVillageois] = g;
			nbVillageois++;
			chef.parler(" « Bienvenue " + g.getName() + " ! »");
		}else {
			chef.parler(" « Désolé " + g.getName() + " mon village est déjà bien rempli. »");
		}
	}
	
	public void afficherVillage() {
		System.out.println("Le village de " + getChef().getName() + " est habité par :");
		
		for(int i = 0; i < nbVillageois ; i++) {
			System.out.println("- " + villageois[i].getName());
		}
	}
}

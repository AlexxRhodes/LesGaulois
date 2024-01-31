package sites;

import personnages.*;

public class Camp {
	private Soldat commandant;
	private Soldat[] soldat;
	int nbSoldat;
	
	public Camp(Soldat commandant) {
		this.commandant = commandant;
		nbSoldat = 0;
		soldat = new Soldat[4];
	}

	public Soldat getCommandant() {
		return commandant;
	}
	
	public void ajouterSoldat(Soldat s) {
		if(nbSoldat != soldat.length) {
			soldat[nbSoldat] = s;
			nbSoldat++;
			s.parler("« Je mets mon épée au service de Rome dans le camp dirigé par " + getCommandant().getName() + " »");
		}else {
			commandant.parler("« Désolé " + s.getName() + " notre camp est complet ! »");
		}
	}
	
	public void afficherCamp() {
		System.out.println("Le camp dirigié par " + getCommandant().getName() + " contient le soldats :");
		
		for(int i = 0; i < nbSoldat ; i++) {
			System.out.println("- " + soldat[i].getName());
		}
	}
	
	public void changerCommandant(Soldat s) {
		if(s.getGrade() == grade.CENTURION) {
			this.commandant = s;
			commandant.parler("Moi " + commandant.getName() + " je prends la direction du camp romain.");
		}else {
			s.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain.");
		}
	}

}

package personnages;

public class Druide extends Gaulois {
	private int stockPotion;
	private int forcePotion;
	
	
	public Druide(String n, int s) {
		super(n, s);
		this.stockPotion = 0;
		this.forcePotion = 0;
	}
	
	public void fabriquerPotion(int q) {
		stockPotion = q;
		forcePotion = (int)(Math.random()*4) + 1;
		this.parler(" J'ai concocté " + stockPotion + " doses de potion magique. Elle a une force de " + forcePotion);
	}
	
	public void faireBoire(Gaulois g) {
		if(this.stockPotion > 0) {
			if(g.getName() != "Obélix") {
				g.boost = forcePotion;
				g.parler("Tiens " + g.getName() + " un peu de potion magique");
				this.stockPotion -= 1;
			}else {
				parler("Non, Obélix Non !... Et tu le sais très bien !");
			}
		}else {
			parler("Désolé "+ g.getName()+ " il n'y a plus une seule goutte de potion.");
		}
	}
}

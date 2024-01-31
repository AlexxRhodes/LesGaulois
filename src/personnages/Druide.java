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
		forcePotion = (int)(Math.random()*5);
		this.parler(" J'ai concocté " + stockPotion + " doses de potion magique. Elle a une force de " + forcePotion);
	}
}

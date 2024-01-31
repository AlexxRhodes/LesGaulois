package personnages;

public class Gaulois extends Personnage{
	protected int boost;
	
	public Gaulois(String n, int s) {
		super(n, s);
	}

	protected String donnerAuteur(){
		return "Gaulois";
	}
	
	@Override
	public void frapper(Personnage p)
	{
		System.out.println("Le Gaulois " + getName() + " envoie un grand coup de force " + (this.strength/3 + this.boost) + " dans la mâchoir de "+ p.donnerAuteur() + ' ' + p.getName());
		p.recevoirCoup(this.strength/3 + this.boost);
		this.boost -= 0.5;
	}
}

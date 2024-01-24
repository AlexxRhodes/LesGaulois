package personnages;

public class Gaulois extends Personnage{
	
	public Gaulois(String n, int s) {
		super(n, s);
	}

	protected String donnerAuteur(){
		return "Gaulois";
	}
}

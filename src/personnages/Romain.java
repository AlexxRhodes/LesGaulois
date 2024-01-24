package personnages;

public class Romain extends Personnage {
	
	public Romain(String n, int s) {
		super(n, s);
	}

	protected String donnerAuteur(){
		return "Romain";
	}
}

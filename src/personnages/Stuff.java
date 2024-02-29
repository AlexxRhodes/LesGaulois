package personnages;

public enum Stuff{
	CASQUE("un casque", 2), PLASTRON("un plastron", 3), BOUCLIER("un bouclier", 3);
	
	private String nom;
	private int power;
	
	private Stuff(String nom, int power) {
		this.nom = nom;
		this.power = power;
	}
	
	public String getName() {
		return nom;
	}
	public int getPower() {
		return power;
	}

}

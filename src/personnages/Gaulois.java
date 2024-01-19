package personnages;

public class Gaulois {
	String name;
	int strength;
	
	public Gaulois(String n, int s)
	{
		name = n;
		strength = s;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		System.out.println(Asterix.getName());
	}
}

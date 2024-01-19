package personnages;

public class Gaulois {
	private String name;
	private int strength;
	
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
	
	public void parler(String txt)
	{
		System.out.println("Le gaulois "+ getName()+ " : \""+ txt + "\"");
	}
	
	public void frapper(Romain r)
	{
		System.out.println(getName()+ " envoie un grand coup dans la mâchoir de "+ r.getName());
		r.recevoirCoup(strength/3);
	}
}

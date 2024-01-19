package personnages;

public class Romain {
	private String name;
	private int strength;
	
	public Romain(String n, int s)
	{
		name = n;
		strength = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void parler(String txt)
	{
		System.out.println("Le romain "+ getName()+ " : \""+ txt + "\"");
	}

	public void recevoirCoup(int forceCoup)
	{
		strength -= forceCoup;
		if(strength <= 0)
		{
			strength = 0;
			parler("J'abandonne");
		}else{
			parler("Aïe !!");
		}
	}
}

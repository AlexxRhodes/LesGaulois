package personnages;

public abstract class Personnage {
	protected String name;
	protected int strength;
	
	protected Personnage(String n, int s)
	{
		name = n;
		strength = s;
	}
	
	protected abstract String donnerAuteur();
	
	public String getName()
	{
		return name;
	}

	public void parler(String txt)
	{
		System.out.println("Le "+ donnerAuteur() + ' ' + getName()+ " : \""+ txt + "\"");
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
	
	public void frapper(Personnage p)
	{
		System.out.println("Le "+ donnerAuteur() + ' '+ getName()+ " envoie un grand coup dans la mâchoir de "+ p.donnerAuteur() + ' ' + p.getName());
		p.recevoirCoup(strength);
	}

}

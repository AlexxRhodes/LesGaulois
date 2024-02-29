package personnages;

public class Soldat extends Romain {
	private grade grade;
	private Stuff[] stuff = new Stuff[3];
	int nbStuff;
	
	public Soldat(String name, int strength, grade g) {
		super(name, strength);
		this.grade = g;	
	}

	public grade getGrade() {
		return grade;
	}
	
	@Override
	public void parler(String txt)
	{
		System.out.println("Le "+ donnerAuteur() + ' '+ getGrade() + ' ' + getName()+ " : \""+ txt + "\"");
	}
	
	public void addStuff(Stuff s) {
		boolean test = true;
		
		if(nbStuff > 0) {
			for(int i = 0; i <= nbStuff; i++) {
				if(stuff[i] == s) {
					System.out.println("[SYSTEM] : Ce Soldat possède déjà cet objet");
					test = false;
				}
			}
		}else if(nbStuff == 3) {
			System.out.println("[SYSTEM] : Un soldat ne peut posséder que 3 équipements avec lui");
		}else if(test){
			stuff[nbStuff] = s;
			System.out.println("Le soldat Minus s'équipe avec " + s.getName() + '.');

		}
	}
}

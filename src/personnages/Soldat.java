package personnages;

public class Soldat extends Romain {
	private grade grade;
	
	public Soldat(String name, int strength, grade g) {
		super(name, strength);
		this.grade = g;
	}

	public grade getGrade() {
		return grade;
	}
}


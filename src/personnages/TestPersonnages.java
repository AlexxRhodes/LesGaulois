package personnages;

public class TestPersonnages {
	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix", 3);
		Gaulois Obélix = new Gaulois("Obélix", 3);
		Gaulois Astérix = new Gaulois("Astérix", 5);
		Gaulois Assurancetourix = new Gaulois("Assurancetourix", 3);
		Gaulois Abraracourcix = new Gaulois("Abraracourcix", 3);
		Gaulois Agecanonix = new Gaulois("Agecanonix", 3);
		

		Romain Minus = new Romain("Minus", 6);
		
		Panoramix.fabriquerPotion(3);
		Panoramix.faireBoire(Astérix);
		Panoramix.faireBoire(Obélix);
		Panoramix.faireBoire(Assurancetourix);
		Panoramix.faireBoire(Abraracourcix);
		Panoramix.faireBoire(Agecanonix);
		
		Minus.parler("UN GAU... UN GAUGAU... ");
		Astérix.frapper(Minus);
		Minus.frapper(Astérix);
		Astérix.frapper(Minus);
		Minus.frapper(Astérix);
		Astérix.frapper(Minus);
	}
}

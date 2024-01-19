package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		System.out.println(Asterix.getName());
		
		Asterix.parler("Il est où Idefix ?");
	}
}

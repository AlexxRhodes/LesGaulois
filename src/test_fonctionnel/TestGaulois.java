package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		Romain Minus = new Romain("Minus", 6);
		System.out.println(Asterix.getName());
		
		Asterix.parler("Il est où Idefix ?");
		Minus.parler("UN GAU ... UN GAUGAU... UN GAULOIIIIIS");
		
		//for(int i = 0; i<2; i++)
		//{
		//	Minus.recevoirCoup(3);
		//}
		
		for(int i = 0; i<3; i++)
		{
			Asterix.frapper(Minus);
		}
	}
}

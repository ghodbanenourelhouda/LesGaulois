package histoire;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Asterix", 8);
		Romain minus = new Romain ("Minus", 6);
//		asterix.parler(" Bonjour à tous ") ; 
//		minus.parler(" UN GAU... UN GAUGAU...");
//		minus.recevoirCoup(3);
//		minus.recevoirCoup(2);
//		minus.recevoirCoup(6);
		Druide panoramix = new Druide ("Panoramix",5,10);
		panoramix.parler(" Je vais aller préparer une petite potion...");
		int forcePotion = 4;
		panoramix.preparerPotion ();
		
		
		
		
		
		
		
		
      
		
		
		
	}
}



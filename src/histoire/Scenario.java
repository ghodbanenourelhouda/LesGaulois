package histoire;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Asterix", 8);
		Gaulois obelix = new Gaulois ("Obélix" , 25);
		Romain minus = new Romain ("Minus", 6);
		Druide panoramix = new Druide ("Panoramix",5,10);
		panoramix.parler(" Je vais aller préparer une petite potion...");
		panoramix.preparerPotion ();
		panoramix.parler( "Non, Obélix !... Tu n’auras pas de potion magique !");
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		asterix.boirePotion(6);
		asterix.parler(" Bonjour ") ;
		minus.parler(" UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		
		
		
		
		
		
		
		
		
		
		
		
      
		
		
		
	}
}



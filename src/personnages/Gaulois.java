package personnages;

public class Gaulois 
{
  private String nom;
  private int force ;
  private int effetPotion = 1 ;
  
  
public String getNom() {
	return nom;
}
public Gaulois(String nom, int force) {
  this.nom = nom;
  this.force = force;
}

public void parler(String texte) {
	System.out.println(prendreParole() + "« " + texte + "»");  // pourquoi il y a le trait bleu ? 
	}

private String prendreParole() {
	return "Le gaulois " + nom + " : ";
}
public void frapper(Romain romain) {
	System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
	romain.recevoirCoup((force / 3) * effetPotion);
}

@Override

public String toString() {
	return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
}

public static void main(String[] args) {
	
	//Affichage des informations des asterix :
	
    Gaulois asterix = new Gaulois("Asterix", 8);
    Romain minus = new Romain ("Minus" , 7);
    System.out.println(asterix.getNom());
    System.out.println(asterix);
    
    // Prendre parole Asterix :
    
    asterix.prendreParole();
    asterix.parler("On va gangner ! ");
    asterix.frapper(minus);     
    asterix.boirePotion(3);
   
    
public void boirePotion( int forcePotion) {
	effetPotion = forcePotion; 
	if (forcePotion == 3) {
	asterix.parler("Merci Druide, je sens que ma force est 3 fois décuplée");
	}

	
	
	
	
	
	
	
	
}
 
 
}
}




  



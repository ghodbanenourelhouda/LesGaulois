package personnages;

public class Romain {
	
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int  nbEquipement = 0 ;
	
 
public Romain(String nom, int force) {
	this.nom = nom;
	this.force = force;
	assert force > 0;
	equipements = new Equipement[2];
	this.equipements = equipements;
	
	}

public String getNom() {
	return nom;
	}

public void parler(String texte) {
	System.out.println(prendreParole() + "« " + texte + "»");
	}

private String prendreParole() {
	return "Le romain " + nom + " : ";
	}

public void recevoirCoup(int forceCoup) {
	assert force > 0;
	int var = force ;
	force -= forceCoup;
	if (force > 0) {
	parler("Aïe");
	} else {
	parler("J'abandonne...");
	}
	assert force != var ;
	}


public static void main(String[] args) { 
	Romain minus = new Romain ("Minus" , 6);
    //minus.prendreParole();
    //minus.parler("On va gangner !!! ");
    //minus.recevoirCoup(7);
    
    
    
    minus.sEquiper(Equipement.CASQUE);
    minus.sEquiper(Equipement.CASQUE);
    minus.sEquiper(Equipement.BOUCLIER);
    minus.sEquiper(Equipement.CASQUE);
 
}

public void sEquiper(Equipement equipement) {
    switch (nbEquipement) {
        case 2:
          System.out.println("Le soldat " + nom + " est déjà bien protégé !");
          break;
        case 1:
            if (equipements[0] == equipement) {
                System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
            }
            else {
            	System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
            	equipements[1] = equipement ;
            	nbEquipement ++; }
            break;
            
        default:
        	System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
        	equipements[0] = equipement ;
        	nbEquipement ++; }
           
    }
   
}





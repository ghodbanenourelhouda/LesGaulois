package personnages;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private String[] villageois;
	private int nbVillageoisMaximum;
	
	
	
	
	
	public Village (String nom) {
	    this.nom = nom ;
	}
	public String getNom() {
		return nom;
	}
	
	//Constructeur
	
	public Village (String nom , int nbVillageoisMaximum ) {
		this.nom = nom;
		this.villageois = new String[nbVillageoisMaximum];

	}

	public String[] ajouterHabitant ( String gaulois) {
		for ( int i = 0 ; i < nbVillageoisMaximum ; i++ ) {
			villageois[i] = gaulois;
			nbVillageois = nbVillageois + 1;
		}
			return villageois;
		}

public String trouverHabitant ( int numero) {
	return villageois[numero];
				
	}
	

public static void main(String[] args) {
	Village village = new Village ("Village des Irréductibles", 30);
	//Gaulois gaulois = village.trouverHabitant(30);
	//y a pas un gaulois dans la position 30 car c'est le max
	
	Chef chef = new Chef ("Abraracourcix", 6 , village);
	Gaulois asterix = new Gaulois ("Astérix", 8 );
	village.ajouterHabitant("Astérix");
	
	//Gaulois gaulois = village.trouverHabitant(1);
	//System.out.println(gaulois);
	
	
		
		
	
}
}
		
		
	
	
	
	


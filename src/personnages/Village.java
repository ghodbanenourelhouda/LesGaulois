package personnages;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
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
		this.villageois = new Gaulois[nbVillageoisMaximum];
		this.nbVillageoisMaximum = nbVillageoisMaximum ; 
	}

	public void ajouterHabitant( Gaulois gaulois) {
	   if (nbVillageois < nbVillageoisMaximum ) {
		   villageois[nbVillageois] = gaulois ; 
		   nbVillageois ++ ;
	   }
	}
		

public Gaulois trouverHabitant ( int numero) {
	return villageois[numero];
				
	}
	

public static void main(String[] args) {
	Village village = new Village ("Village des Irréductibles", 30);
	
	//Gaulois gaulois = village.trouverHabitant(30);
	//i n'y a pas un gaulois dans la position 30 car c'est le max ;
	
	Chef abraracourcis = new Chef("Abraracourcix", 6 , village);
	// je peux pas ajouter un Chef dans un village de gaulois
	
	//village.ajouterHabitant(abraracourcis);
	
	Gaulois asterix = new Gaulois ("Astérix", 8 );
	village.ajouterHabitant(asterix);
	Gaulois obelix = new Gaulois ("Obélix", 25 );
	village.ajouterHabitant(obelix);
	village.afficherVillageois () ;
	
	
	//Gaulois gaulois = village.trouverHabitant(1);
	//System.out.println(gaulois);
	// il affiche null ;
}

public void afficherVillageois () {
	System.out.println("Dans village du chef Abraracourcix vivent les légendaires gaulois : ") ;
	for (int  i= 0 ; i < nbVillageois ; i++ ) {
        System.out.println(villageois[i]) ; 
        
	}	
} 

}
		
		
	
	
	
	


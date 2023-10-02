package personnages;

public enum Equipement {

	    CASQUE("Casque"),
	    BOUCLIER("Bouclier");
	    private String nom;

	    // Constructeur
	    
	    private Equipement(String nom) {
	        this.nom = nom;
	    }

	    // Méthode pour obtenir le nom de l'équipement
	    public String getNom() {
	        return nom;
	    }
	    
	    public String toString() {
	        return nom;
}
}
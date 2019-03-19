
public abstract class Personne {
	protected String nom;
	protected String prenom;
	protected String rue;
	protected String ville;
	protected static int nbPersonnes=0;
	
	public Personne(String nom, String prenom, String rue, String ville) {
	
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.ville = ville;
		nbPersonnes++;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", rue=" + rue + ", ville=" + ville + "]";
	}
	
	 abstract void ecrirePersonne ();
	 
	 public static void nbPersonnes () {
		 System.out.println("\nNombre d’employés : " + nbPersonnes +
				 "\nNombre de secrétaires : " + Secretaire.nbSecretaires() +
				 "\nNombre d’enseignants : " + Enseignant.nbEnseignants() +
				 "\nNombre d’étudiants : " + Etudiant.nbEtudiants());
		 
	 }
	 
	   public void modifierPersonne (String rue, String ville) {
		   this.rue= rue;
		   this.ville=ville;
		   ecrirePersonne(); 
		  
	  }
	    
}

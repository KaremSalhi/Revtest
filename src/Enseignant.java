
public class Enseignant extends Personne {
	
	private static int nbEnseignants=0;
	private String specialite;

	public Enseignant(String nom, String prenom, String rue, String ville, String specialite) {
		super(nom, prenom, rue, ville);
		this.specialite=specialite;
		nbEnseignants++;
	}
	
	

	@Override
	public String toString() {
		return super.toString() +"Enseignant [specialite=" + specialite+  "]";
	}



	@Override
	void ecrirePersonne() {
		 System.out.println ("Enseignant : " + toString());

	}
	static int nbEnseignants () { return nbEnseignants; }

}

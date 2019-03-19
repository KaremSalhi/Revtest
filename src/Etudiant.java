
public class Etudiant extends Personne {
	
	private String diplome;
	
	private static int nbEtudiants=0;

	public Etudiant(String nom, String prenom, String rue, String ville,String diplome) {
		super(nom, prenom, rue, ville);
		this.diplome=diplome;
		nbEtudiants++;
	}
	
	

	@Override
	public String toString() {
		return  super.toString() +"diplome;" +diplome + "]";
	}



	@Override
	void ecrirePersonne() {
	
		 System.out.println ("ETudiant : " + toString());

	}
	public String diplome () {
		 return diplome;
		 }
	
	static int nbEtudiants () { return nbEtudiants; }

}

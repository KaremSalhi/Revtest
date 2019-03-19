
public class Secretaire extends Personne {
	
	private String numeroBureau;
	 private static int nbSecretaires=0;

	public Secretaire(String nom, String prenom, String rue, String ville, String numeroBureau) {
		super(nom, prenom, rue, ville);
		this.numeroBureau=numeroBureau;
		nbSecretaires++;
	}
	
	

	@Override
	public String toString() {
		return super.toString()+"Secretaire [numeroBureau=" + numeroBureau + "]";
	}



	@Override
	void ecrirePersonne() {
		System.out.println("secretaire"+toString());
		
	}
	 static int nbSecretaires () { return nbSecretaires; }


}


public class Test {
	
	public static void main(String[] args) {
		
	
		Secretaire chantal = new Secretaire ("Dupond", "Chantal",
				 "rue des mimosas", "Rennes", "A123");
				 chantal.ecrirePersonne();
				 Enseignant michel = new Enseignant ("Martin", "Michel",
				 "bd St-Antoine", "Rennes", "Maths");
				 michel.ecrirePersonne();
				 Etudiant e1 = new Etudiant ("Martin", "Guillaume",
				 "bd St-Jacques", "Bordeaux", "licence info");
				 e1.ecrirePersonne();
				 Etudiant e2 = new Etudiant ("Dufour", "St�phanie",
				 "rue des saules", "Lyon", "DUT info");
				 e2.ecrirePersonne();
				 Personne.nbPersonnes(); // m�thode static
				 System.out.println ("\n\nApr�s modification :");
				 chantal.modifierPersonne ("rue des wayyyyys", "Nanhs");
				 michel.modifierPersonne ("rue des lilas", "5lifa");
	
	
	}
}

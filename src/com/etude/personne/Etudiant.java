package com.etude.personne;

public class Etudiant extends Personne {
	private int cne;

	public Etudiant(String pPrenom, String pNom, int pCne) {
		super(pPrenom, pNom);
		this.cne = pCne;
	}

//	@Override
//	public int compareTo(Personne p) {
//		Etudiant e = (Etudiant) p;
//		int compare;
//		String prenom1 = (this.prenom);
//		String prenom2 = (e.prenom);
//		compare = prenom1.compareTo(prenom2);
//		return compare;
//	}

	@Override
	public String toString() {
		return "Je suis l'�tudiant " + this.prenom + " " + this.nom + " Mon CNE est " + this.cne;
	}

}

package com.etude.personne;

public class Etudiant extends Personne implements Comparable<Etudiant> {
	private int cne;

	public Etudiant(String pNom, String pPrenom, int pCne) {
		super(pNom, pPrenom);
		this.cne = cne;
	}

	@Override
	public int compareTo(Etudiant o) {
		return 0;
	}

	@Override
	public String toString() {
		return "Je suis l'étudiant " + this.prenom + " " + this.nom + " Mon CNE est " + this.cne;
	}

}

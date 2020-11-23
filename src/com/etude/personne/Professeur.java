package com.etude.personne;

public class Professeur extends Employe {

	private String specialite;

	public Professeur(String pNom, String pPrenom, double d, String pSpecialite) {
		super(pNom, pPrenom, d);
		this.specialite = pSpecialite;
	}

	@Override
	public int compareTo(Employe e) {
		Professeur p = (Professeur) e;
		int compare;
		String prenom1 = (this.prenom);
		String prenom2 = (p.prenom);
		compare = prenom1.compareTo(prenom2);
		if (compare != 0) {
			return compare;
		} else {
			Double salaire1 = (this.salaire);
			Double salaire2 = (e.salaire);
			compare = salaire2.compareTo(salaire1);
			return compare;
		}
	}

	@Override
	public String toString() {
		return "Je suis le professeur " + this.prenom + " " + this.nom + " mon salaire est de : " + this.salaire
				+ " euro, ma specialité est : " + this.specialite;
	}

}

package com.etude.personne;

public abstract class Personne implements Comparable<Personne> {
	protected final String nom;
	protected final String prenom;

	protected Personne(String pPrenom, String pNom) {
		this.prenom = pPrenom;
		this.nom = pNom;
	}

	@Override
	public int compareTo(Personne p) {
		int compare;
		String classPersonne1 = this.getClass().toString();// .substring(25)
		String classPersonne2 = p.getClass().toString();// .substring(25)
		compare = classPersonne1.compareTo(classPersonne2);
		if (compare != 0) {
			return compare;
		} else if (p instanceof Professeur && this instanceof Professeur) {
			Professeur prof1 = (Professeur) this;
			Professeur prof2 = (Professeur) p;
			String prenom1 = (prof1.prenom);
			String prenom2 = (prof2.prenom);
			compare = prenom1.compareTo(prenom2);
			if (compare != 0) {
				return compare;
			} else {
				Double salaire1 = (prof1.salaire);
				Double salaire2 = (prof2.salaire);
				compare = salaire2.compareTo(salaire1);
				return compare;
			}
		} else if (p instanceof Etudiant && this instanceof Etudiant) {
			Etudiant etu1 = (Etudiant) this;
			Etudiant etu2 = (Etudiant) p;
			String prenom1 = (etu1.prenom);
			String prenom2 = (etu2.prenom);
			compare = prenom1.compareTo(prenom2);
			return compare;
		} else if (p instanceof Employe && this instanceof Employe) {
			Employe emp1 = (Employe) this;
			Employe emp2 = (Employe) p;
			Double salaire1 = (emp1.salaire);
			Double salaire2 = (emp2.salaire);
			compare = salaire2.compareTo(salaire1);
			return compare;
		} else {
			return 0;
		}
	}

}

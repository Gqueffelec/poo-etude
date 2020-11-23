package com.etude.personne;

import java.util.Comparator;

public class Employe extends Personne implements Comparable<Employe>, Comparator<Employe> {

	protected double salaire;

	public Employe(String pNom, String pPrenom, double pSalaire) {
		super(pNom, pPrenom);
		this.salaire = pSalaire;
	}

	@Override
	public String toString() {
		return "Je suis l'employé " + this.prenom + " " + this.nom + " mon salaire est de : " + this.salaire + " euro";
	}

	@Override
	public int compareTo(Employe e) {
		int compare;
		Double salaire1 = (this.salaire);
		Double salaire2 = (e.salaire);
		compare = salaire1.compareTo(salaire2);
		return compare;
	}

	@Override
	public int compare(Employe o1, Employe o2) {
		int compare;
		String prenom1 = (o1.prenom);
		String prenom2 = (o2.prenom);
		compare = prenom1.compareTo(prenom2);
		return compare;
	}
}

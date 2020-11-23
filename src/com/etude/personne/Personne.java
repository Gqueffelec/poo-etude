package com.etude.personne;

public abstract class Personne {
	protected final String nom;
	protected final String prenom;

	protected Personne(String pPrenom, String pNom) {
		this.prenom = pPrenom;
		this.nom = pNom;
	}

}

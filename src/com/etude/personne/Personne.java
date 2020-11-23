package com.etude.personne;

public abstract class Personne {
	protected final String nom;
	protected final String prenom;

	protected Personne(String pNom, String pPrenom) {
		this.nom = pNom;
		this.prenom = pPrenom;
	}
}

package com.etude.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.etude.personne.Etudiant;

public class Application {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant("Sebastien", "Zizou", 87543543);
		Etudiant e2 = new Etudiant("Julien", "Chombart", 65678754);
		Etudiant e3 = new Etudiant("Rony", "Fremy", 87543545);
		List<Etudiant> listeEtudiant = new ArrayList<>();
		listeEtudiant.add(e1);
		listeEtudiant.add(e2);
		listeEtudiant.add(e3);
		System.out.println("---Par ordre d'insertion");
		for (Etudiant etudiant : listeEtudiant) {
			System.out.println(etudiant);
		}
		Collections.sort(listeEtudiant);
		System.out.println("---Après le tri");
		for (Etudiant etudiant : listeEtudiant) {
			System.out.println(etudiant);
		}
	}

}

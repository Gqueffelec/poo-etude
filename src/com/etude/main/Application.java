package com.etude.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.etude.personne.Employe;
import com.etude.personne.Etudiant;

public class Application {

	public static void main(String[] args) {
		Etudiant etudiant1 = new Etudiant("Sebastien", "Zizou", 87543543);
		Etudiant etudiant2 = new Etudiant("Julien", "Chombart", 65678754);
		Etudiant etudiant3 = new Etudiant("Rony", "Fremy", 87543545);
		List<Etudiant> listeEtudiant = new ArrayList<>();
		listeEtudiant.add(etudiant1);
		listeEtudiant.add(etudiant2);
		listeEtudiant.add(etudiant3);
		System.out.println("---Par ordre d'insertion");
		for (Etudiant etudiant : listeEtudiant) {
			System.out.println(etudiant);
		}
		Collections.sort(listeEtudiant);
		System.out.println("---Après le tri");
		for (Etudiant etudiant : listeEtudiant) {
			System.out.println(etudiant);
		}
		Employe employe1 = new Employe("Ambroise", "Delalin", 1900.0);
		Employe employe2 = new Employe("François", "Vandenplas", 1700.0);
		Employe employe3 = new Employe("Yassine", "Afhim", 2800.0);
		List<Employe> listeEmploye = new ArrayList<>();
		listeEmploye.add(employe1);
		listeEmploye.add(employe2);
		listeEmploye.add(employe3);
		System.out.println("---Par ordre d'insertion");
		for (Employe employe : listeEmploye) {
			System.out.println(employe);
		}
		Collections.sort(listeEmploye, Collections.reverseOrder());
		System.out.println("---Après le tri");
		for (Employe employe : listeEmploye) {
			System.out.println(employe);
		}
	}

}

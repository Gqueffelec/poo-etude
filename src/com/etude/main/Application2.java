package com.etude.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.etude.personne.Employe;
import com.etude.personne.Etudiant;
import com.etude.personne.Personne;
import com.etude.personne.Professeur;

public class Application2 {
	public static void main(String[] args) {

		List<Personne> listeAll = new ArrayList<>();
		listeAll.add(new Professeur("Oussama", "Savaton", 2500.0, "JAVA/JEE"));
		listeAll.add(new Employe("Ambroise", "Delalin", 1900.0));
		listeAll.add(new Employe("François", "Vandenplas", 1700.0));
		listeAll.add(new Professeur("Thomas", "Legrand", 2600.0, "Mathématiques"));
		listeAll.add(new Etudiant("Sebastien", "Zizou", 87543543));
		listeAll.add(new Etudiant("Julien", "Chombart", 65678754));
		listeAll.add(new Employe("Yassine", "Afhim", 2800.0));
		listeAll.add(new Professeur("Oussama", "Stili", 3000.0, "JAVA/JEE"));
		listeAll.add(new Etudiant("Rony", "Fremy", 87543545));
		System.out.println("---Par ordre d'insertion");
		for (Personne personne : listeAll) {
			System.out.println(personne);
		}
		System.out.println();
		Collections.sort(listeAll);
		for (Personne personne : listeAll) {
			System.out.println(personne);
		}

	}
}

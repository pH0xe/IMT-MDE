package fr.imta.competition.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import imt.imtmde.Club;
import imt.imtmde.Competition;
import imt.imtmde.Epeiste;
import imt.imtmde.Fleurettiste;
import imt.imtmde.Sabreur;
import imt.imtmde.Tireur;
import imt.imtmde.TypeCategorie;
import imt.imtmde.TypeSexe;
import imt.imtmde.impl.EpeisteImpl;
import imt.imtmde.impl.FleurettisteImpl;
import imt.imtmde.impl.SabreurImpl;

public class Getters {
	
	public static List<Tireur> getAllTireur(Competition competition) {
		List<Club> clubs = competition.getClub();
		List<Tireur> tireurs = new ArrayList();
		
		for (Club club : clubs) {
			tireurs.addAll(club.getTireur());
		}
		
		return tireurs;
	}
	
	public static List<Fleurettiste> getAllFleurettiste(Competition competition) {
		List<Tireur> tireurs = getAllTireur(competition);
		List<Fleurettiste> fleurettistes = new ArrayList();
		for (Tireur tireur : tireurs) {
			if (tireur.getClass() == FleurettisteImpl.class)
				fleurettistes.add((Fleurettiste) tireur);
		}
		
		return fleurettistes;
	}
	
	public static List<Epeiste> getAllEpeiste(Competition competition) {
		List<Tireur> tireurs = getAllTireur(competition);
		List<Epeiste> epeistes = new ArrayList();
		for (Tireur tireur : tireurs) {
			if (tireur.getClass() == EpeisteImpl.class)
				epeistes.add((Epeiste) tireur);
		}
		
		return epeistes;
	}
	
	public static List<Sabreur> getAllSabreur(Competition competition) {
		List<Tireur> tireurs = getAllTireur(competition);
		List<Sabreur> sabreurs = new ArrayList();
		for (Tireur tireur : tireurs) {
			if (tireur.getClass() == SabreurImpl.class)
				sabreurs.add((Sabreur) tireur);
		}
		
		return sabreurs;
	}

	public static List<? extends Tireur> filterCateg(List<? extends Tireur> tireurs, TypeCategorie categ) {
		return tireurs.stream().filter(t -> t.getCategorie() == categ).collect(Collectors.toList());
	}
	
	public static List<? extends Tireur> filterSexe(List<? extends Tireur> tireurs, TypeSexe sexe) {
		if (sexe != TypeSexe.MIXTE)
			return tireurs.stream().filter(t -> t.getSexe() == sexe).collect(Collectors.toList());
		else return tireurs;
	}
}

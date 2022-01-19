package fr.imta.competition.cli;

import org.eclipse.emf.common.util.EList;

import fr.imta.competition.utils.Ansi;
import imt.imtmde.Adresse;
import imt.imtmde.Competition;
import imt.imtmde.Match;
import imt.imtmde.Resultat;
import imt.imtmde.Tireur;

public class MenuView {
	public static void printMain(EList<Competition> competitions) {
		Ansi.printTitle("Choisir la compétition");
		
		int i = 0;
		Ansi.printDefault("0) Quitter");
		Ansi.printDefault("1) Créer une compétition");
		
		for (i = 0; i < competitions.size(); i++) {
			Ansi.printDefault((i+2) + ") " + competitions.get(i).getNom());
		}
	}
	
	public static void printCompetionInfo(String nom, Adresse adresse) {
		Ansi.printTitle(nom);

		Ansi.printInfo(formatterAdresse(adresse));
		Ansi.printDefault("0) Retours");
		Ansi.printDefault("1) Afficher les clubs");
		Ansi.printDefault("2) Afficher les matchs");
	}
	
	public static void printMatchs(EList<Match> matchs) {
		Ansi.printTitle("Matchs");
		
		Ansi.printDefault("0) Retours");
		Ansi.printDefault("1) Créer un match");
		
		for(int i = 0; i < matchs.size(); i++) {
			Ansi.printDefault((i+2) + ") " + matchs.get(i).getTireurs().get(0).getNom() + " - " + matchs.get(i).getTireurs().get(1).getNom());
		}
	}
	
	public static void printMatchInfo(Match match) {
		EList<Tireur> tireurs = match.getTireurs();
		Ansi.printTitle(formatterNomTireur(tireurs.get(0)) + " - " + formatterNomTireur(tireurs.get(1)));
		Ansi.printInfo("Arme : " + match.getArme());
		Ansi.printInfo("Catégorie : " + match.getCategorie());
		Ansi.printInfo("Sexe : " + match.getSexe());
		Ansi.printInfo("Resultat : " + formatterResultat(match.getResultat()));
		
		Ansi.printDefault("0) Retours");
		Ansi.printDefault("1) " + formatterNomTireur(tireurs.get(0)));
		Ansi.printDefault("2) " + formatterNomTireur(tireurs.get(1)));
		Ansi.printDefault("3) Inscrire le score");
	}
	
	private static String formatterAdresse(Adresse adresse) {
		return adresse.getAdressePostale() + ", " + adresse.getCodePostal() + ", " + adresse.getVille();
	}
	
	private static String formatterNomTireur(Tireur tireur) {
		return tireur.getPrenom() + " " + tireur.getPrenom();
	}
	
	private static String formatterResultat(Resultat resultat) {
		if (resultat == null) return "Scores non indiqué";
		return resultat.getScore();
	}
}

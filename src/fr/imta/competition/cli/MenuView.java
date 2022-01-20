package fr.imta.competition.cli;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import fr.imta.competition.utils.Ansi;
import imt.imtmde.Adresse;
import imt.imtmde.Club;
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
		
		if (competitions != null) {
			for (i = 0; i < competitions.size(); i++) {
				Ansi.printDefault((i+2) + ") " + competitions.get(i).getNom());
			}
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
		Ansi.printDefault("1) Creer un match");
		
		for(int i = 0; i < matchs.size(); i++) {
			Ansi.printDefault((i+2) + ") " + matchs.get(i).getTireurs().get(0).getNom() + " - " + matchs.get(i).getTireurs().get(1).getNom());
		}
	}
	
	public static void printClubs(List<Club> clubs) {
		Ansi.printTitle("Clubs");
		
		Ansi.printDefault("0) Retours");
		Ansi.printDefault("1) Creer un club");
		
		for(int i = 0; i < clubs.size(); i++) {
			Ansi.printDefault((i+2) + ") " + clubs.get(i).getNom());
		}
	}
	
	public static void printClubInfo(Club club) {
		Ansi.printTitle(club.getNom());
		
		Ansi.printInfo("Adresse : " + formatterAdresse(club.getAdresse()));
		
		Ansi.printDefault("0) Retours");
		Ansi.printDefault("1) Aficher les tireurs");
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
		Ansi.printDefault("3) Inscrire/Modifier le score");
	}
	
	public static void printScore(Match match) {
		Ansi.printTitle("Mise a jour des scores");
		Ansi.printInfo("Score : " + match.getResultat().getScore());
		Ansi.printInfo("Temps : " + match.getResultat().getTemps());
	}
	
	public static void printTireurInfo(Tireur tireur) {
		Ansi.printTitle(tireur.getPrenom() + " " + tireur.getNom());

		Ansi.printInfo("Arme : " + tireur.getClass().getName());
		Ansi.printInfo("Catégorie : " + tireur.getCategorie());
		Ansi.printInfo("Sexe : " + tireur.getSexe());
	}
	
	public static void printTireurMenu(Tireur tireur) {
		printTireurInfo(tireur);
		
		Ansi.printDefault("0) Retours");
		Ansi.printDefault("1) Afficher les matchs");
		Ansi.printDefault("2) Modifier Tireur");
	}
	
	public static void printListTireur(List<? extends Tireur> tireurs) {
		int i = 0;
		for (i = 0; i < tireurs.size(); i++) {
			Ansi.printDefault(i + ") " + formatterNomTireur(tireurs.get(i)));
		}
		Ansi.printDefault(i + ") Nouveau tireur");
	}
	
	public static void printMenuTireurs(List<Tireur> tireurs) {
		Ansi.printTitle("Tireurs");
		
		Ansi.printDefault("0) Retours");
		Ansi.printDefault("1) Nouveau tireur");
		
		int i = 0;
		for (i = 0; i < tireurs.size(); i++) {
			Ansi.printDefault((i+2) + ") " + formatterNomTireur(tireurs.get(i)));
		}
		
	}
	
	public static void printListClub(List<Club> clubs) {
		int i = 0;
		for (i = 0; i < clubs.size(); i++) {
			Ansi.printDefault(i + ") " + clubs.get(i).getNom());
		}
		Ansi.printDefault(i + ") Nouveau club");
	}
	
	private static String formatterAdresse(Adresse adresse) {
		return adresse.getAdressePostale() + ", " + adresse.getCodePostal() + ", " + adresse.getVille();
	}
	
	private static String formatterNomTireur(Tireur tireur) {
		return tireur.getNom() + " " + tireur.getPrenom();
	}
	
	private static String formatterResultat(Resultat resultat) {
		if (resultat == null) return "Scores non indiqué";
		return resultat.getScore();
	}
	
}

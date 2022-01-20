package fr.imta.competition.cli;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;import org.eclipse.core.internal.registry.osgi.RegistryCommandProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

import fr.imta.competition.ResourceUtils;
import fr.imta.competition.utils.Ansi;
import fr.imta.competition.utils.InputUtils;
import imt.imtmde.Adresse;
import imt.imtmde.Club;
import imt.imtmde.Competition;
import imt.imtmde.ImtmdeFactory;
import imt.imtmde.Match;
import imt.imtmde.Resultat;
import imt.imtmde.Tireur;
import imt.imtmde.TypeCategorie;
import imt.imtmde.TypeSexe;

public class CompetionCLI {
	private final ResourceUtils resource;
	private final ImtmdeFactory competitionFactory = ImtmdeFactory.eINSTANCE;
	
	public static void run(ResourceUtils resource) {
		CompetionCLI cp = new CompetionCLI(resource);
		int choice = -1;
		do {
			MenuView.printMain(resource.getCompetions());
			choice = InputUtils.inputInt(null);
			try {
				cp.doAction(choice);
			} catch (Exception e) {
				e.printStackTrace();
				Ansi.printError("Saisir une valeur de la liste");
			}	
		} while (choice != 0);
	}
	
	private CompetionCLI(final ResourceUtils resource) {
		this.resource = resource;
	}

	private void doAction(int choice) throws Exception {
		if (choice == 0) return;
		if (choice == 1) {
			createCompetion();
		} else {
			if (choice - 2 < this.resource.getCompetions().size()) {
				this.affichageCompetition(this.resource.getCompetions().get(choice-2));
			} else {
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}

	private void affichageCompetition(Competition competition) {
		int choice = -1;
		do {
			MenuView.printCompetionInfo(competition.getNom(), competition.getAdresse());
			choice = InputUtils.inputInt(null);
			if (choice == 1) this.afficherClubs(competition);
			else if (choice == 2) this.afficherMatchs(competition);
			else if (choice != 0) Ansi.printError("Option non correct");
		} while (choice != 0);
	}

	private void afficherMatchs(Competition competition) {
		EList<Match> matchs = competition.getMatch();
		this.afficherMatchs(competition, matchs);
	}
	
	private void afficherMatchs(Competition competition, EList<Match> matchs) {
		int choice = -1;	
		do {
			MenuView.printMatchs(matchs);
			choice = InputUtils.inputInt(null);
			if (choice == 1) this.creerMatch(competition);
			else if (choice - 2 < matchs.size() && choice - 2 >= 0) this.detailsMatch(competition, matchs.get(choice-2));
			else if (choice != 0) Ansi.printError("Option non correct");
		} while (choice != 0);
	}

	private void detailsMatch(Competition competition, Match match) {
		int choice = -1;	
		do {
			MenuView.printMatchInfo(match);
			choice = InputUtils.inputInt(null);
			if (choice == 1) this.afficherTireur(competition, match.getTireurs().get(0));
			else if (choice == 2) this.afficherTireur(competition, match.getTireurs().get(1));
			else if (choice == 3) {
				if (match.getResultat() == null)
					this.inscrireScore(match);
				else
					this.mettreAJourScore(match);
			}
			else if (choice != 0) Ansi.printError("Option non correct");
		} while (choice != 0);
	}

	private void mettreAJourScore(Match match) {
		MenuView.printScore(match);
		String tireur1 = match.getTireurs().get(0).getNom() + " " + match.getTireurs().get(0).getPrenom();
		String tireur2 = match.getTireurs().get(1).getNom() + " " + match.getTireurs().get(1).getPrenom();
		String score = InputUtils.inputString("Score de " + tireur1 + " (Laisser vide pour ne pas changer)");
		int temps = InputUtils.inputInt("Temps du match"  + " (Laisser vide pour ne pas changer)");
		
		if (score != null && !score.isBlank()) 
			match.getResultat().setScore(score);
		
		if (temps != -1)
			match.getResultat().setTemps(temps);
		
	}

	private void inscrireScore(Match match) {
		String tireur1 = match.getTireurs().get(0).getNom() + " " + match.getTireurs().get(0).getPrenom();
		String tireur2 = match.getTireurs().get(1).getNom() + " " + match.getTireurs().get(1).getPrenom();
		int scoreG = InputUtils.inputInt("Score de " + tireur1);
		int scoreD = InputUtils.inputInt("Score de " + tireur2);
		int temps = InputUtils.inputInt("Temps du match");
		Resultat res = competitionFactory.createResultat();
		res.setScore(tireur1 + " " + scoreG + " - " + tireur2 + " " + scoreD);
		res.setTemps(temps);
		match.setResultat(res);
	}

	private void afficherTireur(Competition competition, Tireur tireur) {
		int choice = -1;	
		do {
			MenuView.printTireurMenu(tireur);
			choice = InputUtils.inputInt(null);
			if (choice == 1) this.afficherMatchs(competition, tireur.getMatch());
			else if (choice == 2) this.modifierTireur(tireur);
			else if (choice != 0) Ansi.printError("Option non correct");
		} while (choice != 0);
	}
	
	private void modifierTireur(Tireur tireur) {
		MenuView.printTireurInfo(tireur);
		
		String nom = InputUtils.inputString("nom ? (laisser vide si pas de changement)");
		String prenom = InputUtils.inputString("prénom ? (laisser vide si pas de changement)");
		TypeCategorie cate = InputUtils.inputCategorieNull();
		TypeSexe sexe = InputUtils.inputSexeHumainNull();
		
		if (nom != null && !nom.isBlank())
			tireur.setNom(nom);
		
		if (prenom != null && !prenom.isBlank())
			tireur.setNom(prenom);
		
		if (cate != null) {
			tireur.setCategorie(cate);
		}
		
		if (sexe != null) {
			tireur.setSexe(sexe);
		}
	}

	private void creerMatch(Competition competition) {
		throw new java.lang.UnsupportedOperationException("Methode not implemented (creerMatch)");		
	}

	private void afficherClubs(Competition competition) {
		EList<Club> club = competition.getClub();
		throw new java.lang.UnsupportedOperationException("Methode not implemented (afficherClubs)");		
	}
	
	
	private void createCompetion() {
		Ansi.printTitle("Création d'une compétition");
		
		String nom = InputUtils.inputString("Nom ?");
		Adresse adresse = selectAdress();
		
		Competition competition = competitionFactory.createCompetition();
		competition.setAdresse(adresse);
		competition.setNom(nom);
		
		resource.ajoutCompetion(competition);
	}

	private Adresse selectAdress() {
		Adresse adr = competitionFactory.createAdresse();
		String adrPostale = InputUtils.inputString("Adresse postale ?");
		int codePostal = InputUtils.inputInt("Code postal ?");
		String ville = InputUtils.inputString("Ville ?");
		
		adr.setAdressePostale(adrPostale);
		adr.setCodePostal(codePostal);
		adr.setVille(ville);
		return adr;
	}

}

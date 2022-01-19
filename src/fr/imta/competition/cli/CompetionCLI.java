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
import imt.imtmde.Tireur;

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
				// e.printStackTrace();
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
		int choice = -1;	
		do {
			MenuView.printMatchs(matchs);
			choice = InputUtils.inputInt(null);
			if (choice == 1) this.creerMatch(competition);
			else if (choice - 2 < matchs.size() && choice - 2 >= 0) this.detailsMatch(competition, competition.getMatch().get(choice-2));
			else if (choice != 0) Ansi.printError("Option non correct");
		} while (choice != 0);
		
	}

	private void detailsMatch(Competition competition, Match match) {
		int choice = -1;	
		do {
			MenuView.printMatchInfo(match);
			choice = InputUtils.inputInt(null);
			if (choice == 1) this.afficherTireur(match.getTireurs().get(0));
			else if (choice == 2) this.afficherTireur(match.getTireurs().get(1));
			else if (choice == 3) this.inscrireScore(match);
			else if (choice != 0) Ansi.printError("Option non correct");
		} while (choice != 0);
	}

	private void inscrireScore(Match match) {
		// TODO Auto-generated method stub
	}

	private void afficherTireur(Tireur tireur) {
		// TODO Auto-generated method stub
	}

	private void creerMatch(Competition competition) {
		// TODO Auto-generated method stub
		
	}

	private void afficherClubs(Competition competition) {
		EList<Club> club = competition.getClub();
		// TODO Auto-generated method stub
		
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

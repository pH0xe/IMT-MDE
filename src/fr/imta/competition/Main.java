package fr.imta.competition;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import fr.imta.competition.cli.CompetionCLI;
import fr.imta.competition.utils.Ansi;

public class Main {

	public static void main(String[] args) {
		ResourceUtils resource = new ResourceUtils();
		if (args.length == 0) {
			String path = "./xmi/" + getDateFormatted(new Date()) + ".xmi";
			Ansi.printYellow("Création de : " + path);
			resource.creerRessource(path);
		} else {
			Ansi.printYellow("Chargement de : " + args[0]);
			resource.chargerModele(args[0]);
		}
		
		if (args.length > 1 && args[1].equals("API")) {
			throw new UnsupportedOperationException("API not yet implemented");
		} else {
			CompetionCLI.run(resource);
		}
		
		
		try {
			resource.sauvegarderResource();
			Ansi.printGreen("Modele sauvegard� avec succ�s");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String getDateFormatted(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm");  
		return dateFormat.format(date);  
	}
}

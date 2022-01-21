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
			Ansi.printYellow("Creation de : " + path);
			resource.creerRessource(path);
		} else {
			Ansi.printYellow("Chargement de : " + args[0]);
			resource.chargerModele(args[0]);
		}
		
		CompetionCLI.run(resource);
		
		try {
			resource.sauvegarderResource();
			Ansi.printGreen("Modele sauvegarde avec succes");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String getDateFormatted(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm");  
		return dateFormat.format(date);  
	}
}

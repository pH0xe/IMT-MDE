package fr.imta.competition.utils;

import java.io.InputStream;
import java.util.Scanner;

import imt.imtmde.TypeArme;
import imt.imtmde.TypeCategorie;
import imt.imtmde.TypeSexe;

public class InputUtils {
	public static final InputStream inputStream = System.in;
	
	public static int inputInt(String question) {
		int res = -1;
		Scanner sc = new Scanner(inputStream);
		do {
			if (question != null) Ansi.printQuestion(question);
			try {
				res = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				Ansi.printError("Saisir un entier >= 0");
			}
		} while (res < 0);
		return res;
	}
	
	public static int inputIntNull(String question) {
		int res = -1;
		Scanner sc = new Scanner(inputStream);
		do {
			if (question != null) Ansi.printQuestion(question);
			try {
				res = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				return -1;
			}
		} while (res < 0);
		return res;
	}
	
	public static String inputString(String question) {
		Scanner sc = new Scanner(inputStream);
		Ansi.printQuestion(question);
		return sc.nextLine();
	}
	
	public static TypeSexe inputSexe() {
		int res = -1;
		boolean stop = false;
		Scanner sc = new Scanner(inputStream);
		while (true) {
			Ansi.printQuestion("Choix du Sexe :");
			int count = TypeSexe.values().length;
			for  (int i = 0; i < count; i++) {
				Ansi.printDefault(i + ") " + TypeSexe.get(i));
			}
			try {
				res = Integer.parseInt(sc.nextLine());
				if (res < count && res >= 0)
					return TypeSexe.get(res);
			} catch (Exception e) {
				Ansi.printError("Saisir un choix valide");
			}
		}
	}
	
	public static TypeSexe inputSexeHumain() {
		int res = -1;
		boolean stop = false;
		Scanner sc = new Scanner(inputStream);
		while (true) {
			Ansi.printQuestion("Choix du Sexe :");
			Ansi.printDefault("1) " + TypeSexe.FEMME);
			Ansi.printDefault("2) " + TypeSexe.HOMME);
			try {
				res = Integer.parseInt(sc.nextLine());
				if (res == 1)
					return TypeSexe.FEMME;
				if (res == 2)
					return TypeSexe.HOMME;
			} catch (Exception e) {
				Ansi.printError("Saisir un choix valide");
			}
		}
	}
	
	public static TypeCategorie inputCategorie() {
		int res = -1;
		boolean stop = false;
		Scanner sc = new Scanner(inputStream);
		while (true) {
			Ansi.printQuestion("Choix de la catégorie :");
			int count = TypeCategorie.values().length;
			for  (int i = 0; i < count; i++) {
				Ansi.printDefault(i + ") " + TypeCategorie.get(i));
			}
			try {
				res = Integer.parseInt(sc.nextLine());
				if (res < count && res >= 0)
					return TypeCategorie.get(res);
			} catch (Exception e) {
				Ansi.printError("Saisir un choix valide");
			}
		}
	}
	
	public static TypeArme inputArme() {
		int res = -1;
		boolean stop = false;
		Scanner sc = new Scanner(inputStream);
		while (true) {
			Ansi.printQuestion("Choix de l'arme :");
			int count = TypeArme.values().length;
			for  (int i = 0; i < count; i++) {
				Ansi.printDefault(i + ") " + TypeArme.get(i));
			}
			try {
				res = Integer.parseInt(sc.nextLine());
				if (res < count && res >= 0)
					return TypeArme.get(res);
			} catch (Exception e) {
				Ansi.printError("Saisir un choix valide");
			}
		}
	}
	
	public static TypeSexe inputSexeNull() {
		int res = -1;
		boolean stop = false;
		Scanner sc = new Scanner(inputStream);
		while (true) {
			Ansi.printQuestion("Choix du Sexe :");
			int count = TypeSexe.values().length;
			Ansi.printDefault("0) Conserver");

			for  (int i = 0; i < count; i++) {
				Ansi.printDefault((i+1) + ") " + TypeSexe.get(i));
			}
			try {
				res = Integer.parseInt(sc.nextLine());
				if (res == 0) return null;
				if (res <= count && res >= 0)
					return TypeSexe.get(res-1);
			} catch (Exception e) {
				Ansi.printError("Saisir un choix valide");
			}
		}
	}
	
	public static TypeSexe inputSexeHumainNull() {
		int res = -1;
		boolean stop = false;
		Scanner sc = new Scanner(inputStream);
		while (true) {
			Ansi.printQuestion("Choix du Sexe :");
			Ansi.printDefault("0) Conserver");
			Ansi.printDefault("1) " + TypeSexe.FEMME);
			Ansi.printDefault("2) " + TypeSexe.HOMME);
			try {
				res = Integer.parseInt(sc.nextLine());
				if (res == 0) return null;
				if (res == 1)
					return TypeSexe.FEMME;
				if (res == 2)
					return TypeSexe.HOMME;
			} catch (Exception e) {
				Ansi.printError("Saisir un choix valide");
			}
		}
	}
	
	public static TypeCategorie inputCategorieNull() {
		int res = -1;
		boolean stop = false;
		Scanner sc = new Scanner(inputStream);
		while (true) {
			Ansi.printQuestion("Choix de la categorie :");
			int count = TypeCategorie.values().length;
			Ansi.printDefault("0) Conserver");

			for  (int i = 0; i < count; i++) {
				Ansi.printDefault((i+1) + ") " + TypeCategorie.get(i));
			}
			try {
				res = Integer.parseInt(sc.nextLine());
				if (res == 0) return null;
				if (res <= count && res >= 0)
					return TypeCategorie.get(res-1);
			} catch (Exception e) {
				Ansi.printError("Saisir un choix valide");
			}
		}
	}
	
	public static TypeArme inputArmeNull() {
		int res = -1;
		boolean stop = false;
		Scanner sc = new Scanner(inputStream);
		while (true) {
			Ansi.printQuestion("Choix de l'arme :");
			int count = TypeArme.values().length;
			Ansi.printDefault("0) Conserver");
			for  (int i = 0; i < count; i++) {
				Ansi.printDefault((i+1) + ") " + TypeArme.get(i));
			}
			try {
				res = Integer.parseInt(sc.nextLine());
				if (res == 0) return null;
				if (res <= count && res >= 0)
					return TypeArme.get(res-1);
			} catch (Exception e) {
				Ansi.printError("Saisir un choix valide");
			}
		}
	}
	
}

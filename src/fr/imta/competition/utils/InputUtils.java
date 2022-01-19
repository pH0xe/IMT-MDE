package fr.imta.competition.utils;

import java.io.InputStream;
import java.util.Scanner;

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
	
	public static String inputString(String question) {
		Scanner sc = new Scanner(inputStream);
		Ansi.printQuestion(question);
		return sc.nextLine();
	}
	
}

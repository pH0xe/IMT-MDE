package fr.imta.competition.utils;

public class Ansi {
	private static void println(String text, String foregroundColor, String backgroundColor) {
		System.out.println(backgroundColor + foregroundColor + text + AnsiColor.ANSI_RESET);
	}
	
	private static void println(String text, String foregroundColor) {
		println(text, foregroundColor, "");
	}
	
	public static void printGreen(String text) {
		println(text, AnsiColor.ANSI_GREEN);
	}
	
	public static void printYellow(String text) {
		println(text, AnsiColor.ANSI_YELLOW);
	}
	
	public static void printTitle(String text) {
		int count = 5;
		text = " ".repeat(count) + text + " ".repeat(count);
		String sep = "=".repeat(text.length());
		println("\n\n\n" + sep, AnsiColor.ANSI_BLACK, AnsiColor.ANSI_BRIGHT_BLUE_BACKGROUND);
		println(text, AnsiColor.ANSI_BLACK, AnsiColor.ANSI_BRIGHT_BLUE_BACKGROUND);
		println(sep, AnsiColor.ANSI_BLACK, AnsiColor.ANSI_BRIGHT_BLUE_BACKGROUND);

	}
	
	public static void printDefault(String text) {
		println(text, "");
	}

	public static void printRed(String text) {
		println(text, AnsiColor.ANSI_RED);
	}
	
	public static void printCyan(String text) {
		println(text, AnsiColor.ANSI_BRIGHT_CYAN);
	}

	public static void printQuestion(String text) {
		println(text, AnsiColor.ANSI_BRIGHT_BLUE);
	}

	public static void printError(String text) {
		printRed(text);
	}

	public static void printInfo(String text) {
		printCyan(text);
	}
}

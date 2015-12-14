package main;

import java.util.Scanner;

public class Player {
	private Scanner inputScanner;

	public Player() {
		inputScanner = new Scanner(System.in);
	}

	public Move getMove() {
		String userInput = getUserInput();
		return Move.valueOf(userInput);
	}

	private String getUserInput() {
		return inputScanner.nextLine();
	}


}

package main;

public enum Move {
	ROCK("ROCK"),
	PAPER("PAPER"),
	SCISSORS("SCISSORS"),
	LIZARD("LIZARD"),
	SPOCK("SPOCK");

	private final String code;

	private Move(final String code) {
		this.code = code;
	}

}

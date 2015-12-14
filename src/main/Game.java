package main;

public class Game {

	private Player player;
	private Computer computer;

	public static void main(String[] args) {
		Game game = new Game();
		game.play();
	}

    private void play() {
        System.out.println("Lets play!");
		player = new Player();
		computer = new Computer();
		System.out.println(calculateWinner(computer.getMove(), player.getMove()));
	}


	private int calculateWinner(Move computerMove, Move playerMove) {
		if(computerMove == playerMove) {
			return 0;
		}

		switch (computerMove) {
		case ROCK:
			return (playerMove == Move.SCISSORS ? 1 : -1);
		}

		return 1;
	}
}

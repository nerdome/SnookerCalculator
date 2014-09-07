/**
 *
 */
package snookercalculator;

import java.io.IOException;

/**
 * @author fightcookie
 */
public class Main {

	/**
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String newGame = IOHandler.readLine("Start a new game? (y / n):");
//		System.out.println(newGame);
		if (newGame.equals("y")) {
//	y	if (true) {
			Calculator Table1 = new Calculator();
			Table1.newFrame();
			while (Table1.calcRemainingPoints() > 0) {
				String player = IOHandler.readLine("Enter player 1 or player 2: ");
				int ballValue = Integer.parseInt(IOHandler.readLine("Enter ball value: "));
				Table1.calcPottedBall(player, ballValue);
				String remainingPoints = "Remaining Points: " + Table1.calcRemainingPoints();
				IOHandler.println(remainingPoints);
				String scorePlayer1 = "Score of Player 1: " + Table1.getScorePlayer1();
				IOHandler.println(scorePlayer1);
				String scorePlayer2 = "Score of Player 2: " + Table1.getScorePlayer2();
				IOHandler.println(scorePlayer2);
			}
			if (Table1.getScorePlayer1() > Table1.getScorePlayer2()) {
				IOHandler.println("Player 1 wins! :)");
			} else if (Table1.getScorePlayer2() > Table1.getScorePlayer1()) {
				IOHandler.println("Player 2 wins! :)");
			} else {
				IOHandler.println("Tie! Respotted Black!");
			}
		}
	}

}

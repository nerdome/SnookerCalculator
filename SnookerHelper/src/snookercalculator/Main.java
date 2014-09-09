/**
 *
 */
package snookercalculator;


/**
 * @author fightcookie
 */
public class Main {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		while (IOHandler.readLine("Start a new game? (y / n):").equals("y")) {
			Calculator Table1 = new Calculator();
			Table1.newFrame();

			// print scores and remaining points after each potted ball
			while (Table1.remainingPoints() > 0) {
				String currentPlayer = IOHandler.readLine("Enter current player (1 / 2): ");
				int pottedBallValue = Integer.parseInt(IOHandler.readLine("Enter value of potted ball: "));
				Table1.calcPottedBall(currentPlayer, pottedBallValue);
				IOHandler.println("Score of Player 1: " + Table1.getScorePlayer1());
				IOHandler.println("Score of Player 2: " + Table1.getScorePlayer2());
				IOHandler.println("Remaining Points: " + Table1.remainingPoints());
			}
			if (Table1.getScorePlayer1() > Table1.getScorePlayer2()) {
				IOHandler.println("Player 1 wins! :)");
			} else if (Table1.getScorePlayer2() > Table1.getScorePlayer1()) {
				IOHandler.println("Player 2 wins! :)");
			} else {
				IOHandler.println("Tie! :O Respotted Black!");
			}
		}
	}

}

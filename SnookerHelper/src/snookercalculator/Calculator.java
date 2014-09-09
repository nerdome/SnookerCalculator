/**
 *
 */
package snookercalculator;

/**
 * @author fightcookie
 */

// defines values of the balls
// calculates:
// - current existence / number of balls on the table
// - current scores of the players
// - current maximum remaining points
class Calculator {
	// constant values of the balls
	final static int RED = 1;
	final static int YELLOW = 2;
	final static int GREEN = 3;
	final static int BROWN = 4;
	final static int BLUE = 5;
	final static int PINK = 6;
	final static int BLACK = 7;

	private int scorePlayer1;
	private int scorePlayer2;

	// declaration of fields for number / existence of balls on the table
	private int redBalls;
	private boolean yellowBall;
	private boolean greenBall;
	private boolean brownBall;
	private boolean blueBall;
	private boolean pinkBall;
	private boolean blackBall;

	/**
	 * resets scores and balls on the table
	 */
	void newFrame() {
		scorePlayer1 = 0;
		scorePlayer2 = 0;
		redBalls = 15;
		yellowBall = true;
		greenBall = true;
		brownBall = true;
		blueBall = true;
		pinkBall = true;
		blackBall = true;
	}

	private void increaseScore(String player, int scoredPoints) {
		if (player.equals("1")) {
			scorePlayer1 += scoredPoints;
		}
		if (player.equals("2")) {
			scorePlayer2 += scoredPoints;
		}
	}

	/**
	 * depending on potted ball: increases score of respective player and changes number/ existence of balls on the table (if necessary)
	 *
	 * @param player who potted the ball, 1 or 2
	 * @param ballValue value of the ball from 1 to 7, standing for red, yellow, green, brown, blue, pink and black
	 */
	void calcPottedBall(String player, int ballValue) {
		// validate ball value
		if (ballValue > 0 && ballValue < 8) {
			increaseScore(player, ballValue);
			// change number / existence of balls on the table
			// only remove colored when no reds are on the table anymore
			if (redBalls == 0) {
				switch (ballValue) {
					case 2:
						yellowBall = false;
						break;
					case 3:
						greenBall = false;
						break;
					case 4:
						brownBall = false;
						break;
					case 5:
						blueBall = false;
						break;
					case 6:
						pinkBall = false;
						break;
					case 7:
						blackBall = false;
						break;
					default:
						break;
				}
			} else if (ballValue == 1) {
				redBalls--;
			}
		}
	}

	/**
	 * @return maximum remaining points on the table (ergo potting all reds with blacks and all colors after that)
	 */
	int remainingPoints() {
		// add remaining reds (value=1, maxNumber=15) all potted with black
		// (value=7)
		int remainingPoints = redBalls * 8;
		// add remaining non-recurring single pottable colors from the end,
		// after potting all reds
		if (yellowBall) {
			remainingPoints = remainingPoints + 2;
		}
		if (greenBall) {
			remainingPoints = remainingPoints + 3;
		}
		if (brownBall) {
			remainingPoints = remainingPoints + 4;
		}
		if (blueBall) {
			remainingPoints = remainingPoints + 5;
		}
		if (pinkBall) {
			remainingPoints = remainingPoints + 6;
		}
		if (blackBall) {
			remainingPoints = remainingPoints + 7;
		}
		return remainingPoints;
	}

	public int getScorePlayer1() {
		return scorePlayer1;
	}

	public int getScorePlayer2() {
		return scorePlayer2;
	}


}

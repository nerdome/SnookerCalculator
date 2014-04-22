/**
 * 
 */
package snookercalculator;

/**
 * @author Administrator
 * 
 */

// defines values of the balls
// calculates:
// - current existence / number of balls on the table
// - current scores of the players
// - current maximum remaining points
class Calculator {
	// constant values of the balls
	final static int	RED		= 1;
	final static int	YELLOW	= 2;
	final static int	BROWN	= 3;
	final static int	GREEN	= 4;
	final static int	BLUE	= 5;
	final static int	PINK	= 6;
	final static int	BLACK	= 7;

	private int	scorePlayer1;
	private int	scorePlayer2;

	// declaration of fields for number / existence of balls on the table
	private int			redBalls;
	private boolean	yellowBall;
	private boolean	brownBall;
	private boolean	greenBall;
	private boolean	blueBall;
	private boolean	pinkBall;
	private boolean		blackBall;

	// resets scores and balls on the table
	void newFrame() {
		scorePlayer1 = 0;
		scorePlayer2 = 0;
		redBalls = 15;
		yellowBall = true;
		brownBall = true;
		greenBall = true;
		blueBall = true;
		pinkBall = true;
		blackBall = true;
	}

	private void increaseScore(String player, int increment) {
		if (player.equals("player1")) {
			scorePlayer1 = scorePlayer1 + increment;
		}
		if (player.equals("player2")) {
			scorePlayer2 = scorePlayer2 + increment;
		}
	}

	// depending on potted ball: increases score of respective player and
	// changes number/ existence of balls on the table (if necessary)
	void calcPottedBall(String player, int ballValue) {
		// check if ball value is valid
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
						brownBall = false;
						break;
					case 4:
						greenBall = false;
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

	// calculates maximal remaining points on the table (ergo potting all reds
	// with blacks and all colors after that)
	int calcRemainingPoints() {
		// add remaining reds (value=1, maxNumber=15) all potted with black
		// (value=7)
		int remainingPoints = redBalls * 8;
		// add remaining non-recurring single pottable colors from the end,
		// after potting all reds
		if (yellowBall) {
			remainingPoints = remainingPoints + 2;
		}
		if (brownBall) {
			remainingPoints = remainingPoints + 3;
		}
		if (greenBall) {
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


}

/**
 * 
 */
package snookercalculator;

import java.io.IOException;

/**
 * @author Administrator
 *
 */
public class Gui {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String newGame = InputHandler.readLine("Start a new game? (y / n):");
		System.out.println(newGame);
		// if (newGame.equals("y")) {
		if (true) {
			Calculator Table1 = new Calculator();
			Table1.newFrame();
			System.out.println(Table1.calcRemainingPoints());
		}
	}

}

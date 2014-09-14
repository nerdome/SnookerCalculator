/**
 *
 */
package snookercalculator;

import java.io.*;

/**
 * @author fightcookie
 */

// is used instead of Console.*; for reading from and writing to console.
// TODO directly write int variables with BufferedWriter?
class IOHandler {
	/**
	 * prints string to console and returns user input from console as single string
	 *
	 * @param output string to be printed to console
	 * @return user input from console as single string
	 */
	static String readLine(String output) {
		// printing output with buffered System.out
		print(output);

		// getting input with buffered System.in and returning it
		String result = null;
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
			result = input.readLine();
		} catch (IOException e) {
			System.err.println("Error on reading from console! See error log for details.");
			System.err.println("Exception! Cause: " + e.getCause() + " Message: " + e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * prints string to console with buffered System.out
	 *
	 * @param output string to be printed to console
	 */
	static void print(String output) {
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));
			writer.write(output);
			writer.flush();
		} catch (IOException e) {
			System.err.println("Error on writing to console! See error log for details.");
			System.err.println("Exception! Cause: " + e.getCause() + " Message: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * prints integer to Console with buffered System.out
	 *
	 * @param output integer to be printed to console
	 */
	static void print(int output) {
		String stringOutput = String.valueOf(output);
		print(stringOutput);
	}

	/**
	 * prints output String and line separator to console with buffered System.out
	 *
	 * @param output string to be printed to console
	 */
	static void println(String output) {
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));
			writer.write(output);
			writer.newLine();
			writer.flush();
		} catch (IOException e) {
			System.err.println("Error on writing to console! See error log for details.");
			System.err.println("Exception! Cause: " + e.getCause() + " Message: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * prints integer and line separator to console with buffered System.out
	 *
	 * @param output integer to be printed to console
	 */
	static void println(int output) {
		String stringOutput = String.valueOf(output);
		println(stringOutput);
	}
}

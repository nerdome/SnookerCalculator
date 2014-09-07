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
	// prints output String and returns console user input as single String.
	static String readLine(String output) {
		// printing output with buffered System.out
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"));
			writer.write(output);
			writer.flush();
		} catch (IOException e) {
			System.err.println("Error on writing to console! See error log for details.");
			System.err.println("Exception! Cause: " + e.getCause() + " Message: " + e.getMessage());
			e.printStackTrace();
		}

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

	// prints output String with buffered System.out
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

	// prints output Integer with buffered System.out
	static void print(int output) {
		String stringOutput = String.valueOf(output);
		print(stringOutput);
	}

	// prints output String and line separator with buffered System.out
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

	// prints output Integer and line separator with buffered System.out
	static void println(int output) {
		String stringOutput = String.valueOf(output);
		println(stringOutput);
	}
}

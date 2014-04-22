/**
 * 
 */
package snookercalculator;

import java.io.*;



/**
 * @author Administrator
 *
 */
// is used instead of Console.*; for reading from and writing to console.
class InputHandler {
	// method prints output String and returns console user input as single
	// String.
	static String readLine(String output) throws IOException {
		// printing output with buffered System.out
		// try (PrintWriter writer = new PrintWriter(System.out, true)) {
		// writer.print(output);
		// writer.flush();
		// // writer.close();
		// }
		System.out.print("output with system.out" + output);

		// getting input with buffered System.in and returning it
		StringBuilder sb = new StringBuilder();
		String read = null;
		try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			read = input.readLine();
			// System.out.println("read = input.readLine after try resource declaration"
			// + read);
			// while (read != null) {
			if (read != null) {
				// System.out.println("read after check if read!=0 / in if statment"
				// + read);
			sb.append(read);
				System.out.println("sb.toString after sb.append(read)" + sb.toString());
			// read = input.readLine();
			}
			// System.out.println("sb.toString after if statment "sb.toString());
		}
		// System.out.println(sb.toString());
		return sb.toString();
		// return read;

	}
}

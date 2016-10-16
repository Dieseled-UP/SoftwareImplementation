package main;

import javax.swing.JOptionPane;

public class IntToString {

	public static void main(String[] args) {

		convertInput(showInput());

	}

	/**
	 * Method to show the the input dialog
	 * 
	 * @return String user input
	 */
	public static String showInput() {

		return JOptionPane.showInputDialog(null, "Enter an integer.");
	}

	/**
	 * Method to convert the users input to a integer
	 * 
	 * @param input
	 */
	public static void convertInput(String input) {

		// We will try now to convert the string to an integer
		// If there is an issue we will use recursion to reopen
		// dialog till the user gets it right
		try {

			int number = Integer.parseInt(input);
			System.out.printf("This is the number you entered %d, conversion was successful", number);

		} catch (NumberFormatException e) {

			// From the error messages we know that the problem is
			// a number format exception so we will use it here

			JOptionPane.showMessageDialog(null, "Sorry that was not a number", "ERROR", JOptionPane.WARNING_MESSAGE);
			convertInput(showInput());

		} catch (Exception e) {

			// We can try the default Exception to catch problems
			// but this is not always successful

			// We can also print out the different error messages
			// that we can use to debug the program
			System.err.println(e.getMessage() + "\n");

			System.err.println(e.toString() + "\n");

			e.printStackTrace();
		}
	}

}

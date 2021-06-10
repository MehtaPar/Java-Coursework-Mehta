// Calculates the number of characters within a given string via user input
// AUTHOR: PARAM MEHTA

import java.util.Scanner;
public class CalcCharacters {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in); 
			
			System.out.print("Enter a string: ");
			String string = input.nextLine();

			System.out.println(
				"The number of letters in the string " + 
				string + ": " + letters(string));
		}

		public static int letters(String s) {
			int numLetters = 0;
			for (int i = 0; i < s.length(); i++) {
				if (Character.isLetter(s.charAt(i)))
					numLetters++;
			}
			return numLetters;
		}
	}

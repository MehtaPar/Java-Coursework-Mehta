// This will find the last character within the string entered by the user input
// AUTHOR: PARAM MEHTA

import java.util.Scanner;

public class LastCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String l = input.nextLine();
		
		String line = l.trim();
		int index = line.length()-1;
		char last = line.charAt(index);
		
		System.out.println("The last character is " + last);
	}

}

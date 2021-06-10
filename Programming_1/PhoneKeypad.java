//phone keypad from letters to the corresponding number
// AUTHOR: PARAM MEHTA


import java.util.Scanner;

public class PhoneKeypad {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Letter: ");
		char letter = input.findInLine(".").charAt(0);
		String num;
		
		switch(letter) {
		case 'a':
		case 'A':
		case 'b':
		case 'B':
		case 'c':
		case 'C':
			num = "2";
			break;
		
		case 'd':
		case 'D':
		case 'e':
		case 'E':
		case 'f':
		case 'F':
			num = "3";
			break; 
			
		case 'g':
		case 'G':
		case 'h':
		case 'H':
		case 'i':
		case 'I':
			num = "4";
			break;
			
		case 'j':
		case 'J':
		case 'k':
		case 'K':
		case 'l':
		case 'L':
			num = "5";
			break;
			
		case 'm':
		case 'M':
		case 'n':
		case 'N':
		case 'o':
		case 'O':
			num = "6";
			break;
			
		case 'p':
		case 'P':
		case 'q':
		case 'Q':
		case 'r':
		case 'R':
		case 's':
		case 'S':
			num = "7";
			break;
			
		case 't':
		case 'T':
		case 'u':
		case 'U':
		case 'v':
		case 'V':
			num = "8";
			break;
			
		case 'w':
		case 'W':
		case 'x':
		case 'X':
		case 'y':
		case 'Y':
		case 'z':
		case 'Z':
			num = "9";
			break;
			
		default:
			num = "Invalid Input";
		}
		
		
		System.out.println(num);
}
}
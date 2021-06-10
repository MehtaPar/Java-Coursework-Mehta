//simple conversion of kg to lbs
//AUTHOR PARAM MEHTA

import java.util.Scanner;

public class KgLb {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number in kilograms: ");
		double kg = input.nextDouble();
		
		double lb = kg * 2.2;
		System.out.print(kg + " Kilograms is " + lb + " pounds");
		
		
	}
	
	
}

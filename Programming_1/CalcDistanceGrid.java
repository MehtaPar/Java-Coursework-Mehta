//Calculates the distance via x,y grid values with user input
//AUTHOR: PARAM MEHTA

import java.util.Scanner;

public class CalcDistanceGrid {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter X1");
		double X1 = input.nextDouble();
		
		System.out.println("Enter Y1");
		double Y1 = input.nextDouble();

		System.out.println("Enter X2");
		double X2 = input.nextDouble();
		
		System.out.println("Enter y2");
		double Y2 = input.nextDouble();

		double finaldistance = Math.sqrt((Y2 - Y1) * (Y2 - Y1) + (X2 - X1) * (X2 - X1));
				
		System.out.println("The distance between the two points is: " + finaldistance );
		
	}
}

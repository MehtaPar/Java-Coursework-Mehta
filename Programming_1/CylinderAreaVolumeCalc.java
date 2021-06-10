//Calculates the area and volume of a given cylinder with user input of radius and lenght
// AUTHOR PARAM MEHTA

import java.util.Scanner;

public class CylinderAreaVolumeCalc {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a radius");
		double radius = input.nextDouble();
		
		System.out.println("Enter the length");
		double length = input.nextDouble();
		
		double area = radius * radius * 3.14159;
		double volume = area * length;
		
		System.out.println("Area is: " + area);
		System.out.println("volume is " + volume);
		
		
		
	}
}

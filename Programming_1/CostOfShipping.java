//Author: Param Mehta

import java.util.Scanner;

public class CostOfShipping {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
	System.out.println("Enter the weight of your package: ");
	double w = input.nextDouble();
	
	double price = 0;
	
	if(w <= 0) {
		System.out.println("INVALID INPUT");
	}
	
	else if(w > 20) {
		System.out.println("The package cannot be shipped");
	}
	
	else if(w > 0 && w <= 1) {
		price = 3.5;
	}
	
	else if(w > 1 && w <= 3) {
		price = 5.5;
	}
	
	else if(w > 3 && w <= 10) {
		price = 8.5;
	}
	
	else if(w > 10 && w <= 20)
		price = 10.5;
	
	
	System.out.println("The cost to ship the package is: $" + price);
	}
	
	
}

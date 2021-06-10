//Calculates future investment via user input
//AUTHOR PARAM MEHTA

import java.util.Scanner;

public class FutureInvestment {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("enter investment amount: ");
double investment = input.nextDouble();

System.out.println("enter annual interest rate: ");
double rate = input.nextDouble();

System.out.println("enter amount of years: ");
double years = input.nextDouble();

//double b = years * 12;

double futureInvestmentValue  = investment * Math.pow((1 + (rate / 1200.0)), (years * 12));

futureInvestmentValue = (int) (futureInvestmentValue * 100) / 100.0;

System.out.println("Accumalated Value is: " + futureInvestmentValue);

	}
}
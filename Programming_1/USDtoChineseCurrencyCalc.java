import java.util.Scanner;

//CONVERTS USD TO CHINESE CURRENCY AND VICE VERSA
//AUTHOR: PARAM MEHTA

public class USDtoChineseCurrencyCalc {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter 0 to convert from U.S dollars to Chineese RMB or 1 to convert from Chinese RMB to U.S dollars");
		int prompt = input.nextInt();
		
		if(prompt == 0) {
			System.out.print("Enter the Dollar amount: ");
			double dol = input.nextDouble();
			double yuan = dol * rate;
			System.out.print("$ " + dol + " is " + yuan);
		}
		
		else if(prompt == 1){
			System.out.print("Enter the Yuan amount: ");
			double yuan = input.nextDouble();
			double dol = yuan / rate;
			System.out.print(yuan + " yuan " + " is " + dol);
		}
		
		else {
			System.out.println("INCORRECT INPUT!");
		}
		

	}
	
	
}

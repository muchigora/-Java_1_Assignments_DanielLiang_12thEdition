/**
 * 
 */
package financials.exchanges;

import java.util.Scanner;

/**
 * Chapter 3 Exercise 31: Financials: currency exchange
 * Write a program that prompts the user to enter the exchange rate from currency in 
 * U.S. dollars to Chinese RMB. 
 * Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert
 * from Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S. dollars or 
 * Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively. 
 * Here are the sample runs: (see attached image of the question)
 * 
 * @author Muchi compiled Dec 12th, of 2021
 *
 */
public class FinancialsCurrencyExchange {

	
	public static void main(String[] args) {
		double EXCHANGERATE = 6.81;
		
		// create scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 0 to convert from USD to RMB or 1 to convert from RMB to USD: ");
		int exchnageOption = scanner.nextInt();
		
		if(exchnageOption == 1) {
			System.out.println("Enter Chinese RMB to convert");
			double chValue = scanner.nextDouble();
			double usValue = chValue  / EXCHANGERATE;
			System.out.println("The USD value is: " + usValue);
		}
		else if(exchnageOption == 0) {
			System.out.println("Enter USD amount to convert: ");
			double usValue = scanner.nextDouble();
			double chValue = usValue * EXCHANGERATE;
			System.out.println("The RMB value is: " + chValue);
		}else
			System.out.println("Invalid Input");
		
		

	}

}

import java.util.Scanner;

/**
 * 
 */

/**
 * Ch01 Ex05 Financial Application
 * This program reads the subtotals of gratuity, and then calculates the total with a given rate
 * @author Muchi compiled June 28th of 2021
 *
 */
public class FinancialApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variable:
		double rate = 0.15;
		
		//Get subtotal from user:
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the gratuity Amount: ");
		double subTotal = input.nextDouble();
		
		//Computation
		double interest = subTotal * rate;
		double total = subTotal + interest;
		
		//Display
		System.out.println(total);
		
		

	}

}

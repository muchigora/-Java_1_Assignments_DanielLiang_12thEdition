import java.util.Scanner;

/**
 * 
 */

/**
 * @author Muchi compiled on July 3rd of 2021
 *
 */
public class ChangeCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//Receive Amount
		System.out.println("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		System.out.println("Your amount $ " + amount + " consists of: ");
		
		//Convert the received ammount into cents
		int remainingAmount = (int)(amount * 100);
		
		//Find the number of one dollar bills
		int oneDollarBills = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		System.out.println("" + oneDollarBills + " dollar bills");
		
		//Find the number of quarters
		int quarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		System.out.println("" + quarters + " quarters");
		
		//Find the number of dimes
		int dimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		System.out.println("" + dimes + " dimes");
		
		//Find the number of nickels
		int nickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		System.out.println("" + dimes + " nickels");
		
		//Find the number of nickels
		int pennies = remainingAmount;
		System.out.println("" + pennies + " pennies");


	}

}

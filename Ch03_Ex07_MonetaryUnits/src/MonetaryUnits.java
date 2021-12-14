import java.util.Scanner;

/**
 * 
 */

/**
 * Chapter 3 Exercise 7 Financial application: monetary units 
 * Modify Listing 2.10, ComputeChange.java, to display the nonzero denominations only,
 * using singular words for single units such as 1 dollar and 1 penny, and plural words 
 * for more than one unit such as 2 dollars and 3 pennies.
 * @author Muchi
 *
 */
public class MonetaryUnits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		
		//Get the Total amount of money
		System.out.println("Enter the total Amount you wish to change: ");
		double totalAmount = input.nextDouble();
		System.out.println("You have: " + totalAmount);
		
		//change the money into smaller denominations
		System.out.println("Your change is made up of: ");
		
		//Ten Dollar Denominations
		double tens = (totalAmount) / 10;
		double tensChange = totalAmount % 10;
		if (tens == 1) {
			System.out.println((int)tens +" Ten Dollar Bill");
		}
		else {
			System.out.println((int)tens +" Ten Dollar Bills");
		}
				
		//Five Dollar Denominations
		double fives = tensChange / 5;
		double fivesChange = tensChange % 5;
		if (fives == 1) {
			System.out.println((int)fives +" Five Dollar Bill");
		}
		else {
			System.out.println((int)fives +" Five Dollar Bills");
		}
		
		//One Dollar Denominations
		double ones = fivesChange / 1;
		double onesChange = fivesChange % 1;
		if (ones == 1) {
			System.out.println((int)ones +" One Dollar Bill");
		}
		else {
			System.out.println((int)ones +" one Dollar Bills");
		}
		System.out.println(ones);
		
		
		//Display result
		System.out.println("Your Total Amount is: " + totalAmount);
		

	}

}

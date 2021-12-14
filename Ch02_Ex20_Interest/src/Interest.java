import java.util.Scanner;

/**
 * 
 */

/**Ch02 Ex20: Financial Application: Calculate Interest
 * This program calculates the monthly interest based on the balance and annual
 * interest rate. The user will be prompted to enter the balance and annual interest 
 * rate. The program will display the interest payable that month
 * @author Muchi compiled on July 1st of 2021
 *
 */
public class Interest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your balance: ");
		double balance = input.nextDouble();
		
		System.out.println("Enter interest rate (e.g., 3 for 3%): ");
		double annualInterestRate = input.nextDouble();
		
		double interest = balance * (annualInterestRate / 1200);
		
		System.out.println("The interest is " + interest);
		
		

	}

}

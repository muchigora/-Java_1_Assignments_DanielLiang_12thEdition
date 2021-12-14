import java.util.Scanner;

/**
 * 
 */

/**Ch2 Ex20 - Financial Application: Calculate Future Investment Value
 * This program reads in investment amount, annual interest rate and number of years
 * then displays the future investment value
 * @author Muchi compiled on Jul 1st of 2021
 *
 */
public class FutureInvestmentValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user for information
		System.out.println("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.println("Enter annual interest rate percentange (e.g., 0.05 for 5%): ");
		double annualInterestRate = input.nextDouble();
		
		System.out.println("Enter number of years: ");
		double numberOfYears = input.nextDouble();
		
		//Computation
		double monthlyInterestRate = annualInterestRate / 12;
		
		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
		
		//Display Result
		System.out.println("Your investment value after "+ (int)numberOfYears + " years is " + futureInvestmentValue);

	}

}

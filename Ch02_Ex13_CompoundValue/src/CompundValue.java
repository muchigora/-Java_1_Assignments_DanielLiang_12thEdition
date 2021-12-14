import java.util.Scanner;

/**
 * 
 */

/**
 * Ch02 Ex13: Financial Application - Compund Value
 * This program calculates the value of month savings with compunded interest after six months.
 * The user enters the monthly savings and the program returns the compunded value after six months
 * 
 * @author Muchi compiled on Jun 30th of 2021
 *
 */
public class CompundValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Prompt user for Savings Amount
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your month saving Amount");
		final double saving = input.nextDouble();
		final double monthlyInterest = 0.05 / 12;
		
		//Month One Value
		double monthOneValue = saving * (1 + monthlyInterest);
		//System.out.println(monthOneValue);
		
		//Month Two Value
		double monthTwoValue = (saving + monthOneValue) * (1 + monthlyInterest);
		//System.out.println(monthTwoValue);
		
		//Month Three Value
		double monthThreeValue = (saving + monthTwoValue) * (1 + monthlyInterest);
		//System.out.println(monthThreeValue);
		
		//Month Four Value
		double monthFourValue = (saving + monthThreeValue) * (1 + monthlyInterest);
		//System.out.println(monthFourValue);
		
		//Month Five Value
		double monthFiveValue = (saving + monthFourValue) * (1 + monthlyInterest);
		//System.out.println(monthFiveValue);
		
		//Month Six Value
		double monthSixValue = (saving + monthFiveValue) * (1 + monthlyInterest);
		
				
		//Display
		System.out.println("The Saving Account Value after Six Months is $" + monthSixValue);

	}

}

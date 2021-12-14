import java.util.Scanner;

/**
 * 
 */

/**
 * Ch02 Ex04: Convert Pounds to Kilograms
 * This program promts user to enter a number in pounds and converts the pounds to kilograms
 * @author Muchi
 *
 */
public class ConvertPoundsToKilograms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variables
		double pounds;
		double kilograms;
		
		//Prompt User to enter number in pounds
		System.out.println("Enter the number of Pounds you wish to convert: ");
		Scanner input = new Scanner(System.in);
		pounds = input.nextDouble();
		
		//Convert Pounds to Kilograms
		kilograms = pounds * 0.454;
		
		//Display the result
		System.out.println( pounds + " pounds converts to " + kilograms + " kgs");
		

	}
	

}

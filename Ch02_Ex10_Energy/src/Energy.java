import java.util.Scanner;

/**
 * 
 */

/**
 * Chapter 2 Exercise 10: Calculating Energy
 * This program calculates the energy needed to heat water from an initial temperature to 
 * a final temperature.
 * @author Muchi
 *
 */
public class Energy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables:
		double waterAmount;
		double initialTemperature;
		double finalTemperature;
		final double CONSTANT = 4_184.0;
		
		//Prompt user to provide variable data
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter Amount of Water Required: ");
		waterAmount = input.nextDouble();
		
		System.out.print("Enter water temperature before heating: ");
		initialTemperature = input.nextDouble();
		
		System.out.print("Enter water temperature before after: ");
		finalTemperature = input.nextDouble();
		
		//Calculate required heat:
		double energy = waterAmount * (finalTemperature - initialTemperature) * CONSTANT;
		
		//Display Result:
		System.out.println(energy);
		
		

	}

}

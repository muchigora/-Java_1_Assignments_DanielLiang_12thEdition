import java.util.Scanner;

/**
 * 
 */

/**Ch02 Exercise23 - Financial Application: Cost of Driving
 *  This program computes the cost of driving. It prompts the user the user to enter
 *   the distance to drive, the fuel efficiency, the price per gallon and then displays
 *   the sost of of the trip  
 * @author Muchi compiled on July 2nd of 2021
 *
 */
public class CostOfDriving {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Declare variables and prompts user for values
		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		System.out.println("Enter miles per gallon of your vehicle: ");
		double efficiency = input.nextDouble();
		
		System.out.println("Enter price per gallon of fuel: ");
		double fuelCost = input.nextDouble();
		
		//Compute the cost of the trip
		double fuelQuantity = distance / efficiency;
		
		double tripCost = fuelQuantity * fuelCost;
		
		//Display
		System.out.println("The cost of driving " + distance + " miles is $ " + tripCost + "." );
		

	}

}

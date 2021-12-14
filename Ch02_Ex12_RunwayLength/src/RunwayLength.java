import java.util.Scanner;

/**
 * 
 */

/**
 * Chapter 02 Exercise 12: Finding Runway Length
 * This program computes the minimum runway length needed for an airplane to take off
 * @author Muchi
 *
 */
public class RunwayLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variables
		double a; //acceleration
		double v; //speed
		
		//Prompt user for details
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the airplane's acceleration m/s^2: ");
		a = input.nextDouble();
		System.out.println("Enter the airplane's take-off speed in m/s: ");
		v = input.nextDouble();
		
		//Computation
		double length = Math.pow(v, 2) / (2 * a);
		
		//Display
		System.out.println("the minimum runway length is " + length);
		

	}

}

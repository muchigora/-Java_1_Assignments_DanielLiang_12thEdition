import java.util.Scanner;

/**
 * 
 */

/**
 * Chapter2 Ex 3: Convert Meters to Feet
 * This Program reads a number in feet and converts it to meters
 * @author Muchi
 *
 */
public class ConvertMetersToFeet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variables
		double feet;
		double meters;
		
		//Input number in feet
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number ot feet to convert: ");
		feet = input.nextDouble();
		
		//Convert feet to meters
		meters = feet / 0.305;		
		
		//Display the result
		System.out.println(feet + " feet coverts to " + meters + " meters");

	}

}

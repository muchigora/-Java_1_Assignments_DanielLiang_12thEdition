import java.util.Scanner;

/**
 * 
 */

/**Ch02 Ex16: Geometry: Area of A Hexagon
 * This program computes the area of a Hexagon. It prompts the user to enter
 * the length of a side of the hexagon
 * @author Muchi compiled on July 1st of 2021
 *
 */
public class Hexagon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Prompt user for side of the hexagon
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of a side of the hexagon in cm: ");
		double s = input.nextDouble();		//s = side
		
		//Compute area of the Hexagon
		double area = 3 * Math.sqrt(3)/2 * Math.pow(s, 2);
		
		//Display area
		System.out.println("Area of the hexagon is: " + area + "cm2");

	}

}

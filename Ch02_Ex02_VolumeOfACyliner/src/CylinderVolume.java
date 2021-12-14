import java.util.Scanner;

/**
 * 
 */

/**Chapter 2 Excercise 2: Volume of A Cyliner
 * This program reads radius of a cyliner and uses it to compute area and Volume of the Cyliner
 * @author Muchi compiled July 28th of 2021
 *
 */
public class CylinderVolume {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		
		// Variable
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		//Area Computation
		double area = radius * radius * Math.PI;
		System.out.println("Area: " + area + " Sqr Units");
		
		//volume Computation
		double volume = area * length;
		System.out.println("Volume: " + volume + " Cubic Units");
		

	}

}

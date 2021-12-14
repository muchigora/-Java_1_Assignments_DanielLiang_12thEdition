import java.util.Scanner;

/**
 * 
 */

/**
 * Ch02 Ex15 Geometry: Distance of Two Points
 * this program computes the distance between two coordinates on the Cartesian plane
 * The user will enter the x and y coordinates for the two points and the program will 
 * return the distance between these two points
 * @author Muchi compiled Jun 30th of 2021
 *
 */
public class Geometry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// prompt user to enter coordinate points
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the X and Y coordinate values for Point A: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Point A coordinates are: " + x1 + " , " + y1);
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("Enter the X and Y coordinate values for Point B: : ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.println("Point B coordinates are: " + x2 + " , " + y2);
		System.out.println("-------------------------------------------------------------------");
		
		//Compute the distance 
		double distance = Math.sqrt((Math.pow((x2-x1), 2)) + Math.pow((y2-y1), 2));
		
		//Display result
		
		System.out.println("The distance between Point One and Point Two is: " + distance);
		System.out.println("===================================================================");
		

	}

}

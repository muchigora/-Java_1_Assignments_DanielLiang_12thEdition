import java.util.Scanner;

/**
 * 
 */

/**Ch2 Ex19 Geometry: Area Of A Triangle
 * This program prompts the user to enter coordinates of three points on a Cartesian plane
 * then computes the area of a triangle
 * @author Muchi
 *
 */
public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the X and Y coordinate values for Point A: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Point A coordinates are: " + x1 + " , " + y1);
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("Enter the X and Y coordinate values for Point B: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.println("Point A coordinates are: " + x1 + " , " + y1);
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("Enter the X and Y coordinate values for Point A: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		System.out.println("Point A coordinates are: " + x1 + " , " + y1);
		System.out.println("-------------------------------------------------------------------");
		
		//Determine Sides
		double side1 = Math.sqrt((Math.pow((x2-x1), 2)) + Math.pow((y2-y1), 2));
		double side2 = Math.sqrt((Math.pow((x3-x2), 2)) + Math.pow((y3-y2), 2));
		double side3 = Math.sqrt((Math.pow((x1-x3), 2)) + Math.pow((y1-y3), 2));
		
		//Determine Area
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		//Display Area
		System.out.println("The Area of the triangle is: " + area + "Sqr Units");
		System.out.println("===================================================================");

	}

}

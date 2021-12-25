/**
 * 
 */
package geometry.rectangle.coordinatepoint;

import java.util.Scanner;

/**
 * Ch03 Ex 23 Geometry: point in a rectangle?
 * Write a program that prompts the user to enter a point (x, y) and checks whether the point is within 
 * the rectangle centered at (0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle 
 * and (6, 4) is outside the rectangle, as shown in Figure 3.7b. 
 * (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and 
 * its vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to cover all cases.) 
 * Here are two sample runs:
 * 
 * @author Muchi 12/24/2021
 *
 */
public class Point {

	
	public static void main(String[] args) {
		// Create scanner
				Scanner input = new Scanner(System.in);
				
				//Prompt user for coordinates
				System.out.println("Enter x-coordinate: ");
				double x = input.nextDouble();
				
				System.out.println("Enter y-coordinate: ");
				double y = input.nextDouble();
				
				//System.out.println("Point entered is: (" + x + "," + y +")");
				
				//determine if distance of point is within rectangle
				double xNew = Math.sqrt(Math.pow(x, 2));
				double yNew = Math.sqrt(Math.pow(y, 2));
				
				if (xNew <= 5.0 && yNew <= 2.5)
					System.out.println("Point ("+x+","+y+") is inside the rectangle");
				else
					System.out.println("Point ("+x+","+y+") is outside the rectangle");

	}

}

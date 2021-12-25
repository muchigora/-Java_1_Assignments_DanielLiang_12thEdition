/**
 * 
 */
package math.geometry.circle;

import java.util.Scanner;

/**
 * Chapter 3 Exercise 22 Geometry: Point in a Circle?
 * Write a program that prompts the user to enter a point (x, y) and checks whether the point is within 
 * the circle centered at (0, 0) with radius 10. 
 * For example, (4, 5) is inside the circle and (9, 9) is outside the circle, as shown in Figure 3.7a.
 * (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10. 
 * The formula for computing the distance is sqrt((x2 - x1)^2 + (y2 - y1)^2). 
 * Test your program to cover all cases.) Two sample runs are shown below(see attached image of question)
 * 
 * @author Muchi this 19th Day of December 2021
 *
 */
public class PointInACircle {
	
	public static void main(String[] args) {
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user for coordinates
		System.out.println("Enter x-coordinate: ");
		int x = input.nextInt();
		System.out.println("Enter y-coordinate: ");
		int y = input.nextInt();
		System.out.println("Point entered is: (" + x + "," + y +")");
		
		//Distance from center of the circle
		double distance = Math.sqrt(Math.pow((x-0), 2) + Math.pow((y-0), 2));
		System.out.println("Distance from center is: " + distance);
		
		//determine if distance point is within circle
		if(distance <= 10)
			System.out.println("Point (" + x + "," + y +") is inside the circle ");
		else
			System.out.println("Point (" + x + "," + y +") is outside the circle ");

	}

}

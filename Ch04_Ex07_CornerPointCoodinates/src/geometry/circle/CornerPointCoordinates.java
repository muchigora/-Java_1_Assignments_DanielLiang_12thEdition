/**
 * 
 */
package geometry.circle;

import java.util.Scanner;

/**
 * Chapter 4 Exercise 7: Corner point coordinates
 * Suppose a pentagon is centered at (0, 0) with one point at the 0 o’clock position, as shown in 
 * Figure 4.4c. Write a program that prompts the user to enter the radius of the bounding circle of 
 * a pentagon and displays the coordinates of the five corner points on the pentagon from p1 to p5 
 * in this order. 
 * Use console format to display two digits after the decimal point. 
 * 
 * @author Muchi Jan 3, 2022
 *
 */
public class CornerPointCoordinates {

	
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt User to enter radius of the pentagon
		System.out.println("Enter radius of your Pentagon: ");
		double r = input.nextDouble();
		
		//Determine length of each side
		double side = 2 * r * Math.sin(Math.PI/5);
		
		
		//Determine each point
		//Point One
		double x1 = 0;
		System.out.println("P2: ("+x1+","+r+")");

	}

}

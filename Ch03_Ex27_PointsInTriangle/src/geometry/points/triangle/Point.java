/**
 * 
 */
package geometry.points.triangle;

import java.util.Scanner;

/**
 *Chapter 3 Exercise 27: Geometry: points in triangle?
 *Suppose a right triangle is placed in a plane as shown below(see attached image of the question). 
 *The right-angle point is placed at (0, 0), and the other two points  are placed at (200, 0) 
 *and (0, 100). Write a program that prompts the user to enter a point with x- and y-coordinates 
 *and determines whether the point is inside the triangle. Here are the sample runs
 *
 * @author Muchi Dec 25th, 2021
 *
 */
public class Point {

	
	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt for x and y coordinates
		System.out.println("Enter x-coordinate: ");
		double x = input.nextDouble();
		
		System.out.println("Enter y-coordinate: ");
		double y = input.nextDouble();
		
		//System.out.println("Point ("+x+","+y+")");
		
		//determine points inside the triangle
		if(y > (-0.5*x + 100)) 
			System.out.println("Point ("+x+","+y+") in outside the Triangle");
		else
			System.out.println("Point ("+x+","+y+") in inside the Triangle");
		

	}

}

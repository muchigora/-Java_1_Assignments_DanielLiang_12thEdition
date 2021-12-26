/**
 * 
 */
package geometry;

import java.util.Scanner;

/**
 * Ch3 Ex26 Geometry: intersecting point
 * Two points on line 1 are given as (x1, y1) and x2, y2) and on line 2 as (x3, y3) and (x4, y4), 
 * as shown in Figure 3.8a and b. 
 * The intersecting point of the two lines can be found by solving the following linear equations
 * (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 * (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 * This linear equation can be solved using Cramer’s rule (see Programming Exercise  3.3). 
 * If the equation has no solutions, the two lines are parallel (see M03_LIAN9966_12_SE_C03.indd 115 28/09/19 3:54 PM Figure 3.8c). 
 * Write a program that prompts the user to enter four points and displays the intersecting point. Here are sample run
 * 
 * 
 * @author Muchi Dec 25th, 2021
 *
 */
public class IntersectingPoints {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt user to enter the points for the 4 lines
		//line 1
		System.out.println("Enter coordinates for line 1: ");
		System.out.println("Point 1 x: ");
		double x1 = input.nextDouble();
		System.out.println("Point 1 y: ");
		double y1 = input.nextDouble();
		System.out.println("Line 1, Point 1 ("+x1+","+y1+")");
		System.out.println("Point 2 x: ");
		double x2 = input.nextDouble();
		System.out.println("Point 2 x: ");
		double y2 = input.nextDouble();
		System.out.println("Line 1, Point 2 ("+x2+","+y2+")");
		
		//line2
		System.out.println("Enter coordinates for line 2: ");
		System.out.println("Point 1 x: ");
		double x3 = input.nextDouble();
		System.out.println("Point 1 y: ");
		double y3 = input.nextDouble();
		System.out.println("Line 2, Point 1 ("+x3+","+y3+")");
		System.out.println("Point 2 x: ");
		double x4 = input.nextDouble();
		System.out.println("Point 2 x: ");
		double y4 = input.nextDouble();
		System.out.println("Line 2, Point 2 ("+x4+","+y4+")");
		
		//
		
		
		

	}

}

/**
 * 
 */
package geometry.position;

import java.util.Scanner;

/**
 * Ch03 Ex32 Geometry: point position
 * Given a directed line from point p0(x0, y0) to p1(x1,y1), you can use the following condition to 
 * decide whether a point p2(x2, y2) is on the left of the line, on the right, or on the same line 
 * (see Figure 3.11 in attached image of the question):
 * 
 * Write a program that prompts the user to enter the three points for p0, p1, and p2
 * and displays whether p2 is on the left of the line from p0 to p1, to the right, or on 
 * the same line. Here are some sample runs
 * 
 * @author Muchi compiled this 27th Day of December in 2021
 */
public class PositionPoint {

	
	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		//VARIABLES - Prompt user for point coordinates
		//POINT 0
		System.out.println("Enter Point-0 coordinates");
		System.out.println("p0: x-coordinate: ");
		double x0 = input.nextDouble();
		System.out.println("p0: y-coordinate: ");
		double y0 = input.nextDouble();
		System.out.println("p0 ("+x0+","+y0+")");
		
		//POINT 1
		System.out.println("Enter Point-0 coordinates");
		System.out.println("p1: x-coordinate: ");
		double x1 = input.nextDouble();
		System.out.println("p0: y-coordinate: ");
		double y1 = input.nextDouble();
		System.out.println("p0 ("+x1+","+y1+")");
		
		//POINT 2
		System.out.println("Enter Point-2 coordinates");
		System.out.println("p2: x-coordinate: ");
		double x2 = input.nextDouble();
		System.out.println("p2: y-coordinate: ");
		double y2 = input.nextDouble();
		System.out.println("p2 ("+x2+","+y2+")");
		
		//Test Condition
		double testCondition = (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
		
		//determine the position of p
		if(testCondition>0)
			System.out.println("p2 is on the left side of the line");
		else if(testCondition==0)
			System.out.println("p2 is on the same line");
		else if (testCondition<0)
			System.out.println("p2 is on the right side of the line");
		else
			System.out.println("Invalid");

	}

}

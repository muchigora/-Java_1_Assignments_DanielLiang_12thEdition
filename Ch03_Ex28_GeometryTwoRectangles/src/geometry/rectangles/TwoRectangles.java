/**
 * 
 */
package geometry.rectangles;

import java.util.Scanner;

/**
 * Chapter 3 Excercise 28: Geometry: two rectangle 
 * Write a program that prompts the user to enter the center x-, y-coordinates, 
 * width, and height of two rectangles and determines whether the second rectangle is inside 
 * the first or overlaps with the first, as shown in Figure 3.9. 
 * Test your program to cover all cases
 * 
 * @author Muchi Dec 26th, 2021
 *
 */
public class TwoRectangles {

	
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt User to enter data of the two rectangles
		//Rectangle 1
		System.out.println("Rectangle One Data: ");
		System.out.println("Center x-coordinate: ");
		double xRectangleOne = input.nextDouble();
		System.out.println("Center y-coordinate: ");
		double yRectangleOne = input.nextDouble();
		System.out.println("width: ");
		double widthRectangleOne = input.nextDouble();
		System.out.println("height: ");
		double heightRectangleOne = input.nextDouble();
		
		//Rectangle 2
		System.out.println("Rectangle Two Data: ");
		System.out.println("Center x-coordinate: ");
		double xRectangleTwo = input.nextDouble();
		System.out.println("Center y-coordinate: ");
		double yRectangleTwo = input.nextDouble();
		System.out.println("width: ");
		double widthRectangleTwo = input.nextDouble();
		System.out.println("height: ");
		double heightRectangleTwo = input.nextDouble();
		
		//Determine whether the rectangles overlap or not
		if((xRectangleOne + widthRectangleOne / 2) > (xRectangleTwo + widthRectangleTwo / 2) || (xRectangleOne + widthRectangleOne / 2) > (yRectangleTwo + heightRectangleTwo / 2))
			System.out.println("Rectangle Two is inside rectangle One");
		else
			System.out.println("Rectangle Two Overlaps rectangle One");

	}

}

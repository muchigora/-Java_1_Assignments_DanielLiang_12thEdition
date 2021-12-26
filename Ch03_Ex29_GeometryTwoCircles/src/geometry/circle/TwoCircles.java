/**
 * 
 */
package geometry.circle;

import java.util.Scanner;

/**
 * Ch03 Ex 29: Geometry: two circles
 * Write a program that prompts the user to enter the center coordinates and radii of two circles 
 * and determines whether the second circle is inside the first or overlaps with the first, as shown 
 * in Figure 3.10. (Hint: circle2 is inside circle1 if the distance between the two 
 * centers <= r1 − r2 and circle2 overlaps circle1 if the distance between the two centers 
 * >=r1 + r2. 
 * Test your program to cover all cases. (See question image attached)
 * 
 * @author Muchi on  Dec 26th, 2021
 *
 */
public class TwoCircles {


	public static void main(String[] args) {
		// Create Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Prompt User For Data
		//Circle One
		System.out.println("Circle One Data: ");
		System.out.println("Enter Circle One center x-cooedinate: ");
		double xCircleOne = scanner.nextDouble();
		System.out.println("Enter Circle One center y-cooedinate: ");
		double yCircleOne = scanner.nextDouble();
		System.out.println("Enter Circle One center radius: ");
		double radiusCircleOne = scanner.nextDouble();
		
		//Circle Two
		System.out.println("Circle Two Data: ");
		System.out.println("Enter Circle Two center x-cooedinate: ");
		double xCircleTwo = scanner.nextDouble();
		System.out.println("Enter Circle Two center y-cooedinate: ");
		double yCircleTwo = scanner.nextDouble();
		System.out.println("Enter Circle Two center radius: ");
		double radiusCircleTwo = scanner.nextDouble();
		
		//Determine whether Circle Two in inside or Overlaps Circle One
		double distBetweenCenters = Math.sqrt(Math.pow((xCircleOne-xCircleTwo), 2) + Math.pow((yCircleOne-yCircleTwo), 2));
		
		if(distBetweenCenters <= (radiusCircleOne - radiusCircleTwo))
			System.out.println("Circle two inside circle one");
		else if(distBetweenCenters <= (radiusCircleOne + radiusCircleTwo))
			System.out.println("Circle two overlaps circle one");
		else
			System.out.println("Neither overlaps nor inside");

	}

}

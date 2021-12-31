/**
 * 
 */
package geometry.area;

import java.util.Scanner;

/**
 * Ch3 Exercise 5 Geometry: area of a regular polygon
 * A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have
 * the same degree (i.e., the polygon is both equilateral and equiangular). 
 * The formula for computing the area of a regular polygon is
 * 			Area = (n * s^2)/(4 * tan(PI/n)
 * Here, s is the length of a side. 
 * Write a program that prompts the user to enter the number of sides and their length of a regular 
 * polygon and displays its area.
 * 
 * @author Muchi Compiled Dec 31st, 2021
 *
 */
public class RegularPolygon {

	
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt User for number of sides and length of sides
		System.out.println("Enter number of sides of the polygon: ");
		double n = input.nextDouble();
		System.out.println("Enter the length of the sides: ");
		double s = input.nextDouble();
		
		//Compute the area of the regular polygon
		double area = (n * Math.pow(s, 2))/(4 * Math.tan(Math.PI/n));
		
		//Display the area of the polygon
		System.out.println("Area of a Regular Polygon is: " + area + " Square Units");

	}

}

/**
 * 
 */
package geometry.area;

import java.util.Scanner;

/**
 * Ch4 Ex4 Geometry: area of a hexagon
 * The area of a hexagon can be computed using the following formula in attached question (s is the length of a side):
 * Area = 6 * s^2/(4 * tan(pi/6)
Write a program that prompts the user to enter the side of a hexagon and displays 
its area. Here is a sample run: (see attached question)

 * @author Muchi Dec 12, 2031
 *
 */
public class Hexagon {

	public static void main(String[] args) {
		//Create scanner
		Scanner input = new Scanner(System.in);	
		
		//Prompt user for side
		System.out.println("Enter length of the side of the Hexagon: ");
		double s = input.nextDouble();		
		
		//Compute the area of the hexagon
		double area = (6 * Math.pow(s, 2))/(4 * Math.tan(Math.PI/6));
		
		//Display the area of the hexagon
		System.out.println("Area of a Pentagon with side"+ s + " is " + Math.round(area *100) / 100.0 + " Square Units");

	}

}

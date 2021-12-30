/**
 * 
 */
package geometry.area;

import java.util.Scanner;

/**
 * Chapter 4 Exercise 1: Geometry: area of a pentagon
 * Write a program that prompts the user to enter the length from the center of a pentagon to a 
 * vertex and computes the area of the  pentagon, as shown in the following figure (see question image)

 * @author Muchi compiled on Dec 29th of 2021
 *
 */
public class Ch03Ex01_Pentagon {

	
	public static void main(String[] args) {
		// Create the scanner
		Scanner alaye = new Scanner(System.in);
		
		// Prompt user of radius / area from center of pentagon to vertex
		System.out.println("Enter length of radius");
		double r = alaye.nextDouble();
		
		//compute length of a side
		double s = 2*r*Math.sin(Math.PI/5);
		
		//compute the area 
		double area = Math.round(5*Math.pow(s, 2))/(4*Math.tan(Math.PI/5));
		
		
		//Display result
		System.out.println(Math.round(area * 100) /  100.0);
		
		

	}

}

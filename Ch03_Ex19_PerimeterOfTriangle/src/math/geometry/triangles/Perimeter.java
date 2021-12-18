/**
 * 
 */
package math.geometry.triangles;

import java.util.Scanner;

/**
 * Ch03 Excercise 19 Compute the perimeter of a triangle
 * Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. 
 * Otherwise, display that the input is invalid. 
 * The input is valid if the sum of every pair of two edges is greater than the remaining edge.
 * @author Muchi
 *
 */
public class Perimeter {

	public static void main(String[] args) {
	// Create Scanner
	Scanner input = new Scanner(System.in);
	
	//Prompt for dimensions of each of the sides
	System.out.println("Enter length of Side One: ");
	double sideOne = input.nextDouble();
	
	
	System.out.println("Enter length of Side Two: ");
	double sideTwo = input.nextDouble();
	
	
	System.out.println("Enter length of Side Three: ");
	double sideThree = input.nextDouble();
	
	
	//Display dimensions of each side
	System.out.println("Side One: " + sideOne);
	System.out.println("Side Two: " + sideTwo);
	System.out.println("Side Three: " + sideThree);
	
	//Determine if input is valid and compute perimeter
	if(sideOne + sideTwo > sideThree) {
		double trianglePerimeter = sideOne + sideTwo + sideThree;
		System.out.println("Perimeter = " + trianglePerimeter);
	}
	else if(sideOne + sideThree > sideTwo) {
		double trianglePerimeter = sideOne + sideTwo + sideThree;
		System.out.println("Perimeter = " + trianglePerimeter);
	}
	else if(sideTwo + sideThree > sideOne) {
		double trianglePerimeter = sideOne + sideTwo + sideThree;
		System.out.println("Perimeter = " + trianglePerimeter);
	}
	else
		System.out.println("Invalid Input \n Sum of two sides should always be greater than the remaining side");
	

	}

}

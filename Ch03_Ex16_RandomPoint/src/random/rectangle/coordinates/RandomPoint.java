package random.rectangle.coordinates;

import java.util.Scanner;

/**
 * Ch03_Ex16: Random point
 * Write a program that displays a random coordinate in a rectangle. 
 * The rectangle is centered at (0, 0) with width 100 and height 200.
 * 
 * @author Muchi 14th Day of Dec, 2021
 *
 */

public class RandomPoint {

	public static void main(String[] args) {
		// declare variables
		int width = 100;
		int length = 200;
		int x;
		
		//Applying pythagoras theorem
		//determine the hypotenuse
		int hypotenuse = (int)Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
		//System.out.println(hypotenuse);
		
		//create Scanner for user prompts
		Scanner input = new Scanner(System.in);
		
		//Get the x-coordinate to determine the y-coordinate
		System.out.println("Enter the x-coordinate to determine the y coordinate: ");
		int xCoordinate = input.nextInt();
		System.out.println("if your x-coordinate is " + xCoordinate);
		//Determine the y - coordinate
		int yCoordinate = (int)Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(xCoordinate, 2));
		System.out.println("the your y-coordinate is: " + yCoordinate);
		
		System.out.println("===============================================================");
				
		//Get the y coordinate to determine the x-coordinate
		System.out.println("Enter your y-coordinate to determine your x-doordinate: ");
		yCoordinate = input.nextInt();
		System.out.println("if your y-coordinate is: " + yCoordinate);
		xCoordinate = (int)Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(yCoordinate, 2));
		System.out.println(" the your x-coordinate is: " + xCoordinate);
		
		
	}

}

import java.util.Scanner;

/**
 * 
 */

/**
 * Chapter 2 Exercise 14: Health Application: Body Mass Index
 * This program calculates BMI. The computation is carried out in metric units (kgs and m)
 * the data for computation will be given by the user in imperial units (pounds and inches)
 * 
 * @author Muchi compiled on Jun 30th of 2021
 *
 */
public class BMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variables
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Weight in Pounts");
		double weight = input.nextDouble();
		
		System.out.println("Enter height in inches");
		double inches = input.nextDouble();
		
		
		
		//Convert from imperial to metrics
		double kilograms = weight * 0.45359237;
		System.out.println("Your weight is " + kilograms + "kgs");
		
		double meters = inches * 0.0254;
		System.out.println("Your height is " + meters + "meters");
		
		//Compute BMI
		double BMI = kilograms / Math.pow(meters, 2);
		
		//Display BMI
		System.out.println("=========================================================");
		System.out.println("Your BMI is " + BMI + ".");
		System.out.println("=========================================================");

	}
	

}

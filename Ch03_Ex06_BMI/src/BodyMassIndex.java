import java.util.Scanner;

/**
 * Health Application: BMI 
 * Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, 
 * feet, and inches. For example, if a person is 5 feet and 10 inches, you will 
 * enter 5 for feet and 10 for inches.
 * 
 */

/**
 * @author Muchi compiled on July 9th of 2021
 *
 */
public class BodyMassIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get weight and height values from user
		System.out.println("Enter your weight in pound");
		double pounds = input.nextDouble();
		System.out.println("Weight in pounds is " + pounds + " Oz");
		
		System.out.println("Enter your heigh in feet and inches as follows: ");
		System.out.println("feet: ");
		double feet = input.nextDouble();
		System.out.println("inches: ");
		double inches = input.nextDouble();
		System.out.println("your height is " + feet + "' " + inches + "\" ");
		
		//height in inches
		final double FEET_TO_INCHES = 12.0;
		double feetToInches = feet * FEET_TO_INCHES;
		double totalInches = feetToInches + inches;

		//convert imperial to metrics
		/* * conversion rates: 
		 * one pound is 0.45359237 kilograms, 
		 * and one inch is 0.0254 meters.
		 * */
		
		final double POUND_TO_KILOGRAM = 0.45359237;
		final double INCHES_TO_METERS = 0.0254;
		
		double kilograms = pounds * POUND_TO_KILOGRAM;
		double meters = totalInches * INCHES_TO_METERS;
		
		
		//compute BMI
		/* * formula: 
		 * BMI = weight (kgs) / square of height (meters)		 
		 * */
		
		double BodyMassIndex = kilograms / Math.pow(meters, 2);
		System.out.println("Your Body Mass Index is " + BodyMassIndex +".");
		
		//Get age of user
		System.out.println("Enter your age");
		int age = input.nextInt();
		
		//Interpret the BMI
		if (age > 20 && BodyMassIndex < 18.5) {
			System.out.println("You are under-weight");
		}
		else if (age > 20 && BodyMassIndex < 25) {
			System.out.println("Your weight is normal");			
		}
		else if (age > 20 && BodyMassIndex < 30) {
			System.out.println("You are over-weight");
		}
		else if (age > 20 && BodyMassIndex >= 30) {
			System.out.println("You are obese");
		}
		else {
			System.out.println("You should be young and healthy!!!");
		}
		

	}

}

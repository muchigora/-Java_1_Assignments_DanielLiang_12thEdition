/**
 * 
 */
package business.cost;

import java.util.Scanner;

/**
 * Chapter 3 Excercise 18: Cost of shipping
 * A shipping company uses the following function to calculate the cost (in dollars) of shipping based on 
 * the weight of the package (in pounds). 
 * $3.5, if weight ranges  0 - 1
 * $5.5, if weight ranges 1 - 3
 * $8.5, if weight ranges 3 -10
 * $10.5, if weight ranges 10 - 20
 * Write a program that prompts the user to enter the weight of the package and displays the shipping cost. 
 * If the weight is negative or zero, display a message “Invalid input.” If the weight is greater than 20, 
 * display a message “The package cannot be shipped.”
 * 
 * @author Muchi Dec 12th, 2021
 *
 */
public class CostOfShipping {
	
	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input
		System.out.println("Enter the weight of your package: ");
		double packageWeight = input.nextDouble();
		
		//Determine Shipping cost based on weight supplied by user
		if(packageWeight > 0 && packageWeight <= 1) {
			double shippingCost = 3.5 * packageWeight;
			System.out.println("Total Shipping Cost: " + shippingCost);			
		}
		else if(packageWeight > 1 && packageWeight <= 3){
			double shippingCost = 5.5 * packageWeight;
			System.out.println("Total Shipping Cost: " + shippingCost);
		}
		else if(packageWeight > 3 && packageWeight <= 10){
			double shippingCost = 8.5 * packageWeight;
			System.out.println("Total Shipping Cost: " + shippingCost);
		}
		else if(packageWeight > 10 && packageWeight <= 20){
			double shippingCost = 10.5 * packageWeight;
			System.out.println("Total Shipping Cost: " + shippingCost);
		}
		else if(packageWeight > 20)
			System.out.println("The package cannot be shipped.");
		else
			System.out.println("Invalid Input");
		

	}

}

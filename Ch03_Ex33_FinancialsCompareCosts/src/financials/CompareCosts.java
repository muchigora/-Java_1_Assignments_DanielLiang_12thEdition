/**
 * 
 */
package financials;

import java.util.Scanner;

/**
 * Chapter 3 Exercise 33: Financial: compare costs
 * Suppose you shop for rice in two different packages. You would like to write a program to 
 * compare the cost. The program prompts the user to enter the weight and price of each package 
 * and displays the one with the better price. Here is a sample run (see attached image of the question):
 * 
 * @author Muchi compiled this 27th Day of December in 2021
 *
 */
public class CompareCosts {

	
	public static void main(String[] args) {
		//create scanner
		Scanner scanner = new Scanner(System.in);
		
		//Prompt user for prices and weights of different packages
		System.out.println("Enter prices and weights of different packages:");
		
		//Package One
		System.out.println("Enter package One weight");
		double weightOne = scanner.nextDouble();
		System.out.println("Enter package One price");
		double  priceOne = scanner.nextDouble();
		
		//Package One
		System.out.println("Enter package Two weight");
		double weightTwo  = scanner.nextDouble();
		System.out.println("Enter package Two price");
		double priceTwo = scanner.nextDouble();
		
		if(weightOne / priceOne < weightTwo / priceTwo)
			System.out.println("Package One price is better than Package Two price");
		else
			System.out.println("Package Two price is better than Package One price");
		

	}

}

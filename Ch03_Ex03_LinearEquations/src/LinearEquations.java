import java.util.Scanner;

/**
 * 
 */

/**
 * A linear equation can be solved using Cramer’s rule given in Programming 
 * Exercise  * 1.13. Write a program that prompts the user to enter a, b, c, d, e, 
 * and f and displays the result. If ad−bc is 0, report that equation has no solution.
 * @author Muchi compiled on July 7th of 2021
 *
 */
public class LinearEquations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Prompt user to enter values for Variable
		System.out.println("Enter value of a");
		double a = input.nextDouble();
		System.out.println("Enter value of b");
		double b = input.nextDouble();
		System.out.println("Enter value of c");
		double c = input.nextDouble();
		System.out.println("Enter value of d");
		double d = input.nextDouble();
		System.out.println("Enter value of e");
		double e = input.nextDouble();
		System.out.println("Enter value of f");
		double f = input.nextDouble();
		
		//
		System.out.println("Given the following Equations: ");
		System.out.println(a + "x + " + b + "y " + " = " + e);
		System.out.println(c + "x + " + d + "y " + " = " + f);
		System.out.println("Determine the values of x and y");
		
		
		//Evaluations:
		double solutionCheck = (a * d) - (b * c);
		double x = (e*d - b*f)/(a*d - b*c);
		double y = (a*f - e*c)/(a*d - b*c);
		
		if (solutionCheck == 0) {
			System.out.println("Equation has no solution");
		}
		else {
			System.out.println(x);
			System.out.println(y);
		}
				
				

	}

}

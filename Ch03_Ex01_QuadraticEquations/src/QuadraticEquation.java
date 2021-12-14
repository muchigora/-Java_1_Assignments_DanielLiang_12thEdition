import java.util.Scanner;

/**
 * 
 */

/**
 * Chapter 3 Exercise 1 - Algebra: Solve Quadratic Equations
 * 
 * @author Muchi
 *
 */
public class QuadraticEquation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		
		//Declare Variable and Prompt User to enter values
		System.out.println("Enter Value of a");
		double a = input.nextDouble();
		
		System.out.println("Enter Value of b");
		double b = input.nextDouble();
		
		System.out.println("Enter Value of c");
		double c = input.nextDouble();
		
		System.out.println("Solve the following equation: ");
		System.out.println(a +"x^2" + " + " + b + "x" + " + " + c);
		
		//Compute the discriminant of the equation
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		//System.out.println("discriminant = "  + discriminant);
		
		//Compute Roots of the equation
		double r1 = (-b + Math.sqrt(discriminant)) / 2 * a;
		double r2 = (-b - Math.sqrt(discriminant)) / 2 * a;
		
		
		//Determine the solution(s) for the equation
		if (discriminant > 0) {
			System.out.println("The equation has two roots : " + r1 +  " and " + r2);
			
		}
		else if (discriminant == 0) {
			System.out.println(" The equation has one root: " + r1);
			
		}
		
		else 
			System.out.println("Equation has no real roots");
			
		}

	

}

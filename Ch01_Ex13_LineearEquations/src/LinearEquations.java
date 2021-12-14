/**
 * 
 */

/**Chapter 1 Exercise 13: Linear Equations
 * This program will solve Linear Equations using the crammer method
 * @author Muchi compiled Jun 27th of 2021
 *
 */
public class LinearEquations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables
		double x;
		double y;
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 0.55;
		double e = 44.5;
		double f = 5.9;
		
		
		
		//Ealuating x & y
		x = (e*d - b*f)/(a*d - b*c);
		y = (a*f - e*c)/(a*d - b*c);
		
		System.out.println(x);
		System.out.println(y);
		
		
		

	}

}

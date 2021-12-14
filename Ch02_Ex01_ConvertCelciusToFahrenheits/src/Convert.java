import java.util.Scanner;

/**
 * 
 */

/**Chaoter 2 Excercise 1: Converting Celcius to Fahrenheits
 * This program converts Degrees Celcius to Fahrenheits
 * @author Muchi compiled on Jun 28th of 2021
 *
 */
public class Convert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		Scanner input = new Scanner (System.in);
		double celcius = input.nextDouble();
		double fahrenheits = (9.0/5) * celcius + 32;
		System.out.println(fahrenheits);
	}

}

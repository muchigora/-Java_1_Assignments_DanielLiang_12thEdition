import java.util.Scanner;

/**
 * 
 */

/**This program determines if a year is a leap year
 * @author Muchi on Aug 16th of 2021
 *
 */
public class LeapYearCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Request Year from User
		System.out.println("Enter four digit year: ");
		int year = input.nextInt();
		
		//Determine if Leap Year or not
		boolean yearCheck = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
		
		//Display
		System.out.println("Is the year " + year + " leap year? " + yearCheck);

	}

}

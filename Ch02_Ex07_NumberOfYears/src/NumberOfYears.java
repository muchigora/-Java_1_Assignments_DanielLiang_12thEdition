import java.util.Scanner;

/**
 * 
 */

/**Ch02 Ex07: Number of Years
 * This program calculates the number of years and days made up of seconds minutes
 * 
 * @author Muchi
 *
 */
public class NumberOfYears {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variables
		int minutes;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes you wish to convert to years: ");
		minutes = input.nextInt();
		
		//Convert Minutes to Days
		int hour = minutes / 60;
		int day = hour / 24;
		
		//Convert days to years
		int year = day / 365;
		int days = day % 365;
		
		//Display Years
		System.out.println("There are " + year + " years and " + days + " days in " + minutes + " minutes.");
		

	}

}

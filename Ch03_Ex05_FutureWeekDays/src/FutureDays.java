import java.util.Scanner;

/**
 * 
 */

/**
 * *Chapter 3 Exercise 5 : Find future dates 
 * Write a program that prompts the user to enter an integer for today’s day 
 * of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also 
 * prompt the user to enter the number of days after today for a future day 
 * and display the future day of the week. 
 * @author Muchi compiled on Jul 13th of 2021
 *
 */
public class FutureDays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
	
		// Prompt User for Day of the week
		System.out.println("Enter today's day number : ");
		int day = input.nextInt();
		
		//Determine Day of the week
		if (day == 0) {
			System.out.println("Day " + day + " of the week is Sunday");
		}
		else if (day == 1) {
			System.out.println("Day " + day + " of the week is Monday");
		}
		else if (day == 2) {
			System.out.println("Day " + day + " of the week is Tuesday");
		}
		else if (day == 3) {
			System.out.println("Day " + day + " of the week is Wednesday");
		}
		else if (day == 4) {
			System.out.println("Day " + day + " of the week is Thursday");
		}
		else if (day == 5) {
			System.out.println("Day " + day + " of the week is Friday");
		}
		else if (day == 6) {
			System.out.println("Day " + day + " of the week is Saturday");
		}
		else {
			System.out.println("Day are represented by a number between 0 and 6");
		}	
		
		
		//Prompt user for number of days in the future, e.g., 35, for 35 days from today
		System.out.println("Enter number of days elapsed: ");
		int elapsedDays = input.nextInt();
		
		
		
		if (elapsedDays > 6) {
			/*elapsedDays = (day + elapsedDays) / 7;*/
			elapsedDays = (day + elapsedDays) % 7;
			System.out.println(elapsedDays);
			
			
			
			//Determine future Day of the week
			if (elapsedDays == 0) {
				System.out.println( (7 + elapsedDays) + " days from today will be a Sunday");
			}
			else if (elapsedDays == 1) {
				System.out.println( (7 + elapsedDays) + " days from today will be a Monday");
			}
			else if (elapsedDays == 2) {
				System.out.println( (7 + elapsedDays) + " days from today will be a Tuesday");
			}
			else if (elapsedDays == 3) {
				System.out.println( (7 + elapsedDays) + " days from today will be a Wednesday");
			}
			else if (elapsedDays == 4) {
				System.out.println( (7 + elapsedDays) + " days from today will be a Thursday");
			}
			else if (elapsedDays == 5) {
				System.out.println( (7 + elapsedDays) + " days from today will be a Friday");
			}
			else if (elapsedDays == 6) {
				System.out.println( (7 + elapsedDays) + " days from today will be a Saturday");
			}
			else {
				System.out.println("Day are represented by a number between 0 and 6");
			}
			
			
			
		}
		
		
		
		

	}

}

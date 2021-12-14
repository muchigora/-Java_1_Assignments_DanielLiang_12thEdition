/**
 * 
 */

/****Chapter 3 Excercise 4 : Random month 
 * Write a program that randomly generates an integer between 1 and 12 and displays 
 * the English month names January, February, . . . , December for the numbers 
 * 1, 2, . . . , 12, accordingly.
 * @author Muchi
 *
 */
public class RandomMonthSelection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Generate Random Numbers 1 - 12
		int x = (int)((Math.random() * 12) + 1);
		
			
		//Assign Each number to its Month
		if (x == 1) {
			System.out.print("January");
		} 
		else if (x == 2) {
			System.out.print("February");
		}
		else if (x == 3) {
			System.out.print("March");			
			}
		else if (x == 4) {
			System.out.print("April");
		}
		else if (x == 5) {
			System.out.print("May");
		}
		else if (x == 6) {
			System.out.print("June");
		}
		else if (x == 7) {
			System.out.print("July");
		}
		else if (x == 8) {
			System.out.print("Augus");
		}
		else if (x == 9) {
			System.out.print("September");
		}
		else if (x == 10) {
			System.out.print("October");
		}
		else if (x == 11) {
			System.out.print("November");
		}
		else  {
			System.out.print("December");}	
		
		//Display Random Number Generated and its month
		System.out.print(" is month number " + x + " in the year");
		
		
	}

}

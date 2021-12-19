/**
 * 
 */
package science.calendar;

import java.util.Scanner;

/**Ch03 Ex21 Science: day of the week
 * See Supplied image for the question
 * 
 * Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week. 
 * The formula is (see supplied image of the question)
 * where:
 * h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, and 6: Friday).
 * q is the day of the month. 
 * m is the month (3: March, 4: April, ..., 12: December). January and February are counted as months 13 and 14 of the previous year.
 * j is year 100 
 * k is the year of the century (i.e., year % 100). 
 * 
 * Note all divisions in this exercise perform an integer division. Write a program that prompts 
 * the user to enter a year, month, and day of the month, and displays the name of the day of the week. 
 * Here are some sample runs:
 * (see supplied image of the question) 
 * 
 * @author Muchi Dec 12, 2021
 *
 */
public class WeekDay {
	
	public static void main(String[] args) {
		// create Scanner
		Scanner input = new Scanner(System.in);
		
		// Declare variables and prompt for user input on each variable
		int j=0;
		int k=0;
				
		//Prompt for year
		System.out.println("Enter year, e.g., 2015");
		int year = input.nextInt();
				
		//Prompt for month
		System.out.println("Enter month, use numbers 1 - 12");
		int m = input.nextInt();
		if (m==1) {
			m = m +12;
			year = year-1;
			j = year/100;
			k = year%100;
			System.out.println(year);
		}else if(m==2) {
			m = m +12;
			year = year-1;
			j = year/100;
			k = year%100;
			System.out.println(year);
		}else {
			j = year / 100;
			k = year % 100;
		}
		
		//Prompt for day of the week
		System.out.println("Enter day of the month, from 1 - 31");
		int q = input.nextInt();
		if(q <= 0 || q > 31)
			System.out.println("Invalid Input! \nEnter number from 1 - 31");
		
		//Determine day of the week		
		int h = (q + ((26*(m+1))/10) + k + (k/4) + (j/4) + (5*j)) % 7;
		if(h == 0)
			System.out.println("Saturday");
		else if(h == 1)
			System.out.println("Sunday");
		else if(h == 2)
			System.out.println("Monday");
		else if(h == 3)
			System.out.println("Tuesday");
		else if(h == 4)
			System.out.println("Wednesday");
		else if(h == 5)
			System.out.println("Thursday");
		else if(h == 6)
			System.out.println("Friday");
		else
			System.out.println("Invalid input\nPlease enter a digit from 0 - 6");
		
	}

}

/**
 * 
 */
package operators.and.or.exclusive;

import java.util.Scanner;

/**
 *  Chapter 3 Excercise 26: Use the &&, ||, and ^ operators
 *  Write a program that prompts the user to enter an integer and determines whether it is divisible by 5 and 6, 
 *  whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run 
 *  of this program: (see image of the question attached)
 *  
 * @author Muchi Dec 25th, 2021
 *
 */
public class LogicalUperators {

	
	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user for integer
		System.out.println("Enter integer: ");
		int myNumber = input.nextInt();
		
		if(myNumber % 5 == 0 && myNumber % 6 == 0) {
			System.out.println(myNumber + " Divisible by both 5 & 6");
		}
		else if(myNumber % 5 == 0 || myNumber % 6 == 0) {
			System.out.println(myNumber + " Divisible by either 5 or 6");
		}
		else if(myNumber % 5 == 0 ^ myNumber % 6 == 0){
			System.out.println(myNumber + " Divisible either both 5 or 6 but not both");
		}
	}
}
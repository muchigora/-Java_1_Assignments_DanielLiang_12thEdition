package sort.integers.ascendingorder;

import java.util.Scanner;

/**Chapter 3 Ex 8: Sort three integers
 *  Write a program that prompts the user to enter three integers 
 *  and display the integers in non-decreasing order.
 * @author Muchi 10/25/2021
 *
 */

public class SortThreeIntegers {

	public static void main(String[] args) {
		//Create Scanner to prompt user to enter integers
		Scanner input = new Scanner(System.in);
		
		//Prompt User to Enter three Different Integers
		System.out.println("Enter first integer: ");
		int numOne = input.nextInt();
		
		System.out.println("Enter second integer: ");
		int numTwo = input.nextInt();
		
		System.out.println("Enter third integer: ");
		int numThree = input.nextInt();
		
		//Sort the integers
		//Determining the least number
		if(numOne < numTwo && numOne < numThree) {
			System.out.println("The least number is: " + numOne);
		}else if (numTwo < numOne && numTwo < numThree) {
			System.out.println("The least number is: " + numTwo);
		}else {
			System.out.println("The least number is: " + numThree);
		}
		
		
		//Determining the middle number
		if (numOne < numTwo && numOne > numThree) {
			System.out.println("The middle number is " + numOne);
		}else if(numOne < numTwo && numTwo < numThree) {
			System.out.println("The middle number is " + numTwo);			
		}else if (numOne > numTwo && numOne < numThree) {
			System.out.println("The middle number is " + numOne);
		}else if(numOne > numTwo && numTwo > numThree) {
			System.out.println("The middle number is " + numTwo);
		}else {
			System.out.println("The middle number is " + numThree);
		}
		
		
		//Determining the largest number
		if (numOne < numTwo && numTwo < numThree) {
			System.out.println("The largest number is " + numThree);			
		}else if(numOne < numTwo && numTwo > numThree) {
			System.out.println("The largest number is " + numTwo);
		}else if(numThree > numOne && numThree > numTwo) {
			System.out.println("The largest number is " + numThree);
		}
//		else if(numOne > numTwo && numOne > numThree) {
//			System.out.println("The largest number is " + numOne);
//		}
		else {
			System.out.println("The largest number is " + numOne);
		}
		
		
		
		
		//Display Result
//		System.out.println("The first Integer is" + numOne);
//		System.out.println("The first Integer is" + numTwo);
//		System.out.println("The first Integer is" + numThree);

	}

}

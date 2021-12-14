package decision.structures;

import java.util.Scanner;

public class If_Else {
	
	/***
	 * the code given below checks whether a given number is even or odd using
	 * if-else block. Execute the code by assigning different values to number 
	 * variable
	 * @param args
	 */

	public static void main(String[] args) {
		// Variable Declaration
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number you want to check: ");
		int myNumber = scanner.nextInt();
				
		
		//method
		if (myNumber % 2 == 0) {
			System.out.println(myNumber + " in an even number");
		}else {
			System.out.println(myNumber + " is an odd number");
		}

	}

}

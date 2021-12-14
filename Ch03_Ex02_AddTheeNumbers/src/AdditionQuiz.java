import java.util.Scanner;

/**
 * 
 */

/**
 * Chapter 3 Excercise 2 Game: add three numbers: Addition Quiz
 * The program in Listing 3.1, AdditionQuiz.java, generates two integers and prompts 
 * the user to enter the sum of these two integers. Revise the program to generate 
 * three single-digit integers and prompt the user to enter the sum of these three 
 * integers.
 * @author Muchi compiled July 7th of 2021
 *
 */
public class AdditionQuiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		// Declare and Initialize Three Variables
		int x = (int)(Math.random() * 10);
		int y = (int)(Math.random() * 10);
		int z = (int)(Math.random() * 10);
		
		//Addition
		System.out.println("What is " + x + " + " + y + " + " + z);
		int sum = x + y + z;
		
		//Prompt user for Answer
		Scanner input = new Scanner(System.in);
		System.out.println("Answer = ");
		int answer = input.nextInt();
		
		//Return Feedback to User
		if (answer == sum) {
			System.out.println("Magnificent!! Answer is Correct");
		}
		else {
			System.out.println("What A miss!!");
			System.out.println("The Answer is " + answer);
			
	
		}
		
		
		
	}

}

package quiz;

import java.util.Scanner;

/**
 * Chapter 3 Ex10 Addition Quiz
 * Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question. 
 * Revise the program to randomly generate an addition question with two integers 
 * less than 100
 * @author Muchi 11/26/2021
 *
 */
public class AdditionQuiz {

	public static void main(String[] args) {
		// Generate the two integers to add
		int intOne = (int)(Math.random()*100);
		int intTwo = (int)(Math.random()*100);
		
		//Quiz
		Scanner input = new Scanner(System.in);
		
		System.out.println("Question: " + intOne + " plus " + intTwo + " = ?");
		int answer = input.nextInt();
		
		int sumInt = intOne + intTwo;
		
		if (sumInt == answer) {
			System.out.println("Good Job!");
		}else {
			System.out.println("The answer is: " +(sumInt));
		}		
		
		
	}

}

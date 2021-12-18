package game;

import java.util.Scanner;
/**
 * Ch03 Excercise 17 Game: scissor, rock, paper
 * Write a program that plays the popular scissor– rock–paper game. (A scissor can cut a paper, 
 * a rock can knock a scissor, and a paper can wrap a rock.) The program randomly generates a number 
 * 0, 1, or 2 representing scissor, rock, and paper. The program prompts the user to enter a number 0, 
 * 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws. 
 * 
 * @author Muchi on this 12th Day of December, year 2021
 *
 */

public class RockScissorsAndPaper {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
				
		//Prompt user for choices
		System.out.println("Pick a choice between: \n 0 for Rock \n 1 for Scissors \n 2 for Paper");
		int humanChoice = input.nextInt();
		
		//Computer guess
		int computerGeneratedChoice = (int)(Math.random() * 3);
		System.out.println(computerGeneratedChoice);
		
		//Check who wins human or computer
		if(humanChoice == 0) {
			System.out.println("You chose Rock");
			if(computerGeneratedChoice == 0) 
				System.out.println("Computer picked Rock \n You DRAW!");			
			if(computerGeneratedChoice == 1)
				System.out.println("Computer picked Scissors \n You WIN! Rock crashes Scissors");
			if(computerGeneratedChoice ==2)
				System.out.println("Computer picked Paper \n You LOSE! Paper covers Rock");
		}
		else if(humanChoice == 1) {
			System.out.println("You chose Scissors");
			if(computerGeneratedChoice == 0) 
				System.out.println("Computer picked Rock \n You LOSE! Rock crashes Scissors");			
			if(computerGeneratedChoice == 1)
				System.out.println("Computer picked Scissors \n You DRAW! ");
			if(computerGeneratedChoice ==2)
				System.out.println("Computer picked Paper \n You WIN! Scissors cuts Paper");
		}
		else if(humanChoice == 2) {
			System.out.println("You chose Paper");
			if(computerGeneratedChoice == 0) 
				System.out.println("Computer picked Rock \n You WIN! Paper covers Rock");			
			if(computerGeneratedChoice == 1)
				System.out.println("Computer picked Scissors \n You LOSE! Scissors cuts Paper");
			if(computerGeneratedChoice ==2)
				System.out.println("Computer picked Paper \n You DRAW!");
		}
		else
			System.out.println("Pick a choice between: \\n 0 for Rock \\n 1 for Scissors \\n 2 for Paper");

		
	}

}

package games;

import java.util.Scanner;

/**
 * Ch03 Ex 14: Game: heads or tails
 *  Write a program that lets the user guess whether the flip of a coin results 
 *  in heads or tails. The program randomly generates an integer 0 or 1, which represents 
 *  head or tail. The program prompts the user to enter a guess, and reports whether the 
 *  guess is correct or incorrect.
 * @author Muchi Dec 14th of 2021
 *
 */
public class HeadsOrTails {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Generate coin flip
		int coinFlip = (int)(Math.random()*2);
		
		
		//Guess coin side
		System.out.println("Guess Heads or Tails?");
		int guess = input.nextInt();
		
		
		//Check guess vs coin flip
		if(coinFlip == guess) {
			System.out.println("Correct!");
			if(coinFlip == 1) {
				System.out.println("You guessed Heads");
			}else {
				System.out.println("You guessed Tails");
			}
		}else {
			System.out.println("Wrong");
			if(coinFlip == 1) {
				System.out.println("You guessed Head");
			}else {
				System.out.println("You guessed Tails");
			}
		}
	}

}

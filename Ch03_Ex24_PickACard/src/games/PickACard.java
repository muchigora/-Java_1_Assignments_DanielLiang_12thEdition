/**
 * 
 */
package games;

import java.util.Scanner;

/**
 * Ch03 Ex24: Game: pick a card
 * Write a program that simulates picking a card from a deck of 52 cards. 
 * Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) 
 * and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 * Here is a sample run of the program
 * 
 * @author Muchi Dec 25th, of 2021
 */
public class PickACard {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("to Pick a card Enter a digit from 0 - 13: ");
		int rank = input.nextInt();
		int suit = (int)(Math.random()*4);
		//System.out.println(suit);
		
		if (rank == 0) {
			System.out.print(" the card you picked is Ace ");			
			if (suit == 0) {
				System.out.println("of clubs");
			}else if (suit == 1) {
				System.out.println("of Diamonds");
			}else if(suit == 2) {
				System.out.println("of Hearts");				
			}else if(suit == 3) {
				System.out.println("of Spades");
			}else {
				System.out.println("Invalid");
			}
		}
		else if (rank == 1) {
			System.out.print(" the card you picked is a One ");			
			if (suit == 0) {
				System.out.println("of clubs");
			}else if (suit == 1) {
				System.out.println("of Diamonds");
			}else if(suit == 2) {
				System.out.println("of Hearts");				
			}else if(suit == 3) {
				System.out.println("of Spades");
			}else {
				System.out.println("Invalid");
			}
		}
		else if (rank == 3) {
			System.out.print(" the card you picked is a Three ");			
			if (suit == 0) {
				System.out.println("of clubs");
			}else if (suit == 1) {
				System.out.println("of Diamonds");
			}else if(suit == 2) {
				System.out.println("of Hearts");				
			}else if(suit == 3) {
				System.out.println("of Spades");
			}else {
				System.out.println("Invalid");
			}
		}
		else if(rank == 4) {
			System.out.print(" the card you picked is a 4 ");			
			if (suit == 0) {
				System.out.println("of clubs");
			}else if (suit == 1) {
				System.out.println("of Diamonds");
			}else if(suit == 2) {
				System.out.println("of Hearts");				
			}else if(suit == 3) {
				System.out.println("of Spades");
			}else {
				System.out.println("Invalid");
			}
		}
		else if (rank == 5) {
			System.out.print(" the card you picked is a 5 ");			
			if (suit == 0) {
				System.out.println("of clubs");
			}else if (suit == 1) {
				System.out.println("of Diamonds");
			}else if(suit == 2) {
				System.out.println("of Hearts");				
			}else if(suit == 3) {
				System.out.println("of Spades");
			}else {
				System.out.println("Invalid");
			}
		}
		else if (rank == 6) {
			System.out.print(" the card you picked is Six ");			
			if (suit == 0) {
				System.out.println("of clubs");
			}else if (suit == 1) {
				System.out.println("of Diamonds");
			}else if(suit == 2) {
				System.out.println("of Hearts");				
			}else if(suit == 3) {
				System.out.println("of Spades");
			}else {
				System.out.println("Invalid");
			}
		}
		else if(rank == 7) {
			System.out.print(" the card you picked is Seven ");			
			if (suit == 0) {
				System.out.println("of clubs");
			}else if (suit == 1) {
				System.out.println("of Diamonds");
			}else if(suit == 2) {
				System.out.println("of Hearts");				
			}else if(suit == 3) {
				System.out.println("of Spades");
			}else {
				System.out.println("Invalid");
			}
		}else if(rank == 8) {
			System.out.print(" the card you picked is an Eight ");			
			if (suit == 0) {
				System.out.println("of clubs");
			}else if (suit == 1) {
				System.out.println("of Diamonds");
			}else if(suit == 2) {
				System.out.println("of Hearts");				
			}else if(suit == 3) {
				System.out.println("of Spades");
			}else {
				System.out.println("Invalid");
			}
		}
		else if (rank == 9) {
			System.out.print(" the card you picked is Nine ");			
			if (suit == 0) {
				System.out.println("of clubs");
			}else if (suit == 1) {
				System.out.println("of Diamonds");
			}else if(suit == 2) {
				System.out.println("of Hearts");				
			}else if(suit == 3) {
				System.out.println("of Spades");
			}else {
				System.out.println("Invalid");
			}
		}
		else if (rank == 10) {
			System.out.print(" the card you picked is a Ten ");			
			if (suit == 0) {
				System.out.println("of clubs");
			}else if (suit == 1) {
				System.out.println("of Diamonds");
			}else if(suit == 2) {
				System.out.println("of Hearts");				
			}else if(suit == 3) {
				System.out.println("of Spades");
			}else {
				System.out.println("Invalid");
			}
		}
		else if (rank == 11) {
			System.out.print(" the card you picked is a Jack ");			
			if (suit == 0) {
				System.out.println("of clubs");
			}else if (suit == 1) {
				System.out.println("of Diamonds");
			}else if(suit == 2) {
				System.out.println("of Hearts");				
			}else if(suit == 3) {
				System.out.println("of Spades");
			}else {
				System.out.println("Invalid");
			}
		}
		else if (rank == 12) {
			System.out.print(" the card you picked is a Queen ");			
			if (suit == 0) {
				System.out.println("of clubs");
			}else if (suit == 1) {
				System.out.println("of Diamonds");
			}else if(suit == 2) {
				System.out.println("of Hearts");				
			}else if(suit == 3) {
				System.out.println("of Spades");
			}else {
				System.out.println("Invalid");
			}
		}
		else if(rank == 13) {
			System.out.print(" the card you picked is a King ");			
			if (suit == 0) {
				System.out.println("of clubs");
			}else if (suit == 1) {
				System.out.println("of Diamonds");
			}else if(suit == 2) {
				System.out.println("of Hearts");				
			}else if(suit == 3) {
				System.out.println("of Spades");
			}else {
				System.out.println("Invalid");
			}
		}
		else
			System.out.println("Invalid Selection");
		
				


		
		
	
		

	}

}

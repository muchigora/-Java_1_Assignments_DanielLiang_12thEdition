package decision.structures;

import java.util.Scanner;

/**
 * this program display student grade based on Test Score
 * @author Muchi
 *
 */

public class If_ElseIf {

	public static void main(String[] args) {
		//Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Student Test Score: ");
		int testScore = input.nextInt();
		
		if(testScore >= 90 && testScore <= 100) {
			System.out.println("Test Score is " + testScore + "Test Grade is A");
		}
		else if (testScore >= 80 && testScore < 90) {
			System.out.println("Test Score is " + testScore + "Test Grade is B");
		}
		else if (testScore >= 70 && testScore < 80) {
			System.out.println("Test Score is " + testScore + "Test Grade is C");
		}
		else if (testScore >= 60 && testScore < 70) {
			System.out.println("Test Score is " + testScore + "Test Grade is D");
		}
		else if (testScore > 0 && testScore < 60 ) {
			System.out.println("Test Score is " + testScore + "Test Grade is FAIL");
		}
		else {
			System.out.println("Invalid.Score");
		}
		
		
		
		
		//Display Test
		//System.out.println(testScore);

	}

}

import java.util.Scanner;

/**
 * 
 */

/**
 * Ch01 Ex09 Average Acceleration
 * This program calculates average acceleration by taking two velocity readings from user and 
 * dividing by time taken between the two velocity readings
 * @author Muchi compiled on Jun 29th of 2021
 *
 */
public class Acceleration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variables:
		double startVelocity;
		double endVelocity;
		double timeSpan;
		double Acceleration;
		
		//Get data from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first Velocity reading in mps: ");
		startVelocity = input.nextDouble();
		System.out.print("Enter last Velocity reading in mps: ");
		endVelocity = input.nextDouble();
		System.out.print("Enter total time in sec: ");
		timeSpan = input.nextDouble();
		
		
		
		
		//Calculate Average Velocity / Acceleration
		Acceleration = (endVelocity - startVelocity) / timeSpan;
		
		
		//Display Result
		System.out.println(Acceleration);

	}

}

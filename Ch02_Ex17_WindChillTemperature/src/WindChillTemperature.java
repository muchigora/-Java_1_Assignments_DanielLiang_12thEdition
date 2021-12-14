import java.util.Scanner;

/**
 * 
 */

/**Ch02 Ex17 Science: Wind-Chill Temperature
 * How cold is it outside The temperature alone is not enough to provide the answer. Other factors 
 * including wind speed, relative humidity, and sunshine play important roles in determining coldness 
 * outside. In 2001, the National Weather Service (NWS) implemented the new wind-chill temperature to 
 * measure the coldness using temperature and wind speed. The formula is
 * twc=35.74+0.6215ta−35.75v e0.16+0.4275tav e0.16
 * where ta is the outside temperature measured in degrees Fahrenheit, v is the speed measured in miles 
 * per hour, and twc is the wind-chill temperature. The formula cannot be used for wind speeds below 2 mph 
 * or temperatures below −58°F or above 41°F.
 * This program prompts the user to enter temperature between -58F and 41F and wind speed greater than 2mph
 * @author Muchi compiled Jul 1st of 2021
 *
 */
public class WindChillTemperature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare Variables
		double twc; 	//wind-chill temperature
		double ta;		//outside temperature
		double v; 		// windspeed
		
		//Prompt user for data
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Temperature between -58F and 41F: ");
		ta = input.nextDouble();
		
		System.out.println("Enter wind-speed 2mph or greater: ");
		v = input.nextDouble();
		
		//Computation
		twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
		
		//Display Result
		System.out.println("The wind-chill index is: "+ twc);

	}
	

}

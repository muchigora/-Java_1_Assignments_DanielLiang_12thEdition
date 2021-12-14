/**
 * 
 */

/**Chapter 1 Excercise 12: Average Speed in Kilometers
 * this program converts miles to kilometers to miles and calculates Average Speed in Kilometers per hour
 * @author Muchi compiled Jun 27th of 2021
 *
 */
public class AverageSpeed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variable:
		double miles = 24.0;
		double kilometers = miles * 1.6;
		System.out.println("The runner runs " + kilometers + "km");
		
		double minutes = 40.0/60;
		//System.out.println(minutes);
		double seconds = 35.0 / (60 * 60);
		//System.out.println(seconds);		
		double hours = (1 + minutes + seconds);
		System.out.println("he takes " + hours + "hours");		
		
		//Calulating Average Speed:
		double averageSpeed = kilometers / hours;
		
		System.out.println("The Average Speed is " + averageSpeed + "kmh");

	}

}

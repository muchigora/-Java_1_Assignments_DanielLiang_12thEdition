/**
 * 
 */

/**Chapter1 Excercise10: Average Speed
 * 
 * This program converts kilometers to mils and minutes to hours,
 * then calculates average speed of a runner in mules per hour.
 * @author Muchi commpiled on Jun 27th of 2021
 *
 */
public class AverageSpeed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables
		double kilometers =   14;
		double minutes = 45.5;
		
		//Conversions
		double miles = kilometers / 1.6;
		double hours = minutes / 60;
		//System.out.println(miles);
		//System.out.println(hours);
		
		//Average Speed Computation
		double averageSpeed = miles / hours;
		System.out.println("The Average Speed is " + averageSpeed + " Miles per Hour");

	}

}

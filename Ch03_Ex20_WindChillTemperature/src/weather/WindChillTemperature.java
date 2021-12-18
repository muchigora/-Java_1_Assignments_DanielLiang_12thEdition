/**
 * 
 */
package weather;

/**
 * Ch03 Excercise 20 Science: wind-chill temperature
 * Programming Exercise 2.17 gives a formula to compute the wind-chill temperature. The formula is valid for 
 * temperatures in the range between -58°F and 41°F and wind speed greater than or equal to 2. 
 * Write a program that prompts the user to enter a temperature and a wind speed. The program displays the wind-chill 
 * temperature if the input is valid; otherwise, it displays a message indicating whether the temperature and/or wind speed is invalid
 * 
 * ref: Ch2 Ex12:
 *  How cold is it outside The temperature alone is not enough to provide the answer. Other factors 
 * including wind speed, relative humidity, and sunshine play important roles in determining coldness 
 * outside. In 2001, the National Weather Service (NWS) implemented the new wind-chill temperature to 
 * measure the coldness using temperature and wind speed. The formula is
 * twc=35.74+0.6215ta−35.75v e0.16+0.4275tav e0.16
 * where ta is the outside temperature measured in degrees Fahrenheit, v is the speed measured in miles 
 * per hour, and twc is the wind-chill temperature. The formula cannot be used for wind speeds below 2 mph 
 * or temperatures below −58°F or above 41°F.
 * This program prompts the user to enter temperature between -58F and 41F and wind speed greater than 2mph
 * 
 * @author Muchi Dec 12th of 2021
 *
 */
public class WindChillTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/**
 * 
 */

/**Chapter 1 Excercise 11: Population Projection
 * This program projects population for the next five years based on expected birth, death and immigration rates
 * @author Muchi compiled on Jun 27th of 2021
 *
 */
public class Projection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables
		double currentPopulation = 312032486;
		double expectedBirthsYr1 = (365 * 24 * 60 * 60) / 7;
		double expectedImmigrantsYr1 = (365 * 24 * 60 * 60) / 45;
		double expectedDeathsYr1 = (365 * 24 * 60 * 60) / 13;
		//System.out.println(expectedBirthsYr1);
		//System.out.println(expectedImmigrantsYr1);
		//System.out.println(expectedDeathsYr1);
		
		double population = currentPopulation + expectedBirthsYr1 + expectedImmigrantsYr1 - expectedDeathsYr1;
		System.out.println(population);

	}

}

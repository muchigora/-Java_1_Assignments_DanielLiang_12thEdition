import java.util.Scanner;

/**
 * 
 */

/**
 * Chapter 2 Exercise 11: Population Projection
 * This program projects the new population after a given number of year as specified user
 * @author Muchi compiled Jun 30th of 2021
 *
 */
public class PopulationProjection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declare number of years to project populaton
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		
		// Declare Variable
		final long initialPopulation = 312032486;
		long totalBirths = years * ((365 * 24 * 60 * 60) / 7);
		//System.out.println(totalBirths);
		long totalDeaths = years * (365 * 24 * 60 * 60) / 13;
		//System.out.println(totalDeaths);
		long totalImmigrants = years * (365 * 24 * 60 * 60) / 45;
		//System.out.println(totalImmigrants);
		
		
		//Project future Population
		long newPopulation = initialPopulation + totalBirths + totalDeaths + totalImmigrants;
				
		//Display expected population 
		System.out.println("The population is projected to be " + newPopulation + " in " + years + " years.");

	}

}

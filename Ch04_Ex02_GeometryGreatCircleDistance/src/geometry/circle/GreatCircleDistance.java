/**
 * 
 */
package geometry.circle;

import java.util.Scanner;

/**
 * 
 * @author Muchi
 *
 */
public class GreatCircleDistance {
	
	
	public static void main(String[] args) {
		//CONSTANT
		double RADIUS = 6371.01;
		
		// Create Scanner
		Scanner alaye = new Scanner(System.in);
		
		//Prompt user for longitude and latitude of two different points on the the earth
		System.out.println("The longitude and latitudes in the program are in degrees\n "
				+ "negatives will represent south and east degrees\n"
				+ "Longitude run North to South, latitudes run West to East");
		System.out.println();
		System.out.println("Enter latitude and longitude of Point A: ");
		System.out.println("Point A latitude: ");
		double x1 = alaye.nextDouble();
		System.out.println("Point A longitude: ");
		double y1 = alaye.nextDouble();
		System.out.println("Point A geometric coordinate: ("+x1+","+y1+")");
		System.out.println();
		
		System.out.println("Enter latitude and longitude of Point B: ");
		System.out.println("Point B latitude: ");
		double x2 = alaye.nextDouble();
		System.out.println("Point B longitude: ");
		double y2 = alaye.nextDouble();
		System.out.println("Point B geometric coordinate: ("+x2+","+y2+")");
		
		
		//compute great circle distance between the two points
		double d = RADIUS * Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1 - y2))
				);
		
		//display the result
		System.out.println(d);

	}

}

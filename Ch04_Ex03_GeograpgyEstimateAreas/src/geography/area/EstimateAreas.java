/**
 * 
 */
package geography.area;

/**
 * Chapter 4 Exercise 3 Geography: estimate areas
 * Use the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and 
 * Charlotte, North Carolina in the figure in Section 4.1 see attachement,  
 * to compute the estimated area enclosed by these four cities. 
 * (Hint: Use the formula in Programming Exercise 4.2 to compute the distance between two cities. 
 * Divide the polygon into two triangles and use the formula in Programming Exercise 2.19 to 
 * compute the area of a triangle.)
 * 
 * @author Muchi compiled on Dec 30, 2021
 *
 */
public class EstimateAreas {

	
	public static void main(String[] args) {
		double RADIUS = 6371.01;
		
		// logitudes and latitudes for the given citites
		double xAtlanta = 33.7489954;
		double yAtlanta = -84.3879824;
		double xOrlando = 28.5383355;
		double yOrlando = -81.3792365;
		double xSavannah = 32.0835407;
		double ySavannah = -81.0998342;
		double xCharlotte = 35.2270869;
		double yCharlotte = -80.8431267;
		
		//compute the distance between Atlanta and Savannah
		double distAtlantaToSavannah = RADIUS * Math.acos(Math.sin(Math.toRadians(xAtlanta))*Math.sin(Math.toRadians(xSavannah)) + Math.cos(Math.toRadians(xAtlanta))*Math.cos(Math.toRadians(xSavannah))*Math.cos(Math.toRadians(yAtlanta - ySavannah)));
		
		//Compute the areas of the resultant two triangles
		//area Atlanta -  Charlotte  - Savannah
		//Determine Sides
		double sideAtlantaCharlotte = RADIUS * Math.acos(Math.sin(Math.toRadians(xAtlanta))*Math.sin(Math.toRadians(xCharlotte)) + Math.cos(Math.toRadians(xAtlanta))*Math.cos(Math.toRadians(xCharlotte))*Math.cos(Math.toRadians(yAtlanta - yCharlotte)));
		double sideCharlotteSavannah = RADIUS * Math.acos(Math.sin(Math.toRadians(xCharlotte))*Math.sin(Math.toRadians(xSavannah)) + Math.cos(Math.toRadians(xCharlotte))*Math.cos(Math.toRadians(xSavannah))*Math.cos(Math.toRadians(yCharlotte - ySavannah)));
		//Determine Area
		double sTriangleOne = (sideAtlantaCharlotte + sideCharlotteSavannah + distAtlantaToSavannah) / 2;
		double areaAtlantaCharlotteSavannah = Math.sqrt(sTriangleOne * (sTriangleOne - sideAtlantaCharlotte) * (sTriangleOne - sideCharlotteSavannah) * (sTriangleOne - distAtlantaToSavannah));
		
		//Area Atlanta - Orlando - Savannah
		double sideAtlantaOrlando = RADIUS * Math.acos(Math.sin(Math.toRadians(xAtlanta))*Math.sin(Math.toRadians(xOrlando)) + Math.cos(Math.toRadians(xAtlanta))*Math.cos(Math.toRadians(xOrlando))*Math.cos(Math.toRadians(yAtlanta - yOrlando)));
		double sideOrlandoSavannah = RADIUS * Math.acos(Math.sin(Math.toRadians(xOrlando))*Math.sin(Math.toRadians(xSavannah)) + Math.cos(Math.toRadians(xOrlando))*Math.cos(Math.toRadians(xSavannah))*Math.cos(Math.toRadians(yOrlando - ySavannah)));
		//Determine area
		double sTriangleTwo = (sideAtlantaOrlando + sideOrlandoSavannah + distAtlantaToSavannah) / 2;
		double areaAtlantaOrlandoSavannah = Math.sqrt(sTriangleTwo * (sTriangleTwo - sideAtlantaOrlando) * (sTriangleTwo - sideOrlandoSavannah) * (sTriangleTwo - distAtlantaToSavannah));
		
		
		//Aggregate area
		double areaSum = areaAtlantaCharlotteSavannah + areaAtlantaOrlandoSavannah;
		
		//display area of the polygon
		System.out.println("The Area surrounded by the cities: " + (areaAtlantaCharlotteSavannah + areaAtlantaOrlandoSavannah) +  "Sqr KM");
		
		

	}

}

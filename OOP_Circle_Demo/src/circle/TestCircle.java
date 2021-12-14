package circle;

public class TestCircle {
	/*
	 * this class construct Circle objects with different radii.
	 */

	public static void main(String[] args) {
		// Create first Circle object with default radius parameter; radius = 1'
		Circle circle1 = new Circle();
		System.out.println("The area of the circle with radius " + circle1.radius + " is " + circle1.getArea());
		
		//	creating Circle object 2 with a specified radius parameter of 25
		Circle circle2 = new Circle(25);
		System.out.println("The area of the circle with radius " + circle2.radius +
				" is " + circle2.getArea());
		
		// Create Circle Object 3 with radius parameter of 125
		Circle circle3 = new Circle(125);
		System.out.println("The area of the circle with radius " + circle3.radius + 
				" is " + circle3.getArea());
		
		//Modify Circle onject 2, changing radius from 25 to 100
		circle2.radius = 100;
		System.out.println("The area of the circle with radius " + circle2.radius +
				" is " + circle2.getArea());

	}

}

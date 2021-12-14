/**
 * 
 */
package rectangle;

/**Chapter 9, Excercise 1: The Rectangle Class
 * design a class named Rectangle to represent a rectangle. The class contains: 
 * Two double data fields named: 
 * ---1---: width and 
 * ---2---:height 
 * that specify the width and height of the rectangle. The default values are 1 for 
 * both width and height.
 * A no-arg constructor that creates a default rectangle. 
 * A constructor that creates a rectangle with the specified width and height. 
 * A method named getArea() that returns the area of this rectangle.
 * A method named getPerimeter() that returns the perimeter.
 * 
 * @author Muchi on September 9th of 2021
 */
class Rectangle {
	//  create Attributes, Variables, State, Properties, Data-fields
	double width = 1;
	double height = 1;
	
	//Create Constructors
	Rectangle(){
		
	}
	
	Rectangle (double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	
	//Create methods
	double getArea(){
		double area =  width * height;
		return area;
	}
	
	double getPerimeter() {
		return 2 * (width + height);
	}
	
	void setWidth (double newWidth) {
		width = newWidth;		
	}
	
	void setHeight(double newHeight) {
		height = newHeight;
	}
}

package circle;

//this circle class is different. it contains no main method, therefore it cannot 
//be run.
// this class is merely creation of the circle object
//so of necessity there must needs be created another class with a main method.
class Circle { 
	
	//declare variables / attributes / data-fields
	double radius = 1;
	
	//create the constructors
	Circle(){
		
	}
	Circle(double newRadius){
		radius = newRadius;
		
	}
	
	
	//create the methods. The methods will computer area, perimeter and
	//set a new radius for the circle 
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	double getPerimeter(){
		return 2 * radius * Math.PI;
	}
	
	void setRadius(double newRadius) {
		radius = newRadius;
	}

}

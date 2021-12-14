package rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle1 = new Rectangle();
		System.out.println(" The rectangle with length " + rectangle1.height + " and width " + rectangle1.width
				+ " has an area of " + rectangle1.getArea() + " and perimeter of " + rectangle1.getPerimeter());
		System.out.println("----------------------------------------------------------");
		
		Rectangle rectangle2 = new Rectangle(3,5);
		System.out.println("The Rectangle with length " + rectangle2.height + " and a width of "
				+ rectangle2.width + " has an area of " + rectangle2.getArea()
						+ " and a perimeter of " + rectangle2.getPerimeter());
System.out.println("----------------------------------------------------------");
		
		Rectangle rectangle3 = new Rectangle(4,40);
		System.out.println("The Rectangle with length " + rectangle3.height + " and a width of "
				+ rectangle3.width + " has an area of " + rectangle3.getArea()
						+ " and a perimeter of " + rectangle3.getPerimeter());
		

	}

}

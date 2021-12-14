package isbn.number.check;

import java.util.Scanner;

public class ISBN_NumberCheck {

	public static void main(String[] args) {
		// Creater Scanner
		Scanner input = new Scanner(System.in);
		
//		ISBN Number generation
		System.out.println("Enter 1st digit of the ISBN: ");
		int a = input.nextInt();
		
		System.out.println("Enter 2nd digit of the ISBN: ");
		int b = input.nextInt();
		
		System.out.println("Enter 3rd digit of the ISBN: ");
		int c = input.nextInt();
		
		System.out.println("Enter 4th digit of the ISBN: ");
		int d = input.nextInt();
		
		System.out.println("Enter 5th digit of the ISBN: ");
		int e = input.nextInt();
		
		System.out.println("Enter 6th digit of the ISBN: ");
		int f = input.nextInt();
		
		System.out.println("Enter 7th digit of the ISBN: ");
		int g = input.nextInt();
		
		System.out.println("Enter 8th digit of the ISBN: ");
		int h = input.nextInt();
		
		System.out.println("Enter 9th digit of the ISBN: ");
		int i = input.nextInt();
		
		//Check sum or 10th digit computation
		int checkSum = (a*1 + b*2 + c*3 + d*4 + e*5 + f*6 + g*7 + h*8 + i*9) % 11;
		
		
		//Display the last isbn
		System.out.println("ISBN " + a + "-" +b+c+d+ "-"+e+f+g+h+i+ "-"+ checkSum );

	}

}

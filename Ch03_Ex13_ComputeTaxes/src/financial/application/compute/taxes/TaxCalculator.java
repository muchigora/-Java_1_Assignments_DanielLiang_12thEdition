package financial.application.compute.taxes;

import java.util.Scanner;

/**
 * Financial application: compute taxes
 * Listing 3.5, ComputeTax.java, gives the source code to compute taxes for single filers. 
 * Complete this program to compute taxes for all filing statuses.
 * @author Muchi
 *
 */

public class TaxCalculator {
	
	public static void main (String args[]) {
		
		//Declare variables
		int taxBand1 = 10;
		int taxBand2 = 
		//double annualSalary=0;
		
		//create scanner input
		Scanner input = new Scanner(System.in);
		
		//Prompt user for their filing status
		System.out.println("what is your filing status: \n" +
				"0 - Single\n" +
				"1 - married joint\n" +
				"2 - married single\n" +
				"3 - ");
		
		int status = input.nextInt();
		
		//Prompt user for annual salary
		System.out.println("Enter your annual salary");
		double annualSalary = input.nextDouble();
		
		//Decision structures
		if(annualSalary<=0 && annualSalary < 10000) {
			double taxDue = annualSalary * (taxBand1 / 100);
			System.out.println("Tax due: " + taxDue);
			
		}
		else {
			double taxDue = annualSalary * (taxBand3 / 100);
			System.out.println("Tax Due: " + taxBand3);
		}
	}

}

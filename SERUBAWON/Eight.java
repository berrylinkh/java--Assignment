// psuedocode 8
/* 	Start
	import a scanner
	create a class 
	create a main method 
	create one input from user that read radius
	declare a variable to compute area of a circle '22/7 * radius * radius'
	print result with printf to display result in two decimal point
	End.
*/

import java.util.Scanner;
	
	public class Eight{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		System.out.print(" Enter number: ");
		double radius  = input.nextDouble();

			double areaOfCircle = 22/7 * (radius * radius);

				System.out.printf(" Area: %.2f ", areaOfCircle );
	}
}
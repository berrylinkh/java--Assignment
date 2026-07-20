// psuedocode 7
/* 	Start
	import a scanner
	create a class 
	create a main method 
	create one input from user that read price 
	declare a variable that calculate the tax 'price * 0.075'
	declare a variable that calculate the total ' price + tax'
	print out the total result for each variable on each line.
	End.
*/

import java.util.Scanner;
	
	public class Six{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		System.out.print(" price: ");
		double price = input.nextDouble();

			double tax = price * 0.075;
			double total = price + tax;

				System.out.printf(" Tax:%.3f%n Total:%.3f ", tax, total );
	}
}
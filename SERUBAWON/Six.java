// psuedocode 6
/* 	Start
	import a scanner
	create a class 
	create a main method 
	create two input from user  
	declare a variable that calculate the sum of the two integer
	declare a variable that calculate the difference of the two integer
	declare a variable that calculate the product of the two integer
	declare a variable that calculate the quotient of the two integer
	print out result for each variable on each line.
	End.
*/

import java.util.Scanner;
	
	public class Six{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int one = input.nextInt();
		System.out.print("Enter number two: ");
		int two = input.nextInt();

			int sum = one + two;
			int difference = one - two;
			int product = one * two;
			double quotient = one/two;

System.out.printf(" Sum: %d%n Difference: %d%n Product: %d%n quotient:%.2f ", sum, difference, product, quotient );
	}
}
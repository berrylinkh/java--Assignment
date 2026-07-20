// Question 2.5 

/*
1 input one prompt
2 convert the number to kilogram 
3 print the result
*/

import java.util.Scanner;

	public class Pounds{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Number in pounds: ");
	double pounds = input.nextDouble();

	double kilograms = pounds * 0.454;

	
	System.out.printf("pounds is: %.3f", kilograms);

	}

}


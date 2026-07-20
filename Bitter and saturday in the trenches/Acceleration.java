// Question 2.9 

/*
1 choose a digit 1 -1000 
2 slip the input into three user prompt 
2 calculate the sum.
3 print the result
*/

import java.util.Scanner;

	public class Integer{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter digit1: ");
	double digitOne = input.nextDouble();

	System.out.print("Enter digit2: ");
	double digitTwo = input.nextDouble();

	System.out.print("Enter digit3: ");
	double digitThree = input.nextDouble();
		
	double sum = digitOne + digitTwo + digitThree;
	
	
	System.out.printf("The sum of the digits:%d", sum);

	}

}


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

	System.out.print("Enter subtotal: ");
	double subTotal = input.nextInt();

	System.out.print("Enter gratuityrate: ");
	double gratuityRate = input.nextInt();
		
	double gratuity = subTotal* (gratuityRate / 100);
	double total = subTotal + gratuity;

	
	System.out.printf("The gratuity is: $%f%n , total is: $%f", gratuity , total);

	}

}


// Question 2.5 

/*
1 input three prompt from user
2 calculate the gratuity 
2 calculate the total
3 print the result
*/

import java.util.Scanner;

	public class Gratuity{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter subtotal: ");
	double subTotal = input.nextInt();

	System.out.print("Enter gratuityrate: ");
	double gratuityRate = input.nextInt();
		
	double gratuity = subTotal* (gratuityRate / 100);
	double total = subTotal + gratuity;

	
	System.out.printf("The gratuity is: $%.1f%n , total is: $%.1f", gratuity , total);

	}

}


// psuedocode 13
/* 	Start
	import a scanner
	create a class 
	create a main method 
	collect an input for item price 
	collect an input for quantity
	calculate the subtotal 'price * quantity'
	calculate the VAT'subtotal * 0.20'
	calculate the grand total'subtotal + VAT'
	print grand total.
`	write the six statement in java
	End.
*/

import java.util.Scanner;
	
	public class Thirteen{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		System.out.print(" Item price: ");
		double price  = input.nextDouble();
		System.out.print(" Quantity: ");
		int quantity  = input.nextInt();

		double subtotal = price * quantity;
		double VAT = subtotal * 0.20;
		double grandTotal = subtotal * VAT;
			
		
		System.out.printf("Grand Total:%.2f" , grandTotal);
	}
}
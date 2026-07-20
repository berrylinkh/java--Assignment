// psuedocode 16
/* 	Start
	import a scanner
	create a class 
	create a main method 
	declare a variable for firstNumber and secondNumber
	print the value.
	reassign value to the FirstNumber and secondNumber
	print the ressign value.
	End.
*/

import java.util.Scanner;
	
	public class Sixteen{
	public static void main(String[]args){


		int firstNumber = 15;
		int secondNumber = 11;			
		
		System.out.printf(" First Number: %d%n Second Number:%d%n", firstNumber, secondNumber);
	
		firstNumber = secondNumber;
		secondNumber = firstNumber;
		System.out.printf(" First Number: %d%n Second Number:%d", firstNumber, secondNumber);
	}
}
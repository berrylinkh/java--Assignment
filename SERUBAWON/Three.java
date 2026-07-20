// psuedocode 2
/* 	Start
	import a scanner
	create a class 
	create a main method 
	create one user input for temperature in celcius
	declare a variable for fahrenheit using this formula '(celcuis * 9/5)+ 32'
	input formula for auto convertion to fahrenheit
	print out result that display "fahrenheit = (number)".
	End.
*/

import java.util.Scanner;
	
	public class Three{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		System.out.print("Enter temperature in celsius: ");
		double celsius = input.nextDouble();
		double fahrenheit = (celsius * 9/5) + 32;

			System.out.printf("The fahrenheit= %.2f", fahrenheit);
	}
}
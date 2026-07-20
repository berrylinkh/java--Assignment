// psuedocode 10
/* 	Start
	import a scanner
	create a class 
	create a main method 
	collect three input from user for first name, last name and year of birth
	declare a variable to calculate the current age of the user
	print result in a formatted profile.
	End.
*/

import java.util.Scanner;
	
	public class Ten{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		System.out.print(" First name: ");
		String firstName  = input.next();
		System.out.print(" Last name: ");
		String lastName  = input.next();
		System.out.print(" Year of birth: ");
		int year  = input.nextInt();

			int currentYear = 2025;
			int currentAge = currentYear - year; 

			System.out.printf(" First Name:%s%n", firstName );
			System.out.printf(" Last Name:%s%n", lastName );
			System.out.printf(" Current Age:%d", currentAge);
	}
}
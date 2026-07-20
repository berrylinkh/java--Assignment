// psuedocode 2
/* 	Start
	import a scanner
	create a class 
	create a main method 
	create two user input for name and age
	print out result that display "Hell (name), you are(age)".
	End.
*/

import java.util.Scanner;
	
	public class Two{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);	

		System.out.print("Name: ");
		String name = input.nextLine();

			System.out.print("Age: ");
			int age =input.nextInt();

		
			System.out.printf("Hello %s, you are %d years old", name,age );

		}
}
// psuedocode 12
/* 	Start
	import a scanner
	create a class 
	create a main method 
	collect an input input in string
	assign and put'Good morning!'
	reassign and put'Good eveinng!'
	print result.
	End.
*/

import java.util.Scanner;
	
	public class Twelve{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		System.out.print(" Greetings: ");
		String greetings  = input.nextLine();
					
			System.out.printf("%s" , greetings);
	}
}
// psuedocode 21
/* 	Start
	import scanner
	create a class 
	create a main method 
	collect one integer input from user
	print the positive if the number is greater than zero
	End.
*/
	import java.util.Scanner;
	public class TwentyOne{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		System.out.print("Enter number");
		int number =input.nextInt();
				
		if(number > 0){		
		System.out.print(" positive" );
		}

	}
}
// psuedocode 22
/* 	Start
	import scanner
	create a class 
	create a main method 
	collect one integer input from user
	write an if/else statement to print 'Even' if divisible by 2 else print 'Odd' if it 	is not.
	print out the output
	End.
*/
	import java.util.Scanner;
	public class TwentyTwo{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		System.out.print("Enter number");
		int number =input.nextInt();
				
		if(number % 2 ==0){		
		System.out.print(" Even" );
		}
else
	if(number % 2 !=0){
		System.out.print(" Odd" );
		}

	}
}
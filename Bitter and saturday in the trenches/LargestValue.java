/* Pseudocode
	1. Enter ten input
	2. print out the largest value
	3.use loop.  
*/


import java.util.Scanner;

	public class largestValue {
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);

	int largest = 0;
	int counter = 0;

	System.out.print("Enter number: ");
	int userOne = input.nextInt();
	largest = userOne;
	
	while(counter < 9) {
	System.out.print("Enter number: ");
	userOne = input.nextInt();

	if (userOne > largest){
		userOne = largest;
	} 
	
	counter++;
	}
	System.out.printf("The largest number is: %d%n", largest);
	
}
}
/* Pseudocode
	1. Modify the number one
	2. print out the smallest value
	3. change begin from line 7 to the end */


import java.util.Scanner;

	public class SmallestValue {
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);

	int smallest = 0;
	int counter = 0;

	System.out.print("Enter number: ");
	int userOne = input.nextInt();
	smallest = userOne;
	
	while(counter < 9) {
	System.out.print("Enter number: ");
	userOne = input.nextInt();

	if (userOne < smallest){
		userOne = smallest;
	} 
	
	counter++;
	}
	System.out.printf("The smallest number is: %d%n", smallest);
	
}
}
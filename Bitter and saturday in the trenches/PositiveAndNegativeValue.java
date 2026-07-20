/* Pseudocode
	1. Modify the number two
	2. print out the positve and negative value
	3.identify which line you change */


import java.util.Scanner;

	public class PositiveAndNegativeValue {
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);

	int positive = 0;
	int negative = 0;
	int largest = 0;
	int counter = 0;

	System.out.print("Enter number: ");
	int userOne = input.nextInt();
	largest = userOne;
	
	while(counter < 9) {
	System.out.print("Enter number: ");
	userOne = input.nextInt();

	
if (userOne > 0){
		positive++; 
	} 
if(userOne < 0) {
	negative++;
	} 

if (userOne > largest){
		largest = userOne;

	} 
	counter++;
}
	System.out.printf("The positive number is: %d%n", positive);
	System.out.printf("The negative number is: %d%n", negative);
	System.out.printf("The largest number is: %d%n", largest);
	
}
}

// Change all largest to smallest
//change the greater 
/* Pseudocode
	1. Modify the number two
	2. print out the positve and negative value
	3.identify which line you change */


import java.util.Scanner;

	public class SecondLargestNumber {
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);

	int largestNumber = 0;
	int secondLargestNumber = 0;
	int counter = 0;

	System.out.print("Enter number: ");
	int number = input.nextInt();
	largestNumber = (int) number;
	
	while(counter < 9) {
	System.out.print("Enter number: ");
	number = input.nextInt();

	
if (number > largestNumber){
		 largestNumber = number;
	} 
if(number > secondLargestNumber && number != largestNumber) {
	 secondLargestNumber = number; 
	} 

	counter++;
}
	System.out.printf("The largest number is: %d%n", + largestNumber);
	System.out.printf("The second largest number is: %d%n", + secondLargestNumber);
	
}
}

// Change began from line 6 to the end //
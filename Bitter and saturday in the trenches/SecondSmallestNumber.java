/* Pseudocode
	1. Modify the number two
	2. print out the positve and negative value
	3.identify which line you change */


import java.util.Scanner;

	public class SecondSmallestNumber {
	public static void main (String [] args) {


	Scanner input = new Scanner(System.in);


	System.out.print("Enter number: ");
	int number = input.nextInt();
	int smallest = number;
	int secondSmallest = 1;
	int counter = 1;
while(counter < 10) {
	System.out.print("Enter number: ");
	number = input.nextInt();

	
if (number < smallest){
		 secondSmallest = smallest;
		smallest = number;
	
	} 
if(number < secondSmallest && number > smallest) {
	  secondSmallest = number; 
	} 

	counter++;
}
	System.out.printf("The smallest number is: %d%n", smallest);
	System.out.printf("The second smallest number is: %d%n", secondSmallest);
	
}
}

// Change began from line 6 to the end //
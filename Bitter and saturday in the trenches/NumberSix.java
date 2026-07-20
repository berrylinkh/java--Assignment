/* Pseudocode
	1. Modify the number 5
	2. print out the total, average,largest and second largest.
	3. change started from line 3 to the end.
*/


import java.util.Scanner;

	public class NumberSix {
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	int largest = 1;
	int secondLargest = 0;
	int total = 0;
	int counter = 1;

while(counter <= 10) {
	System.out.print("Enter number: ");
	int number = input.nextInt();
	
	total = total+ number;
if (number > largest){
		 secondLargest = largest;
		largest = number;
	
	} 
if(number > secondLargest && number < largest) {
	  secondLargest = number; 
	} 

	counter++;
}

	double average = (double) total / 10;	
	
	System.out.printf("The total  %d%n, largest number is: %d%n , second largest number is: %d%n ,average number is: %.2f%n", total, largest , secondLargest , average);
	

	
}
}

// Change began from line 6 to the end //
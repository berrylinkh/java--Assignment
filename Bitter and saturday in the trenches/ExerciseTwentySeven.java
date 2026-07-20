// Exercise 27

/*
1.Declare and initialize variable for counter and number
2. print out the largest value

*/

import java.util.Scanner;

	public class ExerciseTwentySeven{
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);

	int largest = 0;
	int counter = 0;

	System.out.print("Enter number: ");
	int number = input.nextInt();
	largest = number;
	
	while(counter < 4) {
	System.out.print("Enter number: ");
	number = input.nextInt();

	if (number > largest){
		largest = number;
	} 
	
	counter++;
	}
	System.out.printf("largest: %d%n", number);
	
}
}



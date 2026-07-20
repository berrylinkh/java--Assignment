// Exercise 28
/*
	1.Enter input from user
	2. print out the smallest value
*/


import java.util.Scanner;

	public class ExerciseTwentyEight{
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);

	int smallest = 0;
	int counter = 0;

	System.out.print("Enter number: ");
	int number = input.nextInt();
	smallest = number;
	
	while(counter < 4) {
	System.out.print("Enter number: ");
	number = input.nextInt();

	if (number < smallest){
		smallest = number;
	} 
	
	counter++;
	}
	System.out.printf("smallest: %d%n", smallest);
	
}
}
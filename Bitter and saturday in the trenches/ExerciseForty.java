// Exercise 40
/*
1.Enter five input from user
2. use do while loop to calculate the sum of the input
3. print out result

*/

import java.util.Scanner;

	public class ExerciseForty{
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);

		int sum = 0;
		int counter =1;
	
	do{
		System.out.print("Enter Number: ");
		int number = input.nextInt();
		sum+=number;
		++counter;
	}
	while (counter <=5);
	

		System.out.printf("total Sum:%d ", sum);	

	}
}
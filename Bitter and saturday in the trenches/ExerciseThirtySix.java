// Exercise 36
/*
1.create an input for user to login 
2. use do while loop to request for the input
3. print out result

*/

import java.util.Scanner;

	public class ExerciseThirtySix{
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);

		System.out.print("Enter login: ");
		int login = input.nextInt();
		int counter =0;
		
	
	do{
		System.out.printf("Login: ", login);
		counter++;
	}
	while (counter != 0);
		
		
	
	}
}
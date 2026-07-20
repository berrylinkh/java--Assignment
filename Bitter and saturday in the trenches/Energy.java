// Question 2.10 

/*
1 collect the three user prompt 
2 calculate the two sides
3 using the input to calculate the energy
4 print the result
*/

import java.util.Scanner;

	public class Energy{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the amount in kilograms: ");
	double kilogram = input.nextDouble();

	System.out.print("Enter the initial temperature: ");
	double initialTemperature = input.nextDouble();

	System.out.print("Enter the final temperature: ");
	double finalTemperature = input.nextDouble();
		
	double energy = kilogram * (finalTemperature-initialTemperature) * 4184;
	
	
	System.out.printf("The energy needed is:%.1f%n  joules%n", energy);

	}

}


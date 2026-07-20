// Question 2.10 

/*
1 collect the three user prompt 
2 calculate the two sides
3 using the input to calculate the energy
4 print the result
*/

import java.util.Scanner;

	public class DistanceOfTriangle {
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the amount in kilograms: ");
	double kilogram = input.nextDouble();

	System.out.print("Enter the initial temperature: ");
	double initialTemperatre = input.nextDouble();

	System.out.print("Enter the final temperature: ");
	double finalTemperatre = input.nextDouble();
		
	double energy = kilogram * (finalTemperature - initialTemperature) * 4184;
	
	
	System.out.printf("Energy:%f%n ", energy);

	}

}


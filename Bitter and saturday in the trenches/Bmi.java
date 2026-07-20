
// Creating a BMI calculator  

	import java.util.Scanner;

	public class Bmi{
	public static void main(String[]args){

// Creating scanner to obtain input from command line

	Scanner input = new Scanner(System.in);
	System.out.print("Enter weight in kilogram");
	int weight = input.nextInt();
	System.out.print("Enter height in meter");
	int height = input.nextInt();
	int Bmi = weight / (height * height);

if ( Bmi == 0 && Bmi < 18) { 
	System.out.println("underweight");
}
 if ( Bmi > 18 && Bmi == 24) { 
	System.out.println("normal");	
}
if ( Bmi >24 && Bmi ==28) { 
	System.out.println("overweight");
}
if ( Bmi > 28 && Bmi==30) { 
	System.out.println("obess");
}
} // end of main method.
 } // end of class.

psuedocode
1. collect weight and height from user
2. use the Bmi formula to calculate user input
3. make a decision base on th Bmi calculator result.
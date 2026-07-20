	import java.util.Scanner;
	
	public class Weight{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Weight in kilogram: ");
	double Weight = input.nextDouble();

	System.out.print("Height in meter: ");
	double Height = input.nextDouble();

	double Bmi = Weight / Height;

	System.out.printf("Bmi: %.2f%n ", Bmi);
 }
}


Psuedocode
1.Two input for weight and height
2.Calculate the Bmi Weight / Height
3.Print out the output.


// Calculating the value of kelvin, celcius and fahrenheit

	import java.util.Scanner;

	public class Science{
	public static void main(String[]args){

// Creating scanner to obtain input from command line

	Scanner input = new Scanner(System.in);
	System.out.print("Enter temperature: ");
	int temperature = input.nextInt();
	double kelvin = temperature + 273.15;
	double celscius = kelvin - 273.15;
	double fahrenheit = (kelvin - 273.15) * 9/5 + 32;

	System.out.print("kelvin = %f%n", + temperature);
	System.out.printf("celcius = %f%n ", + celcius);
	System.out.printf("fahrenheit = %f%n ", + fahrenheit);

} // end of main method.
 } // end of class.

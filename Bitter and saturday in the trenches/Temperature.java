	import java.util.Scanner;
	public class Temperature{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("temperature in celcius: ");
	double celcius = input.nextDouble();

	double faherheit = (celcius * 9 / 5) *32;

	System.out.printf("faherheit: %.2f%n ", faherheit);
 }
}


Psuedocode
1.Input the temperature in celcius
2.Calculate the faherheit (celcius * 9 / 5) *32)
3.Print out the output.

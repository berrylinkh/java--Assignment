import java.util.Scanner;

	public class DistanceTravel{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("kilometer: ");
	double kilometer = input.nextDouble();

	System.out.print("hours: ");
	double hours = input.nextDouble();

	System.out.print("minutes: ");
	double minutes = input.nextDouble();

	double average = kilometer + hours + minutes / 3;
		
	
	System.out.printf("Average speed = %.2f%n ", average);
 }
}


Psuedocode
1.create three input for kilometer, hour and minutes 
2.Calculate the average ( kilometer + hour + minutes / 3)
3.Print out the output.


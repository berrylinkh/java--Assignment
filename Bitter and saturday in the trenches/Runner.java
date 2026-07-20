import java.util.Scanner;

	public class Runner{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("kilometer: ");
	double kilometer = input.nextDouble();

	System.out.print("minutes: ");
	double minutes = input.nextDouble();

	System.out.print("seconds: ");
	double seconds = input.nextDouble();

	double time = (minutes * 60) + seconds;
	double hour = time / 3600;
	double mile = 1.6;

	double distant = kilometer / mile;
	double averagePerHour = distant / hour; 
	
	
	System.out.printf("Average Per Hour = %.2f%n ", averagePerHour);
 }
}
import java.util.Scanner;
	public class Mystery{
	public static void main (String []args){
	Scanner input = new Scanner(System.in);
	
	int inputCounter = 0;
	int total = 0;

	System.out.println("Miles driven and gallons used or -1 to quit: ");
	int miles = input.nextInt();
	int gallons = input.nextInt();


	while (miles != -1 && gallons != -1){
	int milesPerGallon = (int)miles / gallons;
	total = total + milesPerGallon;
	
	System.out.printf("This Trip is %d Miles/Gallon %n", milesPerGallon);

	System.out.println("Miles driven and gallons used or -1 to quit: ");
	miles = input.nextInt()	gallons = input.nextInt();

	inputCounter++; 
		
}

	int totalAverage = (int) total / inputCounter;

	System.out.printf("The average of all the miles combined is %d",totalAverage);




}
	}

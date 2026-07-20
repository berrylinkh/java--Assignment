import java.util.Scanner;
	public class Car{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	
	int inputCounter = 0;
	int total = 0;

	System.out.println("Mile driven and gallon used or -1 to quit: ");
	int mile = input.nextInt();
	int gallons = input.nextInt();

	while(mile != -1 && gallons != -1){
	int milesPerGallons = (int)mile / gallons;
	total = total + milesPerGallons;

	System.out.printf("This is %d miles / gallons %n", milesPerGallons);
	
	System.out.println("Miles driven and gallons used or -1 to quit: ");
	mile = input.nextInt();  
	gallons = input.nextInt();
	inputCounter++;
	}

	int totalAverage = (int)total / inputCounter;
	System.out.println("The average all miles combined" + totalAverage);
}
}
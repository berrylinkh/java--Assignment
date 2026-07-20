import java.util.Scanner;
public class Uber{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print(" User destination: ");

	String destination = input.nextLine();

	System.out.print ("Total distance: ");

	double distance = input.nextDouble();

	System.out.print ("Enter fuel price: ");

	int fuelprice = input.nextInt();

	System.out.print("Car fuel efficiency: ");

	double fuelefficiency = input.nextDouble();


 	double fuelNeeded = distance / fuelefficiency;

	double costOfFuelNeeded = fuelNeeded / fuelprice;

	double splitCost = costOfFuelNeeded /2;

	System.out.printf("fuel Needed: %f%n ", fuelNeeded);

	System.out.printf("cost Of Fuel Needed: %f%n",costOfFuelNeeded);

	System.out.printf("split Cost:%f%n",splitCost);

	System.out.printf("total fuel needed for destination is %.2f%n",+ splitCost );

}
} 
	

	
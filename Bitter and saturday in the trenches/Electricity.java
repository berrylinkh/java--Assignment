	import java.util.Scanner;
	
	public class Electricity{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Electricity unit consumed: ");
	double unitsConsumed = input.nextDouble();

	System.out.print("Cost per unit: ");
	double Cost = input.nextDouble();

	double totalBill = unitsConsumed* Cost;

	System.out.printf("Total Units: %.2f%n ", totalBill);
 }
}

Psuedocode
1.Two input  for electricity units consumed and cost per unit
2.Calculate the total bill ( unitsConsumed* Cost)
4.Print out the output.
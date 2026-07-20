import java.util.Scanner;

	public class ThreeSidesOfTriangle{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter sideOne: ");
	double sideOne = input.nextDouble();

	System.out.print("Enter sideTwo: ");
	double sideTwo = input.nextDouble();

	System.out.print("Entetr sideThree: ");
	double sideThree = input.nextDouble();

	double perimeter = sideOne + sideTwo + sideThree / 2;
	double area = (perimeter * (perimeter - sideOne) * (perimeter - sideTwo) * (perimeter - sideThree));
	
	
	System.out.printf("Perimeter = %.2f%n ", perimeter);
	System.out.printf("Area = %.2f%n ", area);
 }
}

Psuedocode
1.Input three numbers for triangle
2.Calculate the perimeter (side1 + side2 + side3)
3.Calculating the area (subtract each side from perimeter and multiply the answers from perimeter)
4.Print out the output.

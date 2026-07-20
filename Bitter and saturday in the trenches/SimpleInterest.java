
//

	import java.util.Scanner;

	public class SimpleInterest{
	public static void main(String[]args){

// Creating scanner to obtain input from command line

	Scanner input = new Scanner(System.in);
	System.out.print("Enter principal amount: ");
	double principalAmount = input.nextdouble();
	System.out.print("Enter rate: ");
	double rate = input.nextdouble();
	System.out.print("Enter year: ");
	int year = input.nextInt();

	double principalAmount1 = principalAmount;
	double rate1 = rate;
	int year1 = year;
	int simpleInterest =(principal * rate * time)/100;
	System.out.printf("simple Interest %f%n ",simpleInterest);
} // end of main method.
 } // end of class.


//

	import java.util.Scanner;

	public class Simple{
	public static void main(String[]args){

// Creating scanner to obtain input from command line

	Scanner input = new Scanner(System.in);
	System.out.print("Enter principal: ");
	double principal = input.nextDouble();
	System.out.print("Enter rate: ");
	double rate = input.nextDouble();
	System.out.print("Enter year: ");
	double year = input.nextDouble();

	double principalAmount1 = principal;
	double rate1 = rate;
	double year1 = year;

	double Interest =(principal * rate * year)/100;
	System.out.printf("Interest %f%n ",+ Interest);
} // end of main method.
 } // end of class.

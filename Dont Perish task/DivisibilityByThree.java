import java.util.Scanner;
public class DivisibilityByThree {
public static void main (String [] args) {
Scanner input = new Scanner (System.in);

	System.out.print("Enter number: ");
	int number = input.nextInt();
	boolean divisibleResult = divisibilityByThree(number);

	System.out.print(divisibleResult);
	}

		public static boolean divisibilityByThree(int number) {

		if (number % 3==0) {
		return true;
		} else {
		return false;
		}
	}
}
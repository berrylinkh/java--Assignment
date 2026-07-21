import java.util.Scanner;
public class AbsoluteValue {
public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number: ");
	int numberInput = input.nextInt();

	int absoluteResult = absoluteValue(numberInput);

		System.out.print(absoluteResult); 
	}

		public static int absoluteValue (int x) {
		 if (x >= 0) {
			return x;
		} else {
		   return -x;
		}
	}
}
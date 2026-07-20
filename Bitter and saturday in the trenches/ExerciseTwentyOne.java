// Exercise 21

/*
1.Declare and initialize variable for counter and number
2. use while loop to print 5 user number 
3. Calculate total
4. print out result

*/
import java.util.Scanner;
	public class ExerciseTwentyOne{
		public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

			int counter =0;
			int total =0;

		//System.out.print("Enter number: ");
		//int One = input.nextInt();
	
		while(counter <1) {
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		counter++;
		}
		total = total + counter;
		System.out.printf("Total: %d ", total);
	}
}



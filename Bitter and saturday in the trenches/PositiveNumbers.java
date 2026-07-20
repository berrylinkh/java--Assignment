/* PSUEDOCODE FOR POSITIVE SUM AND AVERAGE
1 START
2. IMPORT SCANNER
3. CREATE A CLASS AND A MAIN METHOD
4. DECLARE AND INITIALIZE TOTAL AND COUNTER VARIABLE
5. COLLECT USER INPUT UTIL NEGATIVE NUMBER IS INPUTED TO STOP
6. INITIAL WHILE LOOP TO COLLECT THE TOTAL SUM 
7. CLOSE LOOP AND DECLARE YOUR AVERAGE
8. DISPLAY THE RESULT AT THE PROGRAM.
9. END */



import java.util.Scanner;
	public class PositiveNumbers{
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in); 

		
		int totalSum = 0;
		int collector =0;

		System.out.print("Enter positive number: ");
		int positiveNumber = input.nextInt();

		while( positiveNumber >= 0) {
		totalSum = totalSum + positiveNumber;
		collector = collector + 1;

		System.out.print("Enter positive number ");
		positiveNumber = input.nextInt();
		
		}

		double average = totalSum / collector;

		System.out.printf("Total sum of positive number =%d%n ", totalSum);
		System.out.printf("The average number =%.2f ", average);
	}
}
/*Psuedocode
   1. Start
   2. use while loop to print number from 1-12
   3. initialise variable for counter, numbers and multiply
   4.condition the loop to print numbers that is the multiple of 5
   5. print out result
   6. End
*/

	public class MultiplicationOfFive{
	public static void main (String [] args) {

		int number = 5;

	for(int multiply = 1; multiply<=12; multiply ++) {
	
	int multiple = number * multiply;

	System.out.printf(" %d * %d = %d%n ", number, multiply, multiple);

		}
	}
}
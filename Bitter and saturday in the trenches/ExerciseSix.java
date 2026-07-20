// Exercise 6

/*
1.Declare and initialize variable for counter and number
2. use for loop to print square of the number between 1-20
3. print out result

*/

	public class ExerciseSix {
		public static void main (String [] args) {

		int number = 1;
		int square = 1;

		for(int counter = 1; counter <=20; counter++) {
			square = counter * counter;
			System.out.printf(" number: %d\t Sqaure:%d%n",   number, square , counter);
		}
	}
}
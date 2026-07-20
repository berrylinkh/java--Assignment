// Exercise 20

/*
1.Declare and initialize variable for counter and number
2. use while loop to print multiplication of 12
3. print out result

*/

	public class ExerciseTwenty {
		public static void main (String [] args) {

			int counter =1;
			int multiply =0;
			int number =12;

			
		while(counter <=12) {
		multiply = number * counter;
		System.out.printf("%d * %d =%d%n ", number, counter, multiply);
		counter++;
		}
	}
}



// Exercise 35
/*
1.Declare and initialize variable counter
2. use do while loop to print multiplication table of 5
3. print out result

*/



	public class ExerciseThirtyFive{
	public static void main (String [] args) {

		
	int number = 5;
	int counter = 1;
	
	do{
		System.out.printf("5 * %d = %d%n ", number, counter);
		counter++;
	}
	while (counter <=12);
		
		
	
	}
}
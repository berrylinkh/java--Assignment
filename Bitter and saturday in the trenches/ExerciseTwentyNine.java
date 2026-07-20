// Exercise 29
/*
1.Declare and initialize variable for counter and number
2. use for loop to print 1 -200 skipping of multiple of 6
3. print out result

*/



	public class ExerciseTwentyNine{
	public static void main (String [] args) {

		
	int counter = 1;	
	int number = 1;
	
	while (counter <= 200){
		if(counter % 6 != 0){
		System.out.printf(" %d ", counter);
	} 
	
	counter++;
	}
	
}
}
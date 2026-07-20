// Exercise 30
/*
1.Declare and initialize variable for counter and total
2. use for loop to print the total of number in between 1 -100 
3. print out result

*/



	public class ExerciseThirty{
	public static void main (String [] args) {

		
	int counter = 2;	
	int total= 0;
	
	while (counter <100){
	total +=1;
	counter++;
		
	} 
	
	System.out.printf(" Total: %d ", total);
}
}
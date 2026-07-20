// Exercise 25

/*
1.Declare and initialize variable for counter and number
2. use while loop to print multiple of 8 between 1 -200 
3. print out result

*/

public class ExerciseTwentyFive{
	public static void main(String[] args){
		
	int counter = 1;	
	int number = 1;
	
	while (counter <= 200){
		if(counter % 8 == 0){
		System.out.printf(" %d ", counter);
		}
		
		counter++;

	}
	}
}



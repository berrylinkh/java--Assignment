// Assignment 3

/*1. use while loop to print number from 1-50
2. initialise variable for counter, numbers and multiply
3.condition the loop to print numbers that is the multiple of 3
4. print out result
*/

public class MultipleTask{
	public static void main(String[] args){
		
		int counter = 3;
		int number = 1;
	
	while(counter <=50){
	counter = number * counter;
	System.out.printf("Numbers: %d%n", counter);

		counter +=3;
	}

	}
}



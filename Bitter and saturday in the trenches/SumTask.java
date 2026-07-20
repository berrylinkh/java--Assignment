// Assignment 8

/*1. use while loop to print number from 1-50
2. initialise variable for counter that sum number 1 to 50
3.condition the loop to print numbers
*/

public class ProductTask{
	public static void main(String[] args){
		
		int counter = 1;
		int sum = 0;
	
	while(counter <=50){
	sum = sum + counter;
	System.out.printf("Sum: %d%n", sum);

		counter ++;
	}

	}
}



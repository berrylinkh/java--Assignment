// Assignment 8

/*1. use while loop to print number from 1-10
2. initialise variable for counter that multiply total product from 1 to 10
3.condition the loop to print numbers
*/

public class ProductTask{
	public static void main(String[] args){
		
		int counter = 1;
		int totalProduct = 1;
		int number = 1;
	
	while(counter <=10){
	totalProduct = totalProduct * counter;
	System.out.printf(" %d%n", totalProduct);

		counter ++;
	}

	}
}



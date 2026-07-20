// Assignment 3

/*1. use while loop to print number from 1-20
2. initialise variable for counter
3.condition the loop to square numbers
4. print out result
*/

public class SquareTask{
	public static void main(String[] args){
		
		int counter = 1;
	
	while(counter <=20){
	int square = counter * counter;
	System.out.printf("Number: %d\t Square: %d%n", counter, square);

		counter ++;
	}

	}
}



// Assignment 11

/*1. use while loop to print number from 1-12
2. initialise variable for counter, numbers and multiply
3.condition the loop to print numbers that is the multiple of 3
4. print out result
*/

public class MultiTableTask{
	public static void main(String[] args){
		
		int number = 9;
	
	for (int counter = 1; counter <= 12; counter ++){
	int multiply = number * counter;
	System.out.printf(" %d * %d = %d%n ", number , counter,  multiply);
	}

	}
}



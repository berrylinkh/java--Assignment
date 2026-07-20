// Question 4.31

/*
1 input five digit prompt
2 use % to get last digit
3 use division and modulo for first to last digit
3 print the result
*/

import java.util.Scanner;

	public class Palindromes{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	 
	System.out.print("Enter five digits: ");
	int numbers =input.nextInt();

	int fifth = numbers % 10;
	int forth = (numbers / 10) % 10;
	int third = (numbers / 100) % 10;
	int second = (numbers / 1000) % 10;
	int first = (numbers / 10000) % 10;

	if(first == fifth && second == forth){
	System.out.printf(" palindromes %d%d%d%d%d", numbers);
}
	else{
		System.out.printf("Display error");
	}

	}
}

// Question 4.31

/*
1 input one prompt
2 convert the number to kilogram 
3 print the result
*/

import java.util.Scanner;

	public class Palindromes{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	 
	System.out.print("Numbers: ");
	int numbers =input.nextInt();

	int fifth = numbers % 10;
	int forth = (numbers / 10) % 10;
	int third = (numbers / 100)( % 10;
	int second = (numbers / 1000) % 10;
	int first = (numbers / 10000) % 10;

	if(numbers == palindromes){
	System.out.printf("palindromes:%d%d%d%d%d fifth +""+forth +""+third +""+second +""+first ", fifth, forth, third, second, first);
	else (numbers != palindromes);
	System.out.printf("Display error")
	}

}


// psuedocode 18
/* 	Start
	import a scanner
	create a class 
	create a main method 
	Enter a student score grade over fifty
	multiply scoregrade by two and divide it by hundred 
	print out the result 
	End.
*/

import java.util.Scanner;
	
	public class Eighteen{
	public static void main(String[]args){

		int scoreGrade = 37;
		int totalScore = 50;
		int grade = (scoreGrade * 2)% 100;
					
		
		System.out.printf(" Grade %d/100", grade);
	

	}
}
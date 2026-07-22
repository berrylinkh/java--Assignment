/*  	1.START
	2. IMPORT SCANNER CLASS FROM JAVA UTIL. FOR INPUT COLLECTION	
	3. CREATE A CLASS FILE AND NAME
	4. CREATE THE MAIN METHOD
	5. COLLECT TWO INPUT FROM THE USER FOR FIRSTNUMBER AND SECOND NUMBER
    	6. DECLARE AND INITIALISE A VARIABLE FOR THE SMALLEST RESULT
    	7. DISPLAY RESULT 
	8. END MAIN METHOD
	9. CREATE ANOTHER METHOD INTO MY CLASS FOR SMALLEST OF TWO NUMBER
	10. RETURN THE VALUE OF SMALLEST USING THE IF STATEMENT
	11. END METHOD */


import java.util.Scanner;
public class NumberForteen {
public static void main (String [] args) {
Scanner input = new Scanner(System.in);

	System.out.print("Enter integer one: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter integer two: ");
	int secondNumber = input.nextInt();

	int numberResult = smallest(firstNumber, secondNumber);

	System.out.print( "The smallest number is: " + numberResult);

		}

	public static int smallest(int numberOne, int numberTwo){
	int number=0;
	if (numberOne < numberTwo) {
	return numberTwo;
} else {
	return numberOne;
		}
	}
}
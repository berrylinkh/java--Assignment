/*  	1.START
	2. IMPORT SCANNER CLASS FROM JAVA UTIL. FOR INPUT COLLECTION	
	3. CREATE A CLASS FILE AND NAME
	4. CREATE THE MAIN METHOD
	5. COLLECT TWO INPUT FROM THE USER FOR FIRSTNUMBER AND SECOND NUMBER
    	6. DECLARE AND INITIALISE A VARIABLE FOR THE LARGEST RESULT
    	7. DISPLAY RESULT 
	8. END MAIN METHOD
	9. CREATE ANOTHER METHOD INTO MY CLASS FOR LARGEST OF TWO NUMBER
	10. RETURN THE  VALUE OF LARGEST USING IF STATEMENT
	11. END METHOD */


import java.util.Scanner;
public class NumberThirteen {
public static void main (String [] args) {
Scanner input = new Scanner(System.in);

	System.out.print("Enter integer one: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter integer two: ");
	int secondNumber = input.nextInt();

	int numberResult = largest(firstNumber, secondNumber);

	System.out.print( "The largest number is: " + numberResult);

		}

	public static int largest(int numberOne, int numberTwo){
	int number=0;
	if (numberOne > numberTwo) {
	return numberOne;
} else {
	return numberTwo;
		}
	}
}
/*  	1.START
	2. IMPORT SCANNER CLASS FROM JAVA UTIL. FOR INPUT COLLECTION	
	3. CREATE A CLASS FILE AND NAME
	4. CREATE THE MAIN METHOD
	5. COLLECT AN INPUT FROM THE USER FOR FIRSTNUMBER AND SECOND NUMBER
    	6. DECLARE AND INITIALISE A VARIABLE FOR THE ABSOLUTE RESULT
    	7. DISPLAY RESULT 
	8. END MAIN METHOD
	9. CREATE ANOTHER METHOD INTO MY CLASS FOR ABSOLUTE OF TWO NUMBER
	10. RETURN THE VALUE OF THE ABSOLUTE  USING THE IF CONDITION STATEMENT:
	11. END METHOD */

import java.util.Scanner;
public class NumberFour {
public static void main (String [] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter number: ");
	int numberInput = input.nextInt();

	int absoluteResult = absoluteValue(numberInput);

		System.out.print(absoluteResult); 
	}

		public static int absoluteValue (int x) {
		 if (x >= 0) {
			return x;
		} else {
		   return -x;
		}
	}
}
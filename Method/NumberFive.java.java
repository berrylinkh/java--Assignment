/*  	1.START
	2. IMPORT SCANNER CLASS FROM JAVA UTIL. FOR INPUT COLLECTION	
	3. CREATE A CLASS FILE AND NAME
	4. CREATE THE MAIN METHOD
	5. COLLECT TWO INPUT FROM THE USER FOR FIRSTNUMBER AND SECOND NUMBER
    	6. DECLARE AND INITIALISE A VARIABLE FOR THE ADD RESULT
    	7. DISPLAY RESULT 
	8. END MAIN METHOD
	9. CREATE ANOTHER METHOD INTO MY CLASS FOR DIVISIBLE OF TWO NUMBER
	10. RETURN THE CALCULATED VALUE USING THIS DIVISIBILITY BY THREE:
	 TURE / FALSE
	11. END METHOD */


import java.util.Scanner;
public class NumberFive {
public static void main (String [] args) {
Scanner input = new Scanner (System.in);

	System.out.print("Enter number: ");
	int number = input.nextInt();
	boolean divisibleResult = divisibilityByThree(number);

	System.out.print(divisibleResult);
	}

		public static boolean divisibilityByThree(int number) {

		if (number % 3==0) {
		return true;
		} else {
		return false;
		}
	}
}
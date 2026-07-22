/*  	1.START
	2. CREATE A CLASS FILE AND NAME
	3. CREATE THE MAIN METHOD
	4. COLLECT TWO INPUT FROM THE USER FOR FIRSTNUMBER AND SECOND NUMBER
    	6. DECLARE AND INITIALISE A VARIABLE FOR THE ADD RESULT
    	7. DISPLAY RESULT 
	8. END MAIN METHOD
	9. CREATE ANOTHER METHOD INTO MY CLASS FOR HALVING OF TWO NUMBER
	10. RETURN THE CALCULATED VALUE OF HALVING USING THIS FORMULA:
	 (D / 2 )
	11. END METHOD */

public class NumberThree {
public static void main (String [] args) {
	int divisionResult = halvingNumber(78);

	System.out.print(divisionResult);
	}

		public static int halvingNumber (int d) {
		int division = d / 2;
		return division;
	}
}
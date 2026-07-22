/*  	1.START
	2. IMPORT SCANNER CLASS FROM JAVA UTIL. FOR INPUT COLLECTION	
	3. CREATE A CLASS FILE AND NAME
	4. CREATE THE MAIN METHOD
	5. COLLECT AN INPUT FROM THE USER FOR TEMPERATURE
    	6. DECLARE AND INITIALISE A VARIABLE FOR THE FAHRENHEIT RESULT
    	7. DISPLAY RESULT 
	8. END MAIN METHOD
	9. CREATE ANOTHER METHOD INTO MY CLASS FOR CELSUIS TO FAHRENHEIT
	10. DECLARE AND INITIALISE A VARIABLE FOR THE FAHRENHEIT
	10. RETURN THE CALCULATED VALUE OF SUM USING THIS FORMULA:
	 (CELSUIS * 1.8 ) + 32
	11. END METHOD */

import java.util.Scanner;
public class NumberSix {
public static void main (String [] args) {
Scanner input = new Scanner(System.in);

	System.out.print("Enter temperature: ");
	int celsuis = input.nextInt();

	int fahrenheitResult = celsuisToFahrenheit(celsuis);

	System.out.print( fahrenheitResult);

		}

	public static int celsuisToFahrenheit(int F){
	int fahrenheit = (celsuis * 1.8) +32;
	return fahrenheit;
	}
}
/* PSUEDOCODE FOR CORRESPONDING TELEPHONE
1 START
2. IMPORT SCANNER
3. CREATE A CLASS AND A MAIN METHOD
4. DECLARE AND INITIALIZE TOTAL AND COUNTER VARIABLE
5. COLLECT USER INPUT UTIL NEGATIVE NUMBER IS INPUTED TO STOP
6. CREATE THE SWITCH AND CASE
7. DISPLAY THE RESULT AT THE PROGRAM.
8. END */



import java.util.Scanner;
	public class Telephone{
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter letter: ");
		String letter = input.nextLine();
		String number = " ";
		System.out.print("Telephone number is: ");
		
	
	switch(letter) {

		case "a":  System.out.println(number ="2"); break;
		case "b":  System.out.println(number ="2"); break;
		case "c":  System.out.println(number ="2"); break;

		case "d":  System.out.println(number ="3"); break;
		case "e":  System.out.println(number ="3"); break;
		case "f":  System.out.println(number ="3"); break;

		case "g":  System.out.println(number ="4"); break;
		case "h":  System.out.println(number ="4"); break;
		case "i":  System.out.println(number ="4"); break;
	
		case "j":  System.out.println(number ="5"); break;
		case "k":  System.out.println(number ="5"); break;
		case "l":  System.out.println(number ="5"); break;

		case "m":  System.out.println(number ="6"); break;
		case "n":  System.out.println(number ="6"); break;
		case "o":  System.out.println(number ="6"); break;

		case "p":  System.out.println(number ="7"); break;
		case "q":  System.out.println(number ="7"); break;
		case "r":  System.out.println(number ="7"); break;
		case "s":  System.out.println(number ="7"); break;

		case "t":  System.out.println(number ="8"); break;
		case "u":  System.out.println(number ="8"); break;
		case "v":  System.out.println(number ="8"); break;

		case "w":  System.out.println(number = "9"); break;
		case "x":  System.out.println(number = "9"); break;
		case "y":  System.out.println(number = "9"); break;
		case "z":  System.out.println(number = "9"); break;

		default:System.out.println("Invalid out"); break;
	
		}

	}
}
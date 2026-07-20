
// Getting the cube, product and remainder.

import java.util.Scanner;

public class Multiple{
public static void main(String[]args){

// Creating scanner to obtain input from command line
Scanner input = new Scanner(System.in);
System.out.print("Enter number1: "); // prompt
int number1 = input.nextInt();
System.out.print("Enter number2: "); // prompt
int number2 = input.nextInt();

// Calculating the square and cube
int squared = number1 * number1;
int cubed = number2 * number2 * number2;
System.out.printf(" squared = %d%n", squared);
System.out.printf(" cubed= %d%n", cubed);

if( squared % cubed == 0){
System.out.printf(" true ");
}
if(squared % cubed != 0){
System.out.printf("false ");
}
         
} // end of main method.

 } // end of class.


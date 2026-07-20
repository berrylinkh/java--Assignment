
// Getting the cube, product and remainder.

import java.util.Scanner;

public class Divisible{
public static void main(String[]args){

// Creating scanner to obtain input from command line
Scanner input = new Scanner(System.in);
System.out.print("Enter number: "); // prompt
int number = input.nextInt();


// Calculating the remainder
int division = number / 7;
int remainder = number  %  7;
System.out.printf(" remainder = %d%n", remainder);

if(number % 7 == 0){
System.out.printf("it is divisible ");
}
if(number % 7 != 0){
System.out.printf("it is not divisible ");
}
         
} // end of main method.

 } // end of class.


Pseudocode 
1. Input number from user.
2. Divide the number by 7
3. make a statement of if is divisible by 7  equal to zero or not.

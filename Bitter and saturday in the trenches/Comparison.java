
// Getting the cube, product and remainder.

import java.util.Scanner;

public class Comparison{
public static void main(String[]args){

// Creating scanner to obtain input from command line
Scanner input = new Scanner(System.in);
System.out.print("User number "); // prompt
int number = input.nextInt(); // read first number from user


// Calculating the cube
int cube = number * number * number;

if(number > 500){
System.out.printf(" number is greater %n");
}

if(number < 500){
System.out.printf("number is less %n ");
}

if(cube  > 500){
System.out.printf("cube is greater %n ");
}

if(cube < 500){
System.out.printf("cube is less %n");
}  
     
} // end of main method.
 } // end of class comparison.

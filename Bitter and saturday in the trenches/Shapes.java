
// Getting the cube, product and remainder.

import java.util.Scanner;

public class Shapes{
public static void main(String[]args){

// Creating scanner to obtain input from command line
Scanner input = new Scanner(System.in);
System.out.print("Enter length: "); // prompt
int length = input.nextInt();
System.out.print("Enter width: "); // prompt
int width = input.nextInt();

// Calculating the perimeter , area and diagonal
int perimeter = 2 * (length + width);
int area = length * width;
double diagonal = 1.41421 * length * length + width * width;

System.out.printf(" perimeter:  %d%n", perimeter);
System.out.printf("area: %d%n", area );
System.out.printf("digonal: %f%n",diagonal);
         
} // end of main method.

 } // end of class.


pseudocode

1. generate 2 input from the user
2. calculate my perimeter
3. calculate the area
4. calculate the digonal using 1.41421 and a float placeholder
5. print out result to display on the terminal.
`


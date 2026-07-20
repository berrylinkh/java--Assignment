
// Getting the cube, product and remainder.

import java.util.Scanner;

public class Smallest{
public static void main(String[]args){

	// Creating scanner to obtain input from command line
Scanner input = new Scanner(System.in);
System.out.print("User num1 "); // prompt
int num1 = input.nextInt(); // read first number from user
System.out.print("User num2 "); // prompt
int num2 = input.nextInt(); // read third number from user
System.out.print("User num3 "); // prompt
int num3 = input.nextInt(); // read forth number from user
System.out.print("User num4 "); // prompt
int num4 = input.nextInt(); // read fifth number from user


	// Calculating the sum, average, product , smallest and largst

int sum = num1+num2+num3+num4;
int average = sum/2;
int product =  sum*2;
System.out.printf("sum = %d%n ", sum);
System.out.printf("average = %d%n ", average);
System.out.printf("product = %d%n ", product);

if(num1 > num2  && num1 > num3  && num1 >  num4){
System.out.printf("num1 is largest %n");
}  
if(num2 > num1 && num2 > num3 && num2 >  num4){
System.out.printf("num2 is largest %n");
}  
if(num3 > num1 && num3 > num2 && num3 >  num4){
System.out.printf("num3 is largest %n");
}  
if(num4 > num1 && num4 > num2 && num4 >  num3){
System.out.printf("num4 is largest %n");
}  
if(num1 < num2 && num1 < num3 && num1 <  num4){
System.out.printf("num1 is smallest %n");
}  
if(num2 < num1 && num2 < num3 && num2 <  num4){
System.out.printf("num2 is smallest %n");
} 
if(num3 < num1 && num3 < num2 && num3 < num4){
System.out.printf("num3 is smallest %n");
} 
if(num4 < num1 && num4 < num2 && num4 < num3){
System.out.printf("num4 is smallest %n");
} 
     
} // end of main method.
 } // end of class smallest and largest.

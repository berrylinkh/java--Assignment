
// Getting the cube, product and remainder.

import java.util.Scanner;

public class SmallestLargest{
public static void main(String[]args){

// Creating scanner to obtain input from command line

Scanner input = new Scanner(System.in);
System.out.print("User num1 ");
int num1 = input.nextInt(); 
System.out.print("User num2 ");
int num2 = input.nextInt(); 
System.out.print("User num3 ");
int num3 = input.nextInt(); 

System.out.print("User num4 ");
int num4 = input.nextInt(); 
System.out.print("User num5 ");
int num5 = input.nextInt(); 
System.out.print("User num6 ");
int num6 = input.nextInt(); 

// examine the smallest and largst

if(num1 > num2  && num1 > num3  && num1 >  num4 && num1 > num5 && num1 > num6){
System.out.printf("num1 is largest %n");
}  
if(num2 > num1 && num2 > num3 && num2 >  num4 && num2 > num5 && num2 > num6){
System.out.printf("num2 is largest %n");
}  
if(num3 > num1 && num3 > num2 && num3 >  num4 && num3 > num5 && num3 > num6){
System.out.printf("num3 is largest %n");
}  
if(num4 > num1 && num4 > num2 && num4 >  num3 && num4 > num5 && num4 > num6){
System.out.printf("num4 is largest %n");
} 
if(num5 > num1 && num5 > num2 && num5 >  num3 && num5 > num4 && num5 > num6){
System.out.printf("num4 is largest %n");
}
if(num6 > num1 && num6 > num2 && num6 >  num3 && num6 > num4 && num6 > num5){
System.out.printf("num4 is largest %n");
} 
if(num1 < num2 && num1 < num3 && num1 <  num4 && num1 < num5 && num1 < num6){
System.out.printf("num1 is smallest %n");
}  
if(num2 < num1 && num2 < num3 && num2 <  num4 && num2 < num5 && num2 < num6){
System.out.printf("num2 is smallest %n");
} 
if(num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5 && num3 < num6){
System.out.printf("num3 is smallest %n");
} 
if(num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5 && num4 < num6){
System.out.printf("num4 is smallest %n");
} 
if(num5 < num1 && num5 < num2 && num5 <  num3 && num5 < num4 && num5 < num6){
System.out.printf("num5 is smallest %n");
}
if(num6 < num1 && num6 < num2 && num6 <  num3 && num6 < num4 && num6 < num5){
System.out.printf("num6 is smallest %n");
} 
   
} // end of main method.
 } // end of class smallest and largest.

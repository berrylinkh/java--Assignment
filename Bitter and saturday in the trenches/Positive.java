
// Getting four digit from the user  

import java.util.Scanner;

public class Positive{
public static void main(String[]args){

// Creating scanner to obtain input from command line

Scanner input = new Scanner(System.in);
System.out.print("Enter num1 ");
int num1 = input.nextInt();
System.out.print("Enter num2 ");
int num2 = input.nextInt();
System.out.print("Enter num3 "); 
int num3 = input.nextInt();
System.out.print("Enter num4 ");
int num4 = input.nextInt();
System.out.print("Enter num5 ");
int num5 = input.nextInt();
System.out.print("Enter num6 "); 
int num6 = input.nextInt(); 

int positive = 0;
int negative = 0;
int zero = 0;
int positiveSum = 0;
int negativeSum = 0;

if ( num1 > 0) { 
	positive = positive + 1;
	positiveSum = positiveSum + num1;
}
 if ( num1 < 0) { 
	negative = negative + 1;
	negativeSum = negativeSum + num1;	
}
if ( num1 == 0) { 
	zero = zero + 1;
}
if ( num2 > 0) { 
	positive = positive + 1;
	positiveSum = positiveSum + num2;
	
}
 if ( num2 < 0) { 
	negative = negative + 1;
	negativeSum = negativeSum + num2;
}
if ( num2 == 0) { 
	zero = zero + 1;
}
if ( num3 > 0) { 
	positive = positive + 1;
	positiveSum = positiveSum + num3;
}
 if ( num3 < 0) { 
	negative = negative + 1;
	negativeSum = negativeSum + num3;
}
if ( num3 == 0) { 
	zero = zero + 1;
}
if ( num4 > 0) { 
	positive = positive + 1;
	positiveSum = positiveSum + num4;
}
 if ( num4 < 0) { 
	negative = negative + 1;
	negativeSum = negativeSum + num4;
}
if ( num4 == 0) { 
	zero = zero + 1;
}
if ( num5 > 0) { 
	positive = positive + 1;
	positiveSum = positiveSum + num5;
}
 if ( num5 < 0) { 
	negative = negative + 1;
	negativeSum = negativeSum + num5;
}
if ( num5 == 0) { 
	zero = zero + 1;
}
if ( num6 > 0) { 
	positive = positive + 1;
	positiveSum = positiveSum + num6;
}
 if ( num6 < 0) { 
	negative = negative + 1;
	negativeSum = negativeSum + num6;
}
if ( num6 == 0) { 
	zero = zero + 1 ;
}

System.out.printf("positive = %d%n", positive);
System.out.printf("negative = %d%n", negative); 
System.out.printf("zero = %d%n", zero);
System.out.printf("sum of all positive num = %d%n", positiveSum);
System.out.printf("sum of all negative = %d%n", negativeSum);
} // end of main method.
 } // end of class.

psuedocode
1. collect six input
2. set positive and negative count as 0
3.set a positivesum and negativesum
4. make  a statement digit is positive or negative to count as 1
5. generate the sum of the positive and negative number.



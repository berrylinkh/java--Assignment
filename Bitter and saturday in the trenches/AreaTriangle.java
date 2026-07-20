// Question 2.19 

/*
1 collect the x and the y three times 
2 give them various varibles
2 calculate the three sides
3 using the answer for each side to calculate area
4 print the result
*/

import java.util.Scanner;

	public class AreaOfTriangle {
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter x1 and y1");
	double xOne = input.nextDouble();
	double yOne = input.nextDouble();

	System.out.print("Enter x2 and y2");
	double xTwo = input.nextDouble();
	double yTwo = input.nextDouble();

	System.out.print("Enter x3 and y3");
	double xThree = input.nextDouble();
	double yThree = input.nextDouble();

	double sideXOne = Math.pow (xTwo - xOne,2);
	double sideYOne = Math.pow(yTwo - yOne,2);
	double sideXTwo = Math.pow (xThree - xTwo,2);
	double sideYTwo = Math.pow(yThree - yTwo,2);
	double sideXThree = Math.pow(xOne - xThree,2);
	double sideYThree = Math.pow(yOne - yThree,2);
	
	
	double firstSide = Math.pow(sideXOne + sideYOne,0.5);
	double secondSide = Math.pow(sideXTwo + sideYTwo,0.5);
	double thirdSide = Math.pow(sideXThree + sideYThree,0.5);


	double sSquare = (firstSide + secondSide + thirdSide)/2;
	double area = Math.pow(sSquare * (sSquare - firstSide) * (sSquare - secondSide) * (sSquare - thirdSide), 0.5);
	
	
	System.out.printf("The area:%.2f%n ", area);

	}

}


// Question 2.19 

/*
1 collect the x and the y three times and give them various varibles
2 calculate each sides using the inputs
3 using the answer for each side calculate the s and then the area
4 print the result
*/

import java.util.Scanner;

	public class AreaOfTriangle {
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter x1 and y1: ");
			double xOne = input.nextDouble();
			double yOne = input.nextDouble();

			System.out.println("Enter x2 and y2: ");
			double xTwo = input.nextDouble();
			double yTwo = input.nextDouble();


			System.out.println("Enter x3 and y3: ");
			double xThree = input.nextDouble();
			double yThree = input.nextDouble();

			double a = Math.pow(xTwo - xOne, 2);
			double b = Math.pow(yTwo - yOne, 2);
			double c = Math.pow(xThree - xTwo, 2);
			double d = Math.pow(yThree - yTwo, 2);
			double e = Math.pow(xThree - xOne, 2);
			double f = Math.pow(yThree - yOne, 2);

			

			double sideOne = Math.pow(a + b, 0.5);
			double sideTwo = Math.pow(c + d, 0.5);
			double sideThree = Math.pow(e + f, 0.5);

			double s = (double)((sideOne + sideTwo + sideThree) / 2);
			double area = Math.pow(s * (s - sideOne) * (s - sideTwo) * (s - sideThree), 0.5);

			System.out.println("The area of the Triangle is " + area);
			
		}
	}
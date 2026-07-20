// psuedocode 15
/* 	Start
	import a scanner
	create a class 
	create a main method 
	collect an input that read the distance in miles 
	convert it to kilometer (1 mile = 1.603934 km)
	print both value.
	End.
*/

import java.util.Scanner;
	
	public class fifteen{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		System.out.print(" distance: ");
		double mile = input.nextDouble();
		
		double kilometer=  mile * 1.603934 ;
			
		
		System.out.printf("Mile: %f%n, kilometer: %f", mile , kilometer);
	}
}
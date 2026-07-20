/* 4.19 CREDII LIMIT CALCULATOR. 
START AN APPLICATION
INITIALISE A TOTAL TO 0
INPUT PRICE OF ITEM SOLD
ADD EACH ITEM PROGRAM TO THE TOTAL SALES
CONTINUE UNTIL THERE IS NO MORE SALES
CALCULATE THE COMMISSION 
CALCULATE THE EARNINGS
DISPLAY WEEKLY EARNINGS
END PROGRAM */

import java.util.Scanner;
	public class Sale{
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);
	double earnings = 0;
	double total = 0;
	
	System.out.println("Enter item price or use -1 to quit ");
	double value = input.nextDouble();

	while(value != -1){
	System.out.println("Enter item price or use -1 to quit ");
	value = input.nextDouble();		

	total = total + value; 
	double percentagePay = (double)value * (9 / 100);
	earnings = 200 + percentagePay;
	

	
	}
	System.out.printf("Total earnings : %.2f", earnings );
   }
}

	


	
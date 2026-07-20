/* 4.18 CREDII LIMIT CALCULATOR. 
IMPUT ACCOUNT NUMBER
BALANCE AT THE BEGINNG OF THE MONTH
TOTAL OF ALL THE IEMS CHARGED BY HE CUSTOMER THTS MONTH 
TOTAL OF ALL CREDIT APPLED TO THE CUSTOMNER ACCOUNT THIS MONTH
ALLOW CREDIT LIMIT.
COLLECT ALL THESE FACTORS AS INTEGER
CALCULATE NEW BALANCE (= BEGINING BALANE +CHARGE - CREDITS)
DISPLAY "CREDIT LIMIT IS EXCEEDED" */

import java.util.Scanner;
	public class Credit{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter account number: ");
	int account = input.nextInt();
	
	System.out.print("Beginning of the month balance: ");
	int beginningBalance = input.nextInt();
	
	System.out.print("Total item charged: ");
	int charges = input.nextInt();
	
	System.out.print("Credits applied to customer this month: ");
	int credits = input.nextInt();
	
	System.out.print("Credit limit: ");
	int creditLimit = input.nextInt();

	int newBalance = (int)beginningBalance + charges - credits;
	System.out.printf("The new balance is %d%n ", newBalance);

	if(newBalance > creditLimit){
	System.out.println("Credit limit exceeded");
	}
    }
}

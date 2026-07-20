// psuedocode 20
/* 	Start
	create a class 
	create a main method 
	declare a data type 'double' with the variable name 'balance' 
	initialized the variable with the value'5000.00'
	declare and initialized the variable for deposit '1200.50'
	declare and initialized the variable for withdraws '750.25'
	declare and initialized the variable monthly interest of 1.5%
	print the final balance.
	End.
*/
	
	public class Twenty{
	public static void main(String[]args){


		double balance = 5000.00;
		double deposit =1200.00;
		double withdrawal =750.25;
		double monthlyInterest =1.5;
		
		balance = balance + deposit;
		withdrawal =balance - 750.25;
		monthlyInterest =balance * (1.5/100);
		double finalBalance = monthlyInterest;
		
		System.out.printf(" Final balance: %.2f",finalBalance );

	}
}
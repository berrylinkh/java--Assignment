
// psuedocode 29
/* 	Start
	import scanner
	create a class 
	create a main method 
	collect two input for username ('admin') and password('1234')
	use the if else grant or deny access
	print out the output
	End.
*/

 	import java.util.Scanner;
	
	public class TwentyNine{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		

	System.out.print("Username: ");
	String username = input.nextLine();

	System.out.print("Password: ");
	int password =input.nextInt();

	String admin = "admin";
	int adminPassword = 1234;

	if(username.equals(admin) && password ==adminPassword){
	System.out.println("Access granted");
	} else {
	System.out.println("Access Denied");
		}
	}
}
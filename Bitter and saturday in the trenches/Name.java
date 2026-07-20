// Greeting user with the inputted 

	import java.util.Scanner;
	public class Name{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first name: ");
	String FirstName = input.next();
	System.out.print("Enter last name: ");
	String LastName = input.next();
	
	System.out.printf("Hello %s %s%n ", FirstName , LastName);

} //main method close.
} // class ends.
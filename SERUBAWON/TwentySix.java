
// psuedocode 26
/* 	Start
	import scanner
	create a class 
	create a main method 
	collect two user input for name and age  
	use the if else chain to determine the 'child', 'teenage','adult' and 'senior'
	print out the output
	End.
*/

 	import java.util.Scanner;
	
	public class TwentySix{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		

	System.out.print("Name: ");
	String name = input.nextLine();

	System.out.print("Age: ");
	int age =input.nextInt();

		
	if(age < 13){
	System.out.println("child");
}
	else 
		if(age >= 13 && age <= 17) {
	System.out.println("Teenage");
}
	if(age >= 18 && age <= 64) {
	System.out.println("Adult");
}
else 
		if(age >= 65) {
	System.out.println("Senior" );
}
		}
}
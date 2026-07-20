
// psuedocode 27
/* 	Start
	import scanner
	create a class 
	create a main method 
	collect two user integer input 
	use the if else chain to determine the 'larger', smaller and equal to
	print out the output
	End.
*/

 	import java.util.Scanner;
	
	public class TwentySeven{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		

	System.out.print("number: ");
	int numberOne = input.nextInt();

	System.out.print("number: ");
	int numberTwo =input.nextInt();

		
	if(numberOne > numberTwo){
	System.out.println("numberone is larger and numbertwo is smaller");
}
	else 
		if(numberTwo > numberOne) {
	System.out.println("numbertwo is larger and numberone is smaller");
}
	if(numberOne == numberTwo) {
	System.out.println("numberone and numbertwo are equal");
}
		}
}
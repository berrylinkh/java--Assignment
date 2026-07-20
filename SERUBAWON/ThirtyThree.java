
// psuedocode 33
/* 	Start
	import scanner
	create a class 
	create a main method 
	collect three integer from user
	print out the largest without using math.max().
	End.
*/

 	import java.util.Scanner;
	
	public class ThirtyThree{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		

	System.out.print("Enter integer1: ");
	int numberOne = input.nextInt();

	System.out.print("Enter integer2: ");
	int numberTwo=input.nextInt();

	System.out.print("Enter integer3: ");
	int numberThree=input.nextInt();

	if(numberOne > numberTwo && numberOne > numberThree){
	System.out.println("largest is integer one");
	} 
	else if(numberTwo > numberThree && numberTwo > numberOne){
	System.out.println("largest is integer two");
}
	else {
		System.out.println("largest is integer three");
		}
	}
}
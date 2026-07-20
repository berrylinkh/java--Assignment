// psuedocode 29
/* 	Start
	import scanner
	create a class 
	create a main method 
	declare and initalise variable for each day of the week and day
	collect one input from the user
	allocate the inputted 'number%7' to 'day'
	use the if else condition variable for day to determine the days of the week
	print out the output
	End.
*/	

	import java.util.Scanner;
	public class Thirty{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		int monday =1;
		int tuesday =2;
		int wednesday =3;
		int thursday =4;
		int friday =5;
		int saturday =6;
		int sunday =7;

	System.out.print("Input number: ");
	int number = input.nextInt();
	int day = number % 7;
		
	if(day == 1){
	System.out.print("it will be monday");
}
	else 
		if(day == 2) {
	System.out.print("it will be tuesday");
}
	if(day == 3){
	System.out.print("it will be wednesday");
}
	else 
		if(day == 4) {
	System.out.print("it will be thursday");
}
	if(day == 5){
	System.out.print("it will be friday");
}
	else 
		if(day == 6) {
	System.out.print("it will be saturday");
}
	if(day == 0){
	System.out.print("it will be sunday");
}
	}
}
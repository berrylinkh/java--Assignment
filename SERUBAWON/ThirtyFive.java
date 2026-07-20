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
	public class ThirtyFive{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

		int january =1;
		int feburary =2;
		int march =3;
		int april =4;
		int may =5;
		int june =6;
		int July =7;
		int august =8;
		int september =9;
		int ocotober =10;
		int november =11;
		int december =12;

	System.out.print("Input number: ");
	int number = input.nextInt();
	int month= number % 12;
		
	if(month == 1){
	System.out.print("it will be january");
}
	else 
		if(month == 2) {
	System.out.print("it will be feburary");
}
	if(month == 3){
	System.out.print("it will be march");
}
	else 
		if(month == 4) {
	System.out.print("it will be april");
}
	if(month == 5){
	System.out.print("it will be may");
}
	else 
		if(month == 6) {
	System.out.print("it will be june");
}
	if(month == 7){
	System.out.print("it will be july");
}
		if(month == 8){
	System.out.print("it will be august");
}
	else 
		if(month == 9) {
	System.out.print("it will be september");
}
	if(month == 10){
	System.out.print("it will be october");
}
	else 
		if(month == 11) {
	System.out.print("it will be november");
	}
	if(month == 0){
	System.out.print("it will be december");
} 	
	System.out.print("Input current year: ");
	int year = input.nextInt();

	if (year % 4 ==0 && year % 100 !=0 || year % 400 ==0){
	System.out.printf("%d will be next leap year", year);
	}
}

}
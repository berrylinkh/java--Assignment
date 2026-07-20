// psuedocode 23
/* 	Start
	import scanner
	create a class 
	create a main method 
	collect a user input for score
	initialised a loop the count a score from 0-100
	write an if/else chain statement to print out grade:
	A(90-100), B(80-89), C(70-79), D(60-69), F(below 60).
	print out the output
	End.
*/
	
	import java.util.Scanner;
	public class TwentyThree{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	for(int count=0; count <=100; count++){	
	System.out.print("Enter score");
	int score =input.nextInt();
				
		
if(score >= 90){		
		System.out.print(" Grade: A\n" );
} else if( score >= 80 && score <= 89){
		System.out.print(" Grade: B\n" );
}
if(score >= 70 && score <= 79){		
		System.out.print(" Grade: C\n" );
} else if( score >= 60 && score <= 69){
		System.out.print(" Grade: D\n" );
}
if(score <= 60){		
		System.out.print(" Grade: F\n" );
}

	 }

	}
}
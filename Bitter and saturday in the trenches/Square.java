  import java.util.Scanner;          
    public class Square{
         public static void main(String[]args){  
	  Scanner input = new Scanner(System.in);
	System.out.print("Enter number 1");
	   int number1 = input.nextInt();
	    int Square1 = number1*number1;
	System.out.print("Enter number 2");
	   int number2 = input.nextInt();
	    int Square2 = number2 *number2;
	     int sum = Square1 + Square2;
	      int minus = Square1 - Square2; 
	System.out.printf("sum is %d %n", sum);
	System.out.printf("minus is %d %n", minus);	
  
    } 
}
 	

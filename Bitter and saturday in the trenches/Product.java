  import java.util.Scanner;          
    public class Product{
         public static void main(String[]args){  
	  Scanner input = new Scanner(System.in);

	System.out.print("Enter number 1");
	   int number1 = input.nextInt();

	System.out.print("Enter number 2");
	   int number2 = input.nextInt();

	System.out.print("Enter number 3");
	   int number3 = input.nextInt();
	    int sum = number1 + number2 + number3;
	int average =(int)(number1 / number2 / number3);
	int product =(int)(number1 * number2 * number3);
	
if(number1 > number2 && number1 > number3) {
System.out.printf("sum = %d%n average = %d%n product = %d%n largest %d%n smallest %d%n", sum , average , product , number1 , number3 );
}
if(number3 < number1 && number3 < number2) {
System.out.printf("sum = %d%n average = %d%n product = %d%n largest %d%n smallest %d%n", sum , average , product , number1 , number3 );
}
  
    } 
}
 	

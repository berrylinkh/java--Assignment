  import java.util.Scanner;          
    public class SquareOne{
         public static void main(String[]args){  
	  Scanner input = new Scanner(System.in);
	System.out.print("Enter number 1");
	   int number1 = input.nextInt();
	    int Square1 = number1*number1;
	if(Square1 > 100) {
	System.out.printf("square is great");
}
	if(Square1 == 100) {
	System.out.printf("square is equal");
}
	if(Square1 < 100) {
	System.out.printf("square is less");
}
	if(Square1 != 100) {
	System.out.printf("square is not equal");
}



  
    } 
}
 	

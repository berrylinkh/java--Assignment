// calculating of area 

	import java.util.Scanner;
	public class Rectangle{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number: ");
	int number = input.nextInt();

	int even = number/ 2 % 0;
	int odd = number / 2 % 1;
	
	if(number / 2 == 0){ 
		System.out.print("number is even");
}
	if(number/2 != 0){ 
		System.out.print("number is odd");
}


} //main method close.
} // class ends.
// calculating of even and odd number 

	import java.util.Scanner;
	public class Record{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number: ");
	int number = input.nextInt();

	int even = number % 2;
	int odd = number % 2;
	
	if(number % 2 == 0){ 
		System.out.print("number is even");
}
	if(number % 2 != 0){ 
		System.out.print("number is odd");
}


} //main method close.
} // class ends.
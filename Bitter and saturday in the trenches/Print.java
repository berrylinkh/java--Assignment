// print cube and square

	import java.util.Scanner;
	public class Print{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter num1: ");
	int num1 = input.nextInt();
	
	int square = num1 * num1;
	int cube = num1 * num1 * num1;
	
	System.out.printf(" square is %d%n cube is %d%n ", square , cube);

} //main method close.
} // class ends.
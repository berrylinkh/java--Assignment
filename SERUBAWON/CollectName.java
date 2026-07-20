	import java.util.Scanner;
	public class CollectName{
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
 
		System.out.print("Enter name: ");
		String name = input.nextLine();

		System.out.printf("Hello, %s", name);
	}
}
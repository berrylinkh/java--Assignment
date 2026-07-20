//4.30 Right angle triangle
/* Psuedocode
1 collect an input for the length of the base of triangle
2 intitailise counter and condition for the for loop
3 initiate another counter inside the counter for each row count
4 print out result 
*/





import java.util.Scanner;

	public class RightAngleTriangle{
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("length of the base triangle: ");
	int baseTrinagle = input.nextInt();

	for(int counter = 0; counter <=10; counter++){
		for(int count = 1; count <= counter; count++){
			System.out.print("*");
}
		System.out.println();
  }
}

}
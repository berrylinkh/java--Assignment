//5.12 Divisible
/* Psuedocode
1. 
*/





import java.util.Scanner;

	public class DivisibleOne{
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);

	int number = 0;
	int sum = 0;

for(int counter = 3; counter <=30; counter+=3){
sum = sum + counter;
System.out.printf("number:%d%n ", counter);
}
System.out.printf("The sum:%d", sum);
  }
}
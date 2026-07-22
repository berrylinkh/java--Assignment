import java.util.Scanner;
public class  TaskTwo{
public static void main (String [] args) {
Scanner input = new Scanner(System.in);

	System.out.print("Enter number: ");
	int wholeNumber = input.nextInt();

	boolean sumResult = perfectNumber(wholeNumber);

	System.out.print( sumResult);

		}

	


public static Boolean perfectNumber(int number ){
		int sum =0;
		int count= 1;
	for(count =1; count <= number; count ++) {

	if (number % count ==0){
		sum = sum + number;
			}
		
		}
	if (sum == 0){
			return true;
		} else {
			return false;
			}	
	}
}
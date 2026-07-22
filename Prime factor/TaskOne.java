import java.util.Scanner;
public class  TaskOne{
public static void main (String [] args) {
Scanner input = new Scanner(System.in);

	System.out.print("Enter the number: ");
	int wholeNumber = input.nextInt();

	int sumResult = divideNumber(wholeNumber);

	System.out.print( sumResult);

		}

	


public static int divideNumber(int number){
		int sum =0;
		int divisionValue =2;
	for(int reader =1; reader <= number; reader ++) {

	if (number % divisionValue ==0){
	int numberTwo = number/divisionValue;
		number = numberTwo;
		sum +=divisionValue;
		}

	if (number % divisionValue != 0){
		divisionValue++;
			}
		}
			return sum;		
	}
}
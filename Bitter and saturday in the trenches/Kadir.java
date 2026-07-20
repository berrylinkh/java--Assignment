import java.util.Scanner;

	public class Kadir {
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);

	int largest = 0;
	int positiveCounter = 0;
	int negativeCounter = 0;

	//System.out.print("Enter your integer: ");
	//int number = input.nextInt();
	//largest = number;
	
int counter = 0;
	while(counter < 10){

	System.out.print("Enter your integer: ");
	int number = input.nextInt();
	largest = number;

	if(number < 0 ){
	negativeCounter++;
	}

	if(number > 0 ){
	positiveCounter++;
	}
	
	if(number > largest ){
	largest = number;	
	}
counter++;
}
	System.out.printf("negative Counter: %d%n, Positive Counter: %d%n, largest: %d%n", positiveCounter, negativeCounter, largest);

  }
}